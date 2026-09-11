package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class n1 {
    public static final void b(n1 n1Var, byte[] bArr, int i10) {
        try {
            a4.m mVar = new a4.m(bArr, i10);
            n1Var.a(mVar);
            ByteBuffer byteBuffer = (ByteBuffer) mVar.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e7) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e7);
        }
    }

    public abstract void a(a4.m mVar);

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
        int w02 = j3 != 0 ? a4.m.w0(j3) + a4.m.x0(1) : 0;
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
            w02 += a4.m.y0(bArr.length) + bArr.length + a4.m.x0(4);
        }
        if (!Arrays.equals(w1Var.f, bArr2)) {
            byte[] bArr3 = w1Var.f;
            w02 += a4.m.y0(bArr3.length) + bArr3.length + a4.m.x0(6);
        }
        if (str4 != null && !str4.equals("")) {
            w02 += a4.m.s0(8, str4);
        }
        int i12 = w1Var.c;
        if (i12 != 0) {
            w02 += (i12 >= 0 ? a4.m.y0(i12) : 10) + a4.m.x0(11);
        }
        if (str3 != null && !str3.equals("")) {
            w02 += a4.m.s0(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            w02 += a4.m.s0(14, str2);
        }
        long j10 = w1Var.s;
        if (j10 != 180000) {
            w02 += a4.m.w0((j10 >> 63) ^ (j10 << 1)) + a4.m.x0(15);
        }
        long j11 = w1Var.b;
        if (j11 != 0) {
            w02 += a4.m.w0(j11) + a4.m.x0(17);
        }
        if (!Arrays.equals(w1Var.v, bArr2)) {
            byte[] bArr4 = w1Var.v;
            w02 += a4.m.y0(bArr4.length) + bArr4.length + a4.m.x0(18);
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
                i13 += i14 >= 0 ? a4.m.y0(i14) : 10;
                i10++;
            }
            w02 = w02 + i13 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            w02 += a4.m.s0(24, str);
        }
        return w1Var.y ? a4.m.x0(25) + 1 + w02 : w02;
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
