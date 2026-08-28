package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class n1 {
    public static final o1 a;

    static {
        a = (l1.f && l1.e) ? new o1(1) : new o1(0);
    }

    public static int a(int i9, int i10, byte[] bArr) {
        byte b10 = bArr[i9 - 1];
        int i11 = i10 - i9;
        if (i11 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i11 == 1) {
            byte b11 = bArr[i9];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i9];
        byte b13 = bArr[i9 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }
}
