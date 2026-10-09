package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class n1 {
    public static final void a(n1 n1Var, byte[] bArr, int i10) {
        try {
            xa.d dVar = new xa.d(bArr, i10);
            n1Var.b(dVar);
            ByteBuffer byteBuffer = (ByteBuffer) dVar.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e7) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e7);
        }
    }

    public abstract void b(xa.d dVar);

    public final int c() {
        int[] iArr;
        w1 w1Var = (w1) this;
        String str = w1Var.w;
        String str2 = w1Var.r;
        String str3 = w1Var.n;
        String str4 = w1Var.h;
        byte[] bArr = w1Var.e;
        long j3 = w1Var.a;
        int i10 = 0;
        int H = j3 != 0 ? xa.d.H(j3) + xa.d.L(1) : 0;
        x1[] x1VarArr = w1Var.d;
        if (x1VarArr != null && x1VarArr.length > 0) {
            int i11 = 0;
            while (true) {
                x1[] x1VarArr2 = w1Var.d;
                if (i11 >= x1VarArr2.length) {
                    break;
                }
                x1 x1Var = x1VarArr2[i11];
                i11++;
            }
        }
        byte[] bArr2 = m1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            H += xa.d.N(bArr.length) + bArr.length + xa.d.L(4);
        }
        if (!Arrays.equals(w1Var.f, bArr2)) {
            byte[] bArr3 = w1Var.f;
            H += xa.d.N(bArr3.length) + bArr3.length + xa.d.L(6);
        }
        if (str4 != null && !str4.equals("")) {
            H += xa.d.z(8, str4);
        }
        int i12 = w1Var.c;
        if (i12 != 0) {
            H += (i12 >= 0 ? xa.d.N(i12) : 10) + xa.d.L(11);
        }
        if (str3 != null && !str3.equals("")) {
            H += xa.d.z(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            H += xa.d.z(14, str2);
        }
        long j10 = w1Var.s;
        if (j10 != 180000) {
            H += xa.d.H((j10 >> 63) ^ (j10 << 1)) + xa.d.L(15);
        }
        long j11 = w1Var.b;
        if (j11 != 0) {
            H += xa.d.H(j11) + xa.d.L(17);
        }
        if (!Arrays.equals(w1Var.v, bArr2)) {
            byte[] bArr4 = w1Var.v;
            H += xa.d.N(bArr4.length) + bArr4.length + xa.d.L(18);
        }
        int[] iArr2 = w1Var.x;
        if (iArr2 != null && iArr2.length > 0) {
            int i13 = 0;
            while (true) {
                iArr = w1Var.x;
                if (i10 >= iArr.length) {
                    break;
                }
                int i14 = iArr[i10];
                i13 += i14 >= 0 ? xa.d.N(i14) : 10;
                i10++;
            }
            H = H + i13 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            H += xa.d.z(24, str);
        }
        return w1Var.y ? xa.d.L(25) + 1 + H : H;
    }

    public final n1 d() {
        n1 n1Var = (n1) super.clone();
        Object obj = o1.a;
        return n1Var;
    }

    public final String toString() {
        String valueOf;
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            m1.j(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e7) {
            valueOf = String.valueOf(e7.getMessage());
            if (valueOf.length() == 0) {
                str = new String("Error printing proto: ");
                return str;
            }
            return "Error printing proto: ".concat(valueOf);
        } catch (InvocationTargetException e10) {
            valueOf = String.valueOf(e10.getMessage());
            if (valueOf.length() == 0) {
                str = new String("Error printing proto: ");
                return str;
            }
            return "Error printing proto: ".concat(valueOf);
        }
    }
}
