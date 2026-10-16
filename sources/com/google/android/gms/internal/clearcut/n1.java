package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class n1 {
    public static final void b(n1 n1Var, byte[] bArr, int i10) {
        try {
            a6.i iVar = new a6.i(bArr, i10);
            n1Var.a(iVar);
            ByteBuffer byteBuffer = (ByteBuffer) iVar.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract void a(a6.i iVar);

    public final int c() {
        int[] iArr;
        w1 w1Var = (w1) this;
        String str = w1Var.w;
        String str2 = w1Var.r;
        String str3 = w1Var.n;
        String str4 = w1Var.h;
        byte[] bArr = w1Var.e;
        long j10 = w1Var.a;
        int i10 = 0;
        int F = j10 != 0 ? a6.i.F(j10) + a6.i.G(1) : 0;
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
            F += a6.i.I(bArr.length) + bArr.length + a6.i.G(4);
        }
        if (!Arrays.equals(w1Var.f, bArr2)) {
            byte[] bArr3 = w1Var.f;
            F += a6.i.I(bArr3.length) + bArr3.length + a6.i.G(6);
        }
        if (str4 != null && !str4.equals("")) {
            F += a6.i.B(8, str4);
        }
        int i12 = w1Var.c;
        if (i12 != 0) {
            F += (i12 >= 0 ? a6.i.I(i12) : 10) + a6.i.G(11);
        }
        if (str3 != null && !str3.equals("")) {
            F += a6.i.B(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            F += a6.i.B(14, str2);
        }
        long j11 = w1Var.s;
        if (j11 != 180000) {
            F += a6.i.F((j11 >> 63) ^ (j11 << 1)) + a6.i.G(15);
        }
        long j12 = w1Var.b;
        if (j12 != 0) {
            F += a6.i.F(j12) + a6.i.G(17);
        }
        if (!Arrays.equals(w1Var.v, bArr2)) {
            byte[] bArr4 = w1Var.v;
            F += a6.i.I(bArr4.length) + bArr4.length + a6.i.G(18);
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
                i13 += i14 >= 0 ? a6.i.I(i14) : 10;
                i10++;
            }
            F = F + i13 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            F += a6.i.B(24, str);
        }
        return w1Var.y ? a6.i.G(25) + 1 + F : F;
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
