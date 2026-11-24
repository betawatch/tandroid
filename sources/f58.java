// default package

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f58 extends ewc {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public de d;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean h0;
        boolean z;
        int i;
        int i2;
        de deVar = new de(bArr.length + 1, (byte) 3);
        deVar.m0(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            h0 = deVar.h0(iArr[0]);
            int i3 = iArr[0];
            iArr[0] = i3 + 1;
            if (h0) {
                int i4 = i3 / 8;
                ((ByteBuffer) deVar.c).put(i4, (byte) (deVar.f0(i4) & (~(1 << (i3 % 8)))));
            }
            int n0 = deVar.n0(iArr, 2);
            if (n0 == 0) {
                int i5 = ((iArr[0] + 7) & (-8)) / 8;
                int f0 = (deVar.f0(i5) & 255) + ((deVar.f0(i5 + 1) & 255) << 8);
                iArr[0] = ((i5 + 4) + f0) << 3;
                if (f0 == 0) {
                    z = true;
                    i = deVar.b;
                    i2 = iArr[0];
                    if (i <= i2 / 8) {
                        h0 = true;
                    }
                    if (h0 && z) {
                        zArr[0] = true;
                    }
                }
            } else if (n0 == 1) {
                bk4 bk4Var = bk4.e;
                wj4 wj4Var = wj4.e;
                while (true) {
                    int m = bk4Var.m(deVar, iArr);
                    if (m == 256) {
                        break;
                    }
                    if (m < 0 || m > 255) {
                        oe3.e(deVar, iArr, m);
                        oe3.c(deVar, iArr, wj4Var);
                    }
                }
            } else {
                if (n0 != 2) {
                    throw new v40(String.format("[%s] Bad compression type '11' at the bit index '%d'.", f58.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                ir[] irVarArr = new ir[2];
                oe3.d(deVar, iArr, irVarArr);
                ir irVar = irVarArr[0];
                ir irVar2 = irVarArr[1];
                while (true) {
                    int m2 = irVar.m(deVar, iArr);
                    if (m2 == 256) {
                        break;
                    }
                    if (m2 < 0 || m2 > 255) {
                        oe3.e(deVar, iArr, m2);
                        oe3.c(deVar, iArr, irVar2);
                    }
                }
            }
            z = false;
            i = deVar.b;
            i2 = iArr[0];
            if (i <= i2 / 8) {
            }
            if (h0) {
                zArr[0] = true;
            }
        } while (!h0);
        if (zArr[0]) {
            return deVar.r0(0, wi8.g(i2, 1, 8, -3));
        }
        int i6 = i2 % 8;
        if (i6 == 0 || i6 == 6 || i6 == 7) {
            deVar.l0(0);
        }
        int i7 = iArr[0];
        iArr[0] = i7 + 3;
        return deVar.r0(0, ((i7 + 2) / 8) + 1);
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
            throw new dwc(42, b10.h("Failed to compress the message: ", e2.getMessage()), e2);
        }
    }

    public final byte[] c(byte[] bArr) {
        de deVar = new de(bArr.length + 4, (byte) 3);
        deVar.m0(bArr);
        deVar.m0(e);
        de deVar2 = this.d;
        if (deVar2 == null) {
            deVar2 = new de(0, (byte) 3);
            this.d = deVar2;
        }
        int i = deVar2.b;
        try {
            ne3.a(deVar, deVar2);
            de deVar3 = this.d;
            byte[] r0 = deVar3.r0(i, deVar3.b);
            de deVar4 = this.d;
            if (((ByteBuffer) deVar4.c).capacity() > 0) {
                int i2 = deVar4.b;
                byte[] r02 = deVar4.r0(i2, i2);
                ByteBuffer wrap = ByteBuffer.wrap(r02);
                deVar4.c = wrap;
                wrap.position(r02.length);
                deVar4.b = r02.length;
            }
            return r0;
        } catch (Exception e2) {
            throw new dwc(43, b10.h("Failed to decompress the message: ", e2.getMessage()), e2);
        }
    }
}
