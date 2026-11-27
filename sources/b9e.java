// default package

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class b9e {
    public static final void b(b9e b9eVar, byte[] bArr, int i) {
        try {
            ve9 ve9Var = new ve9(i, bArr);
            b9eVar.a(ve9Var);
            ByteBuffer byteBuffer = (ByteBuffer) ve9Var.b;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e) {
            grb.j("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract void a(ve9 ve9Var);

    public final int c() {
        int[] iArr;
        khe kheVar = (khe) this;
        String str = kheVar.x;
        String str2 = kheVar.r;
        String str3 = kheVar.n;
        String str4 = kheVar.h;
        byte[] bArr = kheVar.e;
        long j = kheVar.a;
        int i = 0;
        int p0 = j != 0 ? ve9.p0(j) + ve9.q0(1) : 0;
        phe[] pheVarArr = kheVar.d;
        if (pheVarArr != null && pheVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                phe[] pheVarArr2 = kheVar.d;
                if (i2 >= pheVarArr2.length) {
                    break;
                }
                phe pheVar = pheVarArr2[i2];
                i2++;
            }
        }
        byte[] bArr2 = njd.b;
        if (!Arrays.equals(bArr, bArr2)) {
            p0 += ve9.r0(bArr.length) + bArr.length + ve9.q0(4);
        }
        if (!Arrays.equals(kheVar.f, bArr2)) {
            byte[] bArr3 = kheVar.f;
            p0 += ve9.r0(bArr3.length) + bArr3.length + ve9.q0(6);
        }
        if (str4 != null && !str4.equals("")) {
            p0 += ve9.l0(8, str4);
        }
        int i3 = kheVar.c;
        if (i3 != 0) {
            p0 += (i3 >= 0 ? ve9.r0(i3) : 10) + ve9.q0(11);
        }
        if (str3 != null && !str3.equals("")) {
            p0 += ve9.l0(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            p0 += ve9.l0(14, str2);
        }
        long j2 = kheVar.s;
        if (j2 != 180000) {
            p0 += ve9.p0((j2 << 1) ^ (j2 >> 63)) + ve9.q0(15);
        }
        long j3 = kheVar.b;
        if (j3 != 0) {
            p0 += ve9.p0(j3) + ve9.q0(17);
        }
        if (!Arrays.equals(kheVar.w, bArr2)) {
            byte[] bArr4 = kheVar.w;
            p0 += ve9.r0(bArr4.length) + bArr4.length + ve9.q0(18);
        }
        int[] iArr2 = kheVar.y;
        if (iArr2 != null && iArr2.length > 0) {
            int i4 = 0;
            while (true) {
                iArr = kheVar.y;
                if (i >= iArr.length) {
                    break;
                }
                int i5 = iArr[i];
                i4 += i5 >= 0 ? ve9.r0(i5) : 10;
                i++;
            }
            p0 = p0 + i4 + (iArr.length << 1);
        }
        if (str != null && !str.equals("")) {
            p0 += ve9.l0(24, str);
        }
        return kheVar.E ? ve9.q0(25) + 1 + p0 : p0;
    }

    public final b9e d() {
        b9e b9eVar = (b9e) super.clone();
        Object obj = z9e.a;
        return b9eVar;
    }

    public final String toString() {
        String valueOf;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            s6f.a(null, this, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                return new String("Error printing proto: ");
            }
            return "Error printing proto: ".concat(valueOf);
        } catch (InvocationTargetException e2) {
            valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() == 0) {
                return new String("Error printing proto: ");
            }
            return "Error printing proto: ".concat(valueOf);
        }
    }
}
