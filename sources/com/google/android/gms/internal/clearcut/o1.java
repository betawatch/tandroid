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
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
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
        int P = j3 != 0 ? a6.m.P(j3) + a6.m.Q(1) : 0;
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
            P += a6.m.R(bArr.length) + bArr.length + a6.m.Q(4);
        }
        if (!Arrays.equals(x1Var.f, bArr2)) {
            byte[] bArr3 = x1Var.f;
            P += a6.m.R(bArr3.length) + bArr3.length + a6.m.Q(6);
        }
        if (str4 != null && !str4.equals("")) {
            P += a6.m.I(8, str4);
        }
        int i12 = x1Var.c;
        if (i12 != 0) {
            P += (i12 >= 0 ? a6.m.R(i12) : 10) + a6.m.Q(11);
        }
        if (str3 != null && !str3.equals("")) {
            P += a6.m.I(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            P += a6.m.I(14, str2);
        }
        long j10 = x1Var.s;
        if (j10 != 180000) {
            P += a6.m.P((j10 >> 63) ^ (j10 << 1)) + a6.m.Q(15);
        }
        long j11 = x1Var.b;
        if (j11 != 0) {
            P += a6.m.P(j11) + a6.m.Q(17);
        }
        if (!Arrays.equals(x1Var.v, bArr2)) {
            byte[] bArr4 = x1Var.v;
            P += a6.m.R(bArr4.length) + bArr4.length + a6.m.Q(18);
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
                i13 += i14 >= 0 ? a6.m.R(i14) : 10;
                i10++;
            }
            P = P + i13 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            P += a6.m.I(24, str);
        }
        return x1Var.y ? a6.m.Q(25) + 1 + P : P;
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
        } catch (IllegalAccessException e) {
            valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                str = new String("Error printing proto: ");
                return str;
            }
            return "Error printing proto: ".concat(valueOf);
        } catch (InvocationTargetException e7) {
            valueOf = String.valueOf(e7.getMessage());
            if (valueOf.length() == 0) {
                str = new String("Error printing proto: ");
                return str;
            }
            return "Error printing proto: ".concat(valueOf);
        }
    }
}
