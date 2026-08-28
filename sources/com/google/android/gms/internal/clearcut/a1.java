package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public final class a1 {
    public final /* synthetic */ int a;
    public int b;
    public String c;

    public int a() {
        String str = this.c;
        int i9 = this.b;
        this.b = i9 + 1;
        char charAt = str.charAt(i9);
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
            case 2:
                return this.b + ": " + this.c;
            default:
                return super.toString();
        }
    }

    public a1(String str) {
        this.a = 0;
        this.c = str;
        this.b = 0;
    }

    public a1(String str, int i9, Object[] objArr) {
        this.a = 2;
        this.c = String.format(str, objArr);
        this.b = i9;
    }

    public a1(int i9, String str) {
        this.a = 1;
        this.b = i9;
        this.c = str;
    }
}
