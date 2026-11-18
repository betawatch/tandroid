package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m1 {
    public static final void b(m1 m1Var, byte[] bArr, int i7) {
        try {
            cb.c cVar = new cb.c(bArr, i7);
            m1Var.a(cVar);
            ByteBuffer byteBuffer = (ByteBuffer) cVar.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public abstract void a(cb.c cVar);

    public final int c() {
        int[] iArr;
        v1 v1Var = (v1) this;
        String str = v1Var.x;
        String str2 = v1Var.r;
        String str3 = v1Var.n;
        String str4 = v1Var.h;
        byte[] bArr = v1Var.e;
        long j3 = v1Var.a;
        int i7 = 0;
        int z10 = j3 != 0 ? cb.c.z(j3) + cb.c.B(1) : 0;
        w1[] w1VarArr = v1Var.d;
        if (w1VarArr != null && w1VarArr.length > 0) {
            int i10 = 0;
            while (true) {
                w1[] w1VarArr2 = v1Var.d;
                if (i10 >= w1VarArr2.length) {
                    break;
                }
                w1 w1Var = w1VarArr2[i10];
                i10++;
            }
        }
        byte[] bArr2 = l1.d;
        if (!Arrays.equals(bArr, bArr2)) {
            z10 += cb.c.C(bArr.length) + bArr.length + cb.c.B(4);
        }
        if (!Arrays.equals(v1Var.f, bArr2)) {
            byte[] bArr3 = v1Var.f;
            z10 += cb.c.C(bArr3.length) + bArr3.length + cb.c.B(6);
        }
        if (str4 != null && !str4.equals("")) {
            z10 += cb.c.v(8, str4);
        }
        int i11 = v1Var.c;
        if (i11 != 0) {
            z10 += (i11 >= 0 ? cb.c.C(i11) : 10) + cb.c.B(11);
        }
        if (str3 != null && !str3.equals("")) {
            z10 += cb.c.v(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            z10 += cb.c.v(14, str2);
        }
        long j10 = v1Var.s;
        if (j10 != 180000) {
            z10 += cb.c.z((j10 >> 63) ^ (j10 << 1)) + cb.c.B(15);
        }
        long j11 = v1Var.b;
        if (j11 != 0) {
            z10 += cb.c.z(j11) + cb.c.B(17);
        }
        if (!Arrays.equals(v1Var.w, bArr2)) {
            byte[] bArr4 = v1Var.w;
            z10 += cb.c.C(bArr4.length) + bArr4.length + cb.c.B(18);
        }
        int[] iArr2 = v1Var.y;
        if (iArr2 != null && iArr2.length > 0) {
            int i12 = 0;
            while (true) {
                iArr = v1Var.y;
                if (i7 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i7];
                i12 += i13 >= 0 ? cb.c.C(i13) : 10;
                i7++;
            }
            z10 = z10 + i12 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            z10 += cb.c.v(24, str);
        }
        return v1Var.E ? cb.c.B(25) + 1 + z10 : z10;
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
