package com.google.android.gms.internal.clearcut;

/* loaded from: classes.dex */
public abstract class k1 {
    public static final l1 a;

    static {
        a = (i1.f && i1.e) ? new l1(1) : new l1(0);
    }

    public static int a(int i3, int i10, byte[] bArr) {
        byte b10 = bArr[i3 - 1];
        int i11 = i10 - i3;
        if (i11 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i11 == 1) {
            byte b11 = bArr[i3];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i3];
        byte b13 = bArr[i3 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }
}
