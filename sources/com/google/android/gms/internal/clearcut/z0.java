package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class z0 {
    public final /* synthetic */ int a;
    public int b;
    public String c;

    public int a() {
        String str = this.c;
        int i7 = this.b;
        this.b = i7 + 1;
        char charAt = str.charAt(i7);
        if (charAt < 55296) {
            return charAt;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        while (true) {
            int i12 = this.b;
            this.b = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                return (charAt2 << i11) | i10;
            }
            i10 |= (charAt2 & 8191) << i11;
            i11 += 13;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.b + ": " + this.c;
            case 4:
                return this.c;
            default:
                return super.toString();
        }
    }

    public z0(String str, int i7) {
        this.a = i7;
        switch (i7) {
            case 4:
                String[] split = str.split(" +", 3);
                if (split.length < 2) {
                    throw new IllegalArgumentException();
                }
                String str2 = split[0];
                this.b = Integer.parseInt(split[1]);
                if (split.length == 3) {
                    String str3 = split[2];
                }
                this.c = str;
                return;
            default:
                this.c = str;
                this.b = 0;
                return;
        }
    }

    public z0(int i7, String str, Object[] objArr) {
        this.a = 1;
        this.c = String.format(str, objArr);
        this.b = i7;
    }

    public z0(int i7, String str) {
        this.a = 3;
        this.b = i7;
        this.c = str;
    }
}
