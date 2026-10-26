package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m1 {
    public static final void a(m1 m1Var, byte[] bArr, int i10) {
        try {
            rb.c cVar = new rb.c(bArr, i10);
            m1Var.b(cVar);
            ByteBuffer byteBuffer = (ByteBuffer) cVar.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract void b(rb.c cVar);

    public final int c() {
        int[] iArr;
        v1 v1Var = (v1) this;
        String str = v1Var.w;
        String str2 = v1Var.r;
        String str3 = v1Var.n;
        String str4 = v1Var.h;
        byte[] bArr = v1Var.e;
        long j10 = v1Var.a;
        int i10 = 0;
        int A = j10 != 0 ? rb.c.A(j10) + rb.c.C(1) : 0;
        w1[] w1VarArr = v1Var.d;
        if (w1VarArr != null && w1VarArr.length > 0) {
            int i11 = 0;
            while (true) {
                w1[] w1VarArr2 = v1Var.d;
                if (i11 >= w1VarArr2.length) {
                    break;
                }
                w1 w1Var = w1VarArr2[i11];
                i11++;
            }
        }
        byte[] bArr2 = l1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            A += rb.c.E(bArr.length) + bArr.length + rb.c.C(4);
        }
        if (!Arrays.equals(v1Var.f, bArr2)) {
            byte[] bArr3 = v1Var.f;
            A += rb.c.E(bArr3.length) + bArr3.length + rb.c.C(6);
        }
        if (str4 != null && !str4.equals("")) {
            A += rb.c.w(8, str4);
        }
        int i12 = v1Var.c;
        if (i12 != 0) {
            A += (i12 >= 0 ? rb.c.E(i12) : 10) + rb.c.C(11);
        }
        if (str3 != null && !str3.equals("")) {
            A += rb.c.w(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            A += rb.c.w(14, str2);
        }
        long j11 = v1Var.s;
        if (j11 != 180000) {
            A += rb.c.A((j11 >> 63) ^ (j11 << 1)) + rb.c.C(15);
        }
        long j12 = v1Var.b;
        if (j12 != 0) {
            A += rb.c.A(j12) + rb.c.C(17);
        }
        if (!Arrays.equals(v1Var.v, bArr2)) {
            byte[] bArr4 = v1Var.v;
            A += rb.c.E(bArr4.length) + bArr4.length + rb.c.C(18);
        }
        int[] iArr2 = v1Var.x;
        if (iArr2 != null && iArr2.length > 0) {
            int i13 = 0;
            while (true) {
                iArr = v1Var.x;
                if (i10 >= iArr.length) {
                    break;
                }
                int i14 = iArr[i10];
                i13 += i14 >= 0 ? rb.c.E(i14) : 10;
                i10++;
            }
            A = A + i13 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            A += rb.c.w(24, str);
        }
        return v1Var.y ? rb.c.C(25) + 1 + A : A;
    }

    public final m1 d() {
        m1 m1Var = (m1) super.clone();
        Object obj = n1.a;
        return m1Var;
    }

    public final String toString() {
        String valueOf;
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            l1.j(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            valueOf = String.valueOf(e.getMessage());
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
