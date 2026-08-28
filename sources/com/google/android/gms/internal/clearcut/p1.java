package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class p1 {
    public static final void a(p1 p1Var, byte[] bArr, int i9) {
        try {
            xa.c cVar = new xa.c(bArr, i9);
            p1Var.b(cVar);
            ByteBuffer byteBuffer = (ByteBuffer) cVar.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public abstract void b(xa.c cVar);

    public final int c() {
        int[] iArr;
        y1 y1Var = (y1) this;
        String str = y1Var.w;
        String str2 = y1Var.r;
        String str3 = y1Var.n;
        String str4 = y1Var.h;
        byte[] bArr = y1Var.e;
        long j10 = y1Var.a;
        int i9 = 0;
        int U = j10 != 0 ? xa.c.U(j10) + xa.c.V(1) : 0;
        z1[] z1VarArr = y1Var.d;
        if (z1VarArr != null && z1VarArr.length > 0) {
            int i10 = 0;
            while (true) {
                z1[] z1VarArr2 = y1Var.d;
                if (i10 >= z1VarArr2.length) {
                    break;
                }
                z1 z1Var = z1VarArr2[i10];
                i10++;
            }
        }
        byte[] bArr2 = o1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            U += xa.c.W(bArr.length) + bArr.length + xa.c.V(4);
        }
        if (!Arrays.equals(y1Var.f, bArr2)) {
            byte[] bArr3 = y1Var.f;
            U += xa.c.W(bArr3.length) + bArr3.length + xa.c.V(6);
        }
        if (str4 != null && !str4.equals("")) {
            U += xa.c.P(8, str4);
        }
        int i11 = y1Var.c;
        if (i11 != 0) {
            U += (i11 >= 0 ? xa.c.W(i11) : 10) + xa.c.V(11);
        }
        if (str3 != null && !str3.equals("")) {
            U += xa.c.P(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            U += xa.c.P(14, str2);
        }
        long j11 = y1Var.s;
        if (j11 != 180000) {
            U += xa.c.U((j11 >> 63) ^ (j11 << 1)) + xa.c.V(15);
        }
        long j12 = y1Var.b;
        if (j12 != 0) {
            U += xa.c.U(j12) + xa.c.V(17);
        }
        if (!Arrays.equals(y1Var.v, bArr2)) {
            byte[] bArr4 = y1Var.v;
            U += xa.c.W(bArr4.length) + bArr4.length + xa.c.V(18);
        }
        int[] iArr2 = y1Var.x;
        if (iArr2 != null && iArr2.length > 0) {
            int i12 = 0;
            while (true) {
                iArr = y1Var.x;
                if (i9 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i9];
                i12 += i13 >= 0 ? xa.c.W(i13) : 10;
                i9++;
            }
            U = U + i12 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            U += xa.c.P(24, str);
        }
        return y1Var.y ? xa.c.V(25) + 1 + U : U;
    }

    public final p1 d() {
        p1 p1Var = (p1) super.clone();
        Object obj = q1.a;
        return p1Var;
    }

    public final String toString() {
        String valueOf;
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            o1.j(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e10) {
            valueOf = String.valueOf(e10.getMessage());
            if (valueOf.length() == 0) {
                str = new String("Error printing proto: ");
                return str;
            }
            return "Error printing proto: ".concat(valueOf);
        } catch (InvocationTargetException e11) {
            valueOf = String.valueOf(e11.getMessage());
            if (valueOf.length() == 0) {
                str = new String("Error printing proto: ");
                return str;
            }
            return "Error printing proto: ".concat(valueOf);
        }
    }
}
