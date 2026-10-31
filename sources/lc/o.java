package lc;

import e2.j0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o extends x {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public c5.x d;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean l4;
        boolean z10;
        int i10;
        int i11;
        c5.x xVar = new c5.x(bArr.length + 1, 7);
        xVar.o(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            l4 = xVar.l(iArr[0]);
            int i12 = iArr[0];
            iArr[0] = i12 + 1;
            if (l4) {
                int i13 = i12 / 8;
                ((ByteBuffer) xVar.c).put(i13, (byte) ((~(1 << (i12 % 8))) & xVar.j(i13)));
            }
            int p5 = xVar.p(iArr, 2);
            if (p5 == 0) {
                int i14 = ((iArr[0] + 7) & (-8)) / 8;
                int j10 = ((255 & xVar.j(i14 + 1)) * 256) + (xVar.j(i14) & 255);
                iArr[0] = (i14 + 4 + j10) * 8;
                if (j10 == 0) {
                    z10 = true;
                    i10 = xVar.b;
                    i11 = iArr[0];
                    if (i10 <= i11 / 8) {
                        l4 = true;
                    }
                    if (l4 && z10) {
                        zArr[0] = true;
                    }
                }
            } else if (p5 == 1) {
                g gVar = g.e;
                f fVar = f.e;
                while (true) {
                    int m10 = gVar.m(xVar, iArr);
                    if (m10 == 256) {
                        break;
                    }
                    if (m10 < 0 || m10 > 255) {
                        d.f(xVar, iArr, m10);
                        d.d(xVar, iArr, fVar);
                    }
                }
            } else {
                if (p5 != 2) {
                    throw new j6.l(String.format("[%s] Bad compression type '11' at the bit index '%d'.", o.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                j0[] j0VarArr = new j0[2];
                d.e(xVar, iArr, j0VarArr);
                j0 j0Var = j0VarArr[0];
                j0 j0Var2 = j0VarArr[1];
                while (true) {
                    int m11 = j0Var.m(xVar, iArr);
                    if (m11 == 256) {
                        break;
                    }
                    if (m11 < 0 || m11 > 255) {
                        d.f(xVar, iArr, m11);
                        d.d(xVar, iArr, j0Var2);
                    }
                }
            }
            z10 = false;
            i10 = xVar.b;
            i11 = iArr[0];
            if (i10 <= i11 / 8) {
            }
            if (l4) {
                zArr[0] = true;
            }
        } while (!l4);
        if (zArr[0]) {
            return xVar.s(0, i0.a.u(i11, 1, 8, -3));
        }
        int i15 = i11 % 8;
        if (i15 == 0 || i15 == 6 || i15 == 7) {
            xVar.n(0);
        }
        int i16 = iArr[0];
        iArr[0] = i16 + 3;
        return xVar.s(0, ((i16 + 2) / 8) + 1);
    }

    public final byte[] b(byte[] bArr) {
        int i10 = this.c;
        if (i10 != 32768 && bArr.length >= i10) {
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
        } catch (Exception e7) {
            throw new w(42, sc.e.h("Failed to compress the message: ", e7.getMessage()), e7);
        }
    }

    public final byte[] c(byte[] bArr) {
        c5.x xVar = new c5.x(bArr.length + 4, 7);
        xVar.o(bArr);
        xVar.o(e);
        if (this.d == null) {
            this.d = new c5.x(0, 7);
        }
        c5.x xVar2 = this.d;
        int i10 = xVar2.b;
        try {
            c.a(xVar, xVar2);
            c5.x xVar3 = this.d;
            byte[] s10 = xVar3.s(i10, xVar3.b);
            c5.x xVar4 = this.d;
            if (((ByteBuffer) xVar4.c).capacity() > 0) {
                int i11 = xVar4.b;
                byte[] s11 = xVar4.s(i11, i11);
                ByteBuffer wrap = ByteBuffer.wrap(s11);
                xVar4.c = wrap;
                wrap.position(s11.length);
                xVar4.b = s11.length;
            }
            return s10;
        } catch (Exception e7) {
            throw new w(43, sc.e.h("Failed to decompress the message: ", e7.getMessage()), e7);
        }
    }
}
