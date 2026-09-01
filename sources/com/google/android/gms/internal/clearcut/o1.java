package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class o1 {
    public static final void a(o1 o1Var, byte[] bArr, int i10) {
        try {
            o5.i iVar = new o5.i(bArr, i10);
            o1Var.b(iVar);
            ByteBuffer byteBuffer = (ByteBuffer) iVar.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e6) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e6);
        }
    }

    public abstract void b(o5.i iVar);

    public final int c() {
        int[] iArr;
        x1 x1Var = (x1) this;
        String str = x1Var.w;
        String str2 = x1Var.r;
        String str3 = x1Var.n;
        String str4 = x1Var.h;
        byte[] bArr = x1Var.e;
        long j10 = x1Var.a;
        int i10 = 0;
        int o02 = j10 != 0 ? o5.i.o0(j10) + o5.i.r0(1) : 0;
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
            o02 += o5.i.t0(bArr.length) + bArr.length + o5.i.r0(4);
        }
        if (!Arrays.equals(x1Var.f, bArr2)) {
            byte[] bArr3 = x1Var.f;
            o02 += o5.i.t0(bArr3.length) + bArr3.length + o5.i.r0(6);
        }
        if (str4 != null && !str4.equals("")) {
            o02 += o5.i.d0(8, str4);
        }
        int i12 = x1Var.c;
        if (i12 != 0) {
            o02 += (i12 >= 0 ? o5.i.t0(i12) : 10) + o5.i.r0(11);
        }
        if (str3 != null && !str3.equals("")) {
            o02 += o5.i.d0(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            o02 += o5.i.d0(14, str2);
        }
        long j11 = x1Var.s;
        if (j11 != 180000) {
            o02 += o5.i.o0((j11 >> 63) ^ (j11 << 1)) + o5.i.r0(15);
        }
        long j12 = x1Var.b;
        if (j12 != 0) {
            o02 += o5.i.o0(j12) + o5.i.r0(17);
        }
        if (!Arrays.equals(x1Var.v, bArr2)) {
            byte[] bArr4 = x1Var.v;
            o02 += o5.i.t0(bArr4.length) + bArr4.length + o5.i.r0(18);
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
                i13 += i14 >= 0 ? o5.i.t0(i14) : 10;
                i10++;
            }
            o02 = o02 + i13 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            o02 += o5.i.d0(24, str);
        }
        return x1Var.y ? o5.i.r0(25) + 1 + o02 : o02;
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
        } catch (IllegalAccessException e6) {
            valueOf = String.valueOf(e6.getMessage());
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
