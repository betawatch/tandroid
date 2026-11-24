// default package

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class o6e {
    public static final void b(o6e o6eVar, byte[] bArr, int i) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
            und undVar = new und();
            undVar.a = wrap;
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            o6eVar.a(undVar);
            ByteBuffer byteBuffer = (ByteBuffer) undVar.a;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e) {
            rjb.k("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract void a(und undVar);

    public final int c() {
        int[] iArr;
        uee ueeVar = (uee) this;
        String str = ueeVar.x;
        String str2 = ueeVar.r;
        String str3 = ueeVar.n;
        String str4 = ueeVar.h;
        byte[] bArr = ueeVar.e;
        long j = ueeVar.a;
        int i = 0;
        int k = j != 0 ? und.k(j) + und.l(1) : 0;
        zee[] zeeVarArr = ueeVar.d;
        if (zeeVarArr != null && zeeVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zee[] zeeVarArr2 = ueeVar.d;
                if (i2 >= zeeVarArr2.length) {
                    break;
                }
                zee zeeVar = zeeVarArr2[i2];
                i2++;
            }
        }
        byte[] bArr2 = xgd.b;
        if (!Arrays.equals(bArr, bArr2)) {
            k += und.n(bArr.length) + bArr.length + und.l(4);
        }
        if (!Arrays.equals(ueeVar.f, bArr2)) {
            byte[] bArr3 = ueeVar.f;
            k += und.n(bArr3.length) + bArr3.length + und.l(6);
        }
        if (str4 != null && !str4.equals("")) {
            k += und.g(8, str4);
        }
        int i3 = ueeVar.c;
        if (i3 != 0) {
            k += (i3 >= 0 ? und.n(i3) : 10) + und.l(11);
        }
        if (str3 != null && !str3.equals("")) {
            k += und.g(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            k += und.g(14, str2);
        }
        long j2 = ueeVar.s;
        if (j2 != 180000) {
            k += und.k((j2 << 1) ^ (j2 >> 63)) + und.l(15);
        }
        long j3 = ueeVar.b;
        if (j3 != 0) {
            k += und.k(j3) + und.l(17);
        }
        if (!Arrays.equals(ueeVar.w, bArr2)) {
            byte[] bArr4 = ueeVar.w;
            k += und.n(bArr4.length) + bArr4.length + und.l(18);
        }
        int[] iArr2 = ueeVar.y;
        if (iArr2 != null && iArr2.length > 0) {
            int i4 = 0;
            while (true) {
                iArr = ueeVar.y;
                if (i >= iArr.length) {
                    break;
                }
                int i5 = iArr[i];
                i4 += i5 >= 0 ? und.n(i5) : 10;
                i++;
            }
            k = k + i4 + (iArr.length << 1);
        }
        if (str != null && !str.equals("")) {
            k += und.g(24, str);
        }
        return ueeVar.E ? und.l(25) + 1 + k : k;
    }

    public final o6e d() {
        o6e o6eVar = (o6e) super.clone();
        Object obj = m7e.a;
        return o6eVar;
    }

    public final String toString() {
        String valueOf;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            c4f.a(null, this, new StringBuffer(), stringBuffer);
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
