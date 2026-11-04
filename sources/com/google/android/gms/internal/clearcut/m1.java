package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m1 {
    public static final void b(m1 m1Var, byte[] bArr, int i3) {
        try {
            bb.c cVar = new bb.c(bArr, i3);
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

    public abstract void a(bb.c cVar);

    public final int c() {
        int[] iArr;
        v1 v1Var = (v1) this;
        String str = v1Var.x;
        String str2 = v1Var.r;
        String str3 = v1Var.n;
        String str4 = v1Var.h;
        byte[] bArr = v1Var.e;
        long j10 = v1Var.a;
        int i3 = 0;
        int t10 = j10 != 0 ? bb.c.t(j10) + bb.c.w(1) : 0;
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
            t10 += bb.c.x(bArr.length) + bArr.length + bb.c.w(4);
        }
        if (!Arrays.equals(v1Var.f, bArr2)) {
            byte[] bArr3 = v1Var.f;
            t10 += bb.c.x(bArr3.length) + bArr3.length + bb.c.w(6);
        }
        if (str4 != null && !str4.equals("")) {
            t10 += bb.c.n(8, str4);
        }
        int i11 = v1Var.c;
        if (i11 != 0) {
            t10 += (i11 >= 0 ? bb.c.x(i11) : 10) + bb.c.w(11);
        }
        if (str3 != null && !str3.equals("")) {
            t10 += bb.c.n(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            t10 += bb.c.n(14, str2);
        }
        long j11 = v1Var.s;
        if (j11 != 180000) {
            t10 += bb.c.t((j11 >> 63) ^ (j11 << 1)) + bb.c.w(15);
        }
        long j12 = v1Var.b;
        if (j12 != 0) {
            t10 += bb.c.t(j12) + bb.c.w(17);
        }
        if (!Arrays.equals(v1Var.w, bArr2)) {
            byte[] bArr4 = v1Var.w;
            t10 += bb.c.x(bArr4.length) + bArr4.length + bb.c.w(18);
        }
        int[] iArr2 = v1Var.y;
        if (iArr2 != null && iArr2.length > 0) {
            int i12 = 0;
            while (true) {
                iArr = v1Var.y;
                if (i3 >= iArr.length) {
                    break;
                }
                int i13 = iArr[i3];
                i12 += i13 >= 0 ? bb.c.x(i13) : 10;
                i3++;
            }
            t10 = t10 + i12 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            t10 += bb.c.n(24, str);
        }
        return v1Var.E ? bb.c.w(25) + 1 + t10 : t10;
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
