package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class o1 {
    public static final void a(o1 o1Var, byte[] bArr, int i10) {
        try {
            k6.h hVar = new k6.h(bArr, i10);
            o1Var.b(hVar);
            ByteBuffer byteBuffer = (ByteBuffer) hVar.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract void b(k6.h hVar);

    public final int c() {
        int[] iArr;
        x1 x1Var = (x1) this;
        String str = x1Var.x;
        String str2 = x1Var.r;
        String str3 = x1Var.n;
        String str4 = x1Var.h;
        byte[] bArr = x1Var.e;
        long j10 = x1Var.a;
        int i10 = 0;
        int T = j10 != 0 ? k6.h.T(j10) + k6.h.U(1) : 0;
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
            T += k6.h.V(bArr.length) + bArr.length + k6.h.U(4);
        }
        if (!Arrays.equals(x1Var.f, bArr2)) {
            byte[] bArr3 = x1Var.f;
            T += k6.h.V(bArr3.length) + bArr3.length + k6.h.U(6);
        }
        if (str4 != null && !str4.equals("")) {
            T += k6.h.O(8, str4);
        }
        int i12 = x1Var.c;
        if (i12 != 0) {
            T += (i12 >= 0 ? k6.h.V(i12) : 10) + k6.h.U(11);
        }
        if (str3 != null && !str3.equals("")) {
            T += k6.h.O(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            T += k6.h.O(14, str2);
        }
        long j11 = x1Var.s;
        if (j11 != 180000) {
            T += k6.h.T((j11 >> 63) ^ (j11 << 1)) + k6.h.U(15);
        }
        long j12 = x1Var.b;
        if (j12 != 0) {
            T += k6.h.T(j12) + k6.h.U(17);
        }
        if (!Arrays.equals(x1Var.w, bArr2)) {
            byte[] bArr4 = x1Var.w;
            T += k6.h.V(bArr4.length) + bArr4.length + k6.h.U(18);
        }
        int[] iArr2 = x1Var.y;
        if (iArr2 != null && iArr2.length > 0) {
            int i13 = 0;
            while (true) {
                iArr = x1Var.y;
                if (i10 >= iArr.length) {
                    break;
                }
                int i14 = iArr[i10];
                i13 += i14 >= 0 ? k6.h.V(i14) : 10;
                i10++;
            }
            T = T + i13 + (iArr.length * 2);
        }
        if (str != null && !str.equals("")) {
            T += k6.h.O(24, str);
        }
        return x1Var.D ? k6.h.U(25) + 1 + T : T;
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
