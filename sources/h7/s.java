package h7;

import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class s {
    public static z3.c a(m3.l lVar, boolean z10) {
        a9.m mVar = z10 ? null : e4.i.b;
        d5.z zVar = new d5.z(10);
        z3.c cVar = null;
        int i10 = 0;
        while (true) {
            try {
                lVar.b(0, 10, zVar.a);
                zVar.C(0);
                if (zVar.t() != 4801587) {
                    break;
                }
                zVar.D(3);
                int q6 = zVar.q();
                int i11 = q6 + 10;
                if (cVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(zVar.a, 0, bArr, 0, 10);
                    lVar.b(10, q6, bArr);
                    cVar = new e4.i(mVar).c(i11, bArr);
                } else {
                    lVar.j(q6);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        lVar.q();
        lVar.j(i10);
        if (cVar == null || cVar.a.length == 0) {
            return null;
        }
        return cVar;
    }

    public static m3.p b(d5.z zVar) {
        zVar.D(1);
        int t10 = zVar.t();
        long j10 = zVar.b + t10;
        int i10 = t10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long l10 = zVar.l();
            if (l10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = l10;
            jArr2[i11] = zVar.l();
            zVar.D(2);
            i11++;
        }
        zVar.D((int) (j10 - zVar.b));
        return new m3.p(jArr, jArr2);
    }
}
