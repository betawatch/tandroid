package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class z0 {
    public final /* synthetic */ int a;
    public int b;
    public String c;

    public int a() {
        String str = this.c;
        int i10 = this.b;
        this.b = i10 + 1;
        char charAt = str.charAt(i10);
        if (charAt < 55296) {
            return charAt;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        while (true) {
            int i13 = this.b;
            this.b = i13 + 1;
            char charAt2 = str.charAt(i13);
            if (charAt2 < 55296) {
                return (charAt2 << i12) | i11;
            }
            i11 |= (charAt2 & 8191) << i12;
            i12 += 13;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return this.b + ": " + this.c;
            default:
                return super.toString();
        }
    }

    public z0(String str) {
        this.a = 0;
        this.c = str;
        this.b = 0;
    }

    public z0(String str, int i10, Object[] objArr) {
        this.a = 2;
        this.c = String.format(str, objArr);
        this.b = i10;
    }

    public z0(int i10, String str) {
        this.a = 1;
        this.b = i10;
        this.c = str;
    }
}
