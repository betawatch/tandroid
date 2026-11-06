package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class n1 {
    public static final void b(n1 n1Var, byte[] bArr, int i7) {
        try {
            aa.n nVar = new aa.n(bArr, i7);
            n1Var.a(nVar);
            ByteBuffer byteBuffer = (ByteBuffer) nVar.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public abstract void a(aa.n nVar);

    public final int c() {
        int[] iArr;
        w1 w1Var = (w1) this;
        String str = w1Var.x;
        String str2 = w1Var.r;
        String str3 = w1Var.n;
        String str4 = w1Var.h;
        byte[] bArr = w1Var.e;
        long j3 = w1Var.a;
        int i7 = 0;
        int A = j3 != 0 ? aa.n.A(j3) + aa.n.B(1) : 0;
        x1[] x1VarArr = w1Var.d;
        if (x1VarArr != null && x1VarArr.length > 0) {
            int i10 = 0;
            while (true) {
                x1[] x1VarArr2 = w1Var.d;
                if (i10 >= x1VarArr2.length) {
                    break;
                }
                x1 x1Var = x1VarArr2[i10];
                i10++;
            }
        }
        byte[] bArr2 = m1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            A += aa.n.C(bArr.length) + bArr.length + aa.n.B(4);
        }
        if (!Arrays.equals(w1Var.f, bArr2)) {
            byte[] bArr3 = w1Var.f;
            A += aa.n.C(bArr3.length) + bArr3.length + aa.n.B(6);
        }
        if (str4 != null && !str4.equals("")) {
            A += aa.n.v(8, str4);
        }
        int i11 = w1Var.c;
        if (i11 != 0) {
            A += (i11 >= 0 ? aa.n.C(i11) : 10) + aa.n.B(11);
        }
        if (str3 != null && !str3.equals("")) {
            A += aa.n.v(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            A += aa.n.v(14, str2);
        }
        long j10 = w1Var.s;
        if (j10 != 180000) {
            A += aa.n.A((j10 >> 63) ^ (j10 << 1)) + aa.n.B(15);
        }
        long j11 = w1Var.b;
        if (j11 != 0) {
            A += aa.n.A(j11) + aa.n.B(17);
        }
        if (!Arrays.equals(w1Var.w, bArr2)) {
            byte[] bArr4 = w1Var.w;
            A += aa.n.C(bArr4.length) + bArr4.length + aa.n.B(18);
        }
        int[] iArr2 = w1Var.y;
        if (iArr2 != null && iArr2.length > 0) {
            int i12 = 0;
            while (true) {
                iArr = w1Var.y;
                if (i7 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i7];
                i12 += i13 >= 0 ? aa.n.C(i13) : 10;
                i7++;
            }
            A = A + i12 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            A += aa.n.v(24, str);
        }
        return w1Var.D ? aa.n.B(25) + 1 + A : A;
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
