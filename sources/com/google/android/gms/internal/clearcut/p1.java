package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class p1 {
    public static final void b(p1 p1Var, byte[] bArr, int i10) {
        try {
            ag.o1 o1Var = new ag.o1(bArr, i10);
            p1Var.a(o1Var);
            ByteBuffer byteBuffer = (ByteBuffer) o1Var.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public abstract void a(ag.o1 o1Var);

    public final int c() {
        int[] iArr;
        y1 y1Var = (y1) this;
        String str = y1Var.w;
        String str2 = y1Var.r;
        String str3 = y1Var.n;
        String str4 = y1Var.h;
        byte[] bArr = y1Var.e;
        long j10 = y1Var.a;
        int i10 = 0;
        int C = j10 != 0 ? ag.o1.C(j10) + ag.o1.E(1) : 0;
        z1[] z1VarArr = y1Var.d;
        if (z1VarArr != null && z1VarArr.length > 0) {
            int i11 = 0;
            while (true) {
                z1[] z1VarArr2 = y1Var.d;
                if (i11 >= z1VarArr2.length) {
                    break;
                }
                z1 z1Var = z1VarArr2[i11];
                i11++;
            }
        }
        byte[] bArr2 = o1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            C += ag.o1.F(bArr.length) + bArr.length + ag.o1.E(4);
        }
        if (!Arrays.equals(y1Var.f, bArr2)) {
            byte[] bArr3 = y1Var.f;
            C += ag.o1.F(bArr3.length) + bArr3.length + ag.o1.E(6);
        }
        if (str4 != null && !str4.equals("")) {
            C += ag.o1.w(8, str4);
        }
        int i12 = y1Var.c;
        if (i12 != 0) {
            C += (i12 >= 0 ? ag.o1.F(i12) : 10) + ag.o1.E(11);
        }
        if (str3 != null && !str3.equals("")) {
            C += ag.o1.w(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            C += ag.o1.w(14, str2);
        }
        long j11 = y1Var.s;
        if (j11 != 180000) {
            C += ag.o1.C((j11 >> 63) ^ (j11 << 1)) + ag.o1.E(15);
        }
        long j12 = y1Var.b;
        if (j12 != 0) {
            C += ag.o1.C(j12) + ag.o1.E(17);
        }
        if (!Arrays.equals(y1Var.v, bArr2)) {
            byte[] bArr4 = y1Var.v;
            C += ag.o1.F(bArr4.length) + bArr4.length + ag.o1.E(18);
        }
        int[] iArr2 = y1Var.x;
        if (iArr2 != null && iArr2.length > 0) {
            int i13 = 0;
            while (true) {
                iArr = y1Var.x;
                if (i10 >= iArr.length) {
                    break;
                }
                int i14 = iArr[i10];
                i13 += i14 >= 0 ? ag.o1.F(i14) : 10;
                i10++;
            }
            C = C + i13 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            C += ag.o1.w(24, str);
        }
        return y1Var.y ? ag.o1.E(25) + 1 + C : C;
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
