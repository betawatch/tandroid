package oc;

import g2.k0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class c {
    public static void a(e5.u uVar, e5.u uVar2) {
        boolean k10;
        int[] iArr = {0};
        do {
            k10 = uVar.k(iArr[0]);
            iArr[0] = iArr[0] + 1;
            int o10 = uVar.o(iArr, 2);
            if (o10 == 0) {
                int i3 = ((iArr[0] + 7) & (-8)) / 8;
                int i10 = ((uVar.i(i3 + 1) & 255) * 256) + (uVar.i(i3) & 255);
                int i11 = i3 + 4;
                uVar2.getClass();
                byte[] array = ((ByteBuffer) uVar.c).array();
                int capacity = ((ByteBuffer) uVar2.c).capacity();
                int i12 = uVar2.b + i10;
                if (capacity < i12) {
                    uVar2.g(i12 + 1024);
                }
                ((ByteBuffer) uVar2.c).put(array, i11, i10);
                uVar2.b += i10;
                iArr[0] = (i11 + i10) * 8;
            } else if (o10 == 1) {
                b(uVar, iArr, uVar2, g.e, f.e);
            } else {
                if (o10 != 2) {
                    throw new l6.m(String.format("[%s] Bad compression type '11' at the bit index '%d'.", c.class.getSimpleName(), Integer.valueOf(iArr[0])));
                }
                k0[] k0VarArr = new k0[2];
                d.e(uVar, iArr, k0VarArr);
                b(uVar, iArr, uVar2, k0VarArr[0], k0VarArr[1]);
            }
            if (uVar.b <= iArr[0] / 8) {
                k10 = true;
            }
        } while (!k10);
    }

    public static void b(e5.u uVar, int[] iArr, e5.u uVar2, k0 k0Var, k0 k0Var2) {
        while (true) {
            int m10 = k0Var.m(uVar, iArr);
            if (m10 == 256) {
                return;
            }
            if (m10 < 0 || m10 > 255) {
                int f10 = d.f(uVar, iArr, m10);
                int d = d.d(uVar, iArr, k0Var2);
                int i3 = uVar2.b;
                byte[] bArr = new byte[f10];
                int i10 = i3 - d;
                int i11 = 0;
                int i12 = i10;
                while (i11 < f10) {
                    if (i3 <= i12) {
                        i12 = i10;
                    }
                    bArr[i11] = uVar2.i(i12);
                    i11++;
                    i12++;
                }
                uVar2.n(bArr);
            } else {
                uVar2.m(m10);
            }
        }
    }
}
