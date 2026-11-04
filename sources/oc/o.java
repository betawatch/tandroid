package oc;

import g2.k0;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o extends w {
    public static final byte[] e = {0, 0, -1, -1};
    public int c;
    public e5.u d;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a(byte[] bArr) {
        boolean k10;
        boolean z10;
        int i3;
        int i10;
        e5.u uVar = new e5.u(bArr.length + 1, 9);
        uVar.n(bArr);
        int[] iArr = new int[1];
        boolean[] zArr = new boolean[1];
        do {
            k10 = uVar.k(iArr[0]);
            int i11 = iArr[0];
            iArr[0] = i11 + 1;
            if (k10) {
                int i12 = i11 / 8;
                ((ByteBuffer) uVar.c).put(i12, (byte) ((~(1 << (i11 % 8))) & uVar.i(i12)));
            }
            int o10 = uVar.o(iArr, 2);
            if (o10 == 0) {
                int i13 = ((iArr[0] + 7) & (-8)) / 8;
                int i14 = ((255 & uVar.i(i13 + 1)) * 256) + (uVar.i(i13) & 255);
                iArr[0] = (i13 + 4 + i14) * 8;
                if (i14 == 0) {
                    z10 = true;
                    i3 = uVar.b;
                    i10 = iArr[0];
                    if (i3 <= i10 / 8) {
                        k10 = true;
                    }
                    if (k10 && z10) {
                        zArr[0] = true;
                    }
                }
            } else if (o10 == 1) {
                g gVar = g.e;
                f fVar = f.e;
                while (true) {
                    int m10 = gVar.m(uVar, iArr);
                    if (m10 == 256) {
                        break;
                    }
                    if (m10 < 0 || m10 > 255) {
                        d.f(uVar, iArr, m10);
                        d.d(uVar, iArr, fVar);
                    }
                }
            } else {
                if (o10 != 2) {
                    throw new l6.m(String.format("[%s] Bad compression type '11' at the bit index '%d'.", o.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                k0[] k0VarArr = new k0[2];
                d.e(uVar, iArr, k0VarArr);
                k0 k0Var = k0VarArr[0];
                k0 k0Var2 = k0VarArr[1];
                while (true) {
                    int m11 = k0Var.m(uVar, iArr);
                    if (m11 == 256) {
                        break;
                    }
                    if (m11 < 0 || m11 > 255) {
                        d.f(uVar, iArr, m11);
                        d.d(uVar, iArr, k0Var2);
                    }
                }
            }
            z10 = false;
            i3 = uVar.b;
            i10 = iArr[0];
            if (i3 <= i10 / 8) {
            }
            if (k10) {
                zArr[0] = true;
            }
        } while (!k10);
        if (zArr[0]) {
            return uVar.r(0, p1.e(i10, 1, 8, -3));
        }
        int i15 = i10 % 8;
        if (i15 == 0 || i15 == 6 || i15 == 7) {
            uVar.m(0);
        }
        int i16 = iArr[0];
        iArr[0] = i16 + 3;
        return uVar.r(0, ((i16 + 2) / 8) + 1);
    }

    public final byte[] b(byte[] bArr) {
        int i3 = this.c;
        if (i3 != 32768 && bArr.length >= i3) {
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
        } catch (Exception e10) {
            throw new v(42, t4.c.f("Failed to compress the message: ", e10.getMessage()), e10);
        }
    }

    public final byte[] c(byte[] bArr) {
        e5.u uVar = new e5.u(bArr.length + 4, 9);
        uVar.n(bArr);
        uVar.n(e);
        if (this.d == null) {
            this.d = new e5.u(0, 9);
        }
        e5.u uVar2 = this.d;
        int i3 = uVar2.b;
        try {
            c.a(uVar, uVar2);
            e5.u uVar3 = this.d;
            byte[] r5 = uVar3.r(i3, uVar3.b);
            e5.u uVar4 = this.d;
            if (((ByteBuffer) uVar4.c).capacity() > 0) {
                int i10 = uVar4.b;
                byte[] r9 = uVar4.r(i10, i10);
                ByteBuffer wrap = ByteBuffer.wrap(r9);
                uVar4.c = wrap;
                wrap.position(r9.length);
                uVar4.b = r9.length;
            }
            return r5;
        } catch (Exception e10) {
            throw new v(43, t4.c.f("Failed to decompress the message: ", e10.getMessage()), e10);
        }
    }
}
