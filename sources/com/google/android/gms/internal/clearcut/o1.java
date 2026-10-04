package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class o1 {
    public static final void b(o1 o1Var, byte[] bArr, int i10) {
        try {
            a6.m mVar = new a6.m(bArr, i10);
            o1Var.a(mVar);
            ByteBuffer byteBuffer = (ByteBuffer) mVar.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e7) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e7);
        }
    }

    public abstract void a(a6.m mVar);

    public final int c() {
        int[] iArr;
        x1 x1Var = (x1) this;
        String str = x1Var.w;
        String str2 = x1Var.r;
        String str3 = x1Var.n;
        String str4 = x1Var.h;
        byte[] bArr = x1Var.e;
        long j3 = x1Var.a;
        int i10 = 0;
        int U = j3 != 0 ? a6.m.U(j3) + a6.m.V(1) : 0;
        y1[] y1VarArr = x1Var.d;
        if (y1VarArr != null && y1VarArr.length > 0) {
            int i11 = 0;
            while (true) {
                y1[] y1VarArr2 = x1Var.d;
                if (i11 >= y1VarArr2.length) {
                    break;
                }
                y1 y1Var = y1VarArr2[i11];
                i11++;
            }
        }
        byte[] bArr2 = n1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            U += a6.m.X(bArr.length) + bArr.length + a6.m.V(4);
        }
        if (!Arrays.equals(x1Var.f, bArr2)) {
            byte[] bArr3 = x1Var.f;
            U += a6.m.X(bArr3.length) + bArr3.length + a6.m.V(6);
        }
        if (str4 != null && !str4.equals("")) {
            U += a6.m.M(8, str4);
        }
        int i12 = x1Var.c;
        if (i12 != 0) {
            U += (i12 >= 0 ? a6.m.X(i12) : 10) + a6.m.V(11);
        }
        if (str3 != null && !str3.equals("")) {
            U += a6.m.M(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            U += a6.m.M(14, str2);
        }
        long j10 = x1Var.s;
        if (j10 != 180000) {
            U += a6.m.U((j10 >> 63) ^ (j10 << 1)) + a6.m.V(15);
        }
        long j11 = x1Var.b;
        if (j11 != 0) {
            U += a6.m.U(j11) + a6.m.V(17);
        }
        if (!Arrays.equals(x1Var.v, bArr2)) {
            byte[] bArr4 = x1Var.v;
            U += a6.m.X(bArr4.length) + bArr4.length + a6.m.V(18);
        }
        int[] iArr2 = x1Var.x;
        if (iArr2 != null && iArr2.length > 0) {
            int i13 = 0;
            while (true) {
                iArr = x1Var.x;
                if (i10 >= iArr.length) {
                    break;
                }
                int i14 = iArr[i10];
                i13 += i14 >= 0 ? a6.m.X(i14) : 10;
                i10++;
            }
            U = U + i13 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            U += a6.m.M(24, str);
        }
        return x1Var.y ? a6.m.V(25) + 1 + U : U;
    }

    public final o1 d() {
        o1 o1Var = (o1) super.clone();
        Object obj = p1.a;
        return o1Var;
    }

    public final String toString() {
        String valueOf;
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            n1.j(null, this, new StringBuffer(), stringBuffer);
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
