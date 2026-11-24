// default package

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class l4e {
    public static final void b(l4e l4eVar, byte[] bArr, int i) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
            sld sldVar = new sld();
            sldVar.a = wrap;
            wrap.order(ByteOrder.LITTLE_ENDIAN);
            l4eVar.a(sldVar);
            ByteBuffer byteBuffer = (ByteBuffer) sldVar.a;
            if (byteBuffer.remaining() == 0) {
                return;
            }
            throw new IllegalStateException("Did not write as much data as expected, " + byteBuffer.remaining() + " bytes remaining.");
        } catch (IOException e) {
            fyb.j("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public abstract void a(sld sldVar);

    public final int c() {
        int[] iArr;
        tce tceVar = (tce) this;
        String str = tceVar.x;
        String str2 = tceVar.r;
        String str3 = tceVar.n;
        String str4 = tceVar.h;
        byte[] bArr = tceVar.e;
        long j = tceVar.a;
        int i = 0;
        int l = j != 0 ? sld.l(j) + sld.m(1) : 0;
        yce[] yceVarArr = tceVar.d;
        if (yceVarArr != null && yceVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                yce[] yceVarArr2 = tceVar.d;
                if (i2 >= yceVarArr2.length) {
                    break;
                }
                yce yceVar = yceVarArr2[i2];
                i2++;
            }
        }
        byte[] bArr2 = wed.b;
        if (!Arrays.equals(bArr, bArr2)) {
            l += sld.n(bArr.length) + bArr.length + sld.m(4);
        }
        if (!Arrays.equals(tceVar.f, bArr2)) {
            byte[] bArr3 = tceVar.f;
            l += sld.n(bArr3.length) + bArr3.length + sld.m(6);
        }
        if (str4 != null && !str4.equals("")) {
            l += sld.g(8, str4);
        }
        int i3 = tceVar.c;
        if (i3 != 0) {
            l += (i3 >= 0 ? sld.n(i3) : 10) + sld.m(11);
        }
        if (str3 != null && !str3.equals("")) {
            l += sld.g(13, str3);
        }
        if (str2 != null && !str2.equals("")) {
            l += sld.g(14, str2);
        }
        long j2 = tceVar.s;
        if (j2 != 180000) {
            l += sld.l((j2 << 1) ^ (j2 >> 63)) + sld.m(15);
        }
        long j3 = tceVar.b;
        if (j3 != 0) {
            l += sld.l(j3) + sld.m(17);
        }
        if (!Arrays.equals(tceVar.w, bArr2)) {
            byte[] bArr4 = tceVar.w;
            l += sld.n(bArr4.length) + bArr4.length + sld.m(18);
        }
        int[] iArr2 = tceVar.y;
        if (iArr2 != null && iArr2.length > 0) {
            int i4 = 0;
            while (true) {
                iArr = tceVar.y;
                if (i >= iArr.length) {
                    break;
                }
                int i5 = iArr[i];
                i4 += i5 >= 0 ? sld.n(i5) : 10;
                i++;
            }
            l = l + i4 + (iArr.length << 1);
        }
        if (str != null && !str.equals("")) {
            l += sld.g(24, str);
        }
        return tceVar.E ? sld.m(25) + 1 + l : l;
    }

    public final l4e d() {
        l4e l4eVar = (l4e) super.clone();
        Object obj = j5e.a;
        return l4eVar;
    }

    public final String toString() {
        String valueOf;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            a2f.a(null, this, new StringBuffer(), stringBuffer);
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
