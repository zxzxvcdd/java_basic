package com.spring.oop.inherit;

public class Warrior extends Player {

    private int rage;

    public Warrior(){
        System.out.println("Warrior 기본 생성자 호출");
    }

    public Warrior(String nickName) {
        super(nickName);
        System.out.println("Warrior 생성자 호출!");
        this.rage = 100;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("분노 게이지 : " + rage);
    }
}
