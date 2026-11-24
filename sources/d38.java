// default package

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class d38 extends duc {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public dd d;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean g0;
        boolean z;
        int i;
        int i2;
        dd ddVar = new dd(bArr.length + 1, (byte) 3);
        ddVar.l0(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            g0 = ddVar.g0(iArr[0]);
            int i3 = iArr[0];
            iArr[0] = i3 + 1;
            if (g0) {
                int i4 = i3 / 8;
                ((ByteBuffer) ddVar.c).put(i4, (byte) (ddVar.e0(i4) & (~(1 << (i3 % 8)))));
            }
            int m0 = ddVar.m0(iArr, 2);
            if (m0 == 0) {
                int i5 = ((iArr[0] + 7) & (-8)) / 8;
                int e0 = (ddVar.e0(i5) & 255) + ((ddVar.e0(i5 + 1) & 255) << 8);
                iArr[0] = ((i5 + 4) + e0) << 3;
                if (e0 == 0) {
                    z = true;
                    i = ddVar.b;
                    i2 = iArr[0];
                    if (i <= i2 / 8) {
                        g0 = true;
                    }
                    if (g0 && z) {
                        zArr[0] = true;
                    }
                }
            } else if (m0 == 1) {
                xh4 xh4Var = xh4.e;
                sh4 sh4Var = sh4.e;
                while (true) {
                    int m = xh4Var.m(ddVar, iArr);
                    if (m == 256) {
                        break;
                    }
                    if (m < 0 || m > 255) {
                        cd3.e(ddVar, iArr, m);
                        cd3.c(ddVar, iArr, sh4Var);
                    }
                }
            } else {
                if (m0 != 2) {
                    throw new v30(String.format("[%s] Bad compression type '11' at the bit index '%d'.", d38.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                iq[] iqVarArr = new iq[2];
                cd3.d(ddVar, iArr, iqVarArr);
                iq iqVar = iqVarArr[0];
                iq iqVar2 = iqVarArr[1];
                while (true) {
                    int m2 = iqVar.m(ddVar, iArr);
                    if (m2 == 256) {
                        break;
                    }
                    if (m2 < 0 || m2 > 255) {
                        cd3.e(ddVar, iArr, m2);
                        cd3.c(ddVar, iArr, iqVar2);
                    }
                }
            }
            z = false;
            i = ddVar.b;
            i2 = iArr[0];
            if (i <= i2 / 8) {
            }
            if (g0) {
                zArr[0] = true;
            }
        } while (!g0);
        if (zArr[0]) {
            return ddVar.q0(0, ug8.g(i2, 1, 8, -3));
        }
        int i6 = i2 % 8;
        if (i6 == 0 || i6 == 6 || i6 == 7) {
            ddVar.k0(0);
        }
        int i7 = iArr[0];
        iArr[0] = i7 + 3;
        return ddVar.q0(0, ((i7 + 2) / 8) + 1);
    }

    public final byte[] b(byte[] bArr) {
        int i = this.c;
        if (i != 32768 && bArr.length >= i) {
            return bArr;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Deflater deflater = new Deflater(-1, true);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr, 0, bArr.length);
            deflaterOutputStream.close();
            deflater.end();
            return a(byteArrayOutputStream.toByteArray());
        } catch (Exception e2) {
            throw new cuc(42, b00.h("Failed to compress the message: ", e2.getMessage()), e2);
        }
    }

    public final byte[] c(byte[] bArr) {
        dd ddVar = new dd(bArr.length + 4, (byte) 3);
        ddVar.l0(bArr);
        ddVar.l0(e);
        dd ddVar2 = this.d;
        if (ddVar2 == null) {
            ddVar2 = new dd(0, (byte) 3);
            this.d = ddVar2;
        }
        int i = ddVar2.b;
        try {
            bd3.a(ddVar, ddVar2);
            dd ddVar3 = this.d;
            byte[] q0 = ddVar3.q0(i, ddVar3.b);
            dd ddVar4 = this.d;
            if (((ByteBuffer) ddVar4.c).capacity() > 0) {
                int i2 = ddVar4.b;
                byte[] q02 = ddVar4.q0(i2, i2);
                ByteBuffer wrap = ByteBuffer.wrap(q02);
                ddVar4.c = wrap;
                wrap.position(q02.length);
                ddVar4.b = q02.length;
            }
            return q0;
        } catch (Exception e2) {
            throw new cuc(43, b00.h("Failed to decompress the message: ", e2.getMessage()), e2);
        }
    }
}
