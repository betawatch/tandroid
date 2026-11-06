package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class l1 {
    public static final m1 a;

    static {
        a = (j1.f && j1.e) ? new m1(1) : new m1(0);
    }

    public static int a(int i7, int i10, byte[] bArr) {
        byte b10 = bArr[i7 - 1];
        int i11 = i10 - i7;
        if (i11 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i11 == 1) {
            byte b11 = bArr[i7];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i7];
        byte b13 = bArr[i7 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }
}
