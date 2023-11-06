package com.example.demo.domain.dto;

import com.example.demo.domain.entity.User;
import lombok.Data;

@Data
public class UserDto {

    private String email;
    private String password;

    private String nickname;
    private String name;
    private String phone;
    private String birth;
    private String zipcode;
    private String addr1;
    private String addr2;
    private String role;
    private String profile;

    private String provider;
    private String providerId;

    public static User dtoToEntity(UserDto dto){
        User user = User.builder()
                .email(dto.getEmail())
                .password(dto.getPassword())
                .nickname(dto.getNickname())
                .name(dto.getName())
                .phone(dto.getPhone())
                .birth(dto.getBirth())
                .zipcode(dto.getZipcode())
                .addr1(dto.getAddr1())
                .addr2(dto.getAddr2())
                .role(dto.getRole())
                .profile(dto.getProfile())
                .build();
        return user;
    }
}
