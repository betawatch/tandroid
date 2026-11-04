package b8;

import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class g1 {
    public static void a(b4.d dVar, int i3, g2.k kVar) {
        long h = dVar.h(i3);
        List p10 = dVar.p(h);
        if (p10.isEmpty()) {
            return;
        }
        if (i3 == dVar.t() - 1) {
            throw new IllegalStateException();
        }
        long h7 = dVar.h(i3 + 1) - dVar.h(i3);
        if (h7 > 0) {
            kVar.accept(new b4.a(h, h7, p10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(b4.d dVar, b4.l lVar, g2.k kVar) {
        int d;
        boolean z10;
        int i3;
        long j10 = lVar.a;
        if (j10 == -9223372036854775807L) {
            d = 0;
        } else {
            d = dVar.d(j10);
            if (d == -1) {
                d = dVar.t();
            }
            if (d > 0 && dVar.h(d - 1) == j10) {
                d--;
            }
        }
        if (j10 != -9223372036854775807L && d < dVar.t()) {
            List p10 = dVar.p(j10);
            long h = dVar.h(d);
            if (!p10.isEmpty()) {
                long j11 = lVar.a;
                if (j11 < h) {
                    kVar.accept(new b4.a(j11, h - j11, p10));
                    z10 = true;
                    for (i3 = d; i3 < dVar.t(); i3++) {
                        a(dVar, i3, kVar);
                    }
                    if (lVar.b) {
                        return;
                    }
                    if (z10) {
                        d--;
                    }
                    for (int i10 = 0; i10 < d; i10++) {
                        a(dVar, i10, kVar);
                    }
                    if (z10) {
                        kVar.accept(new b4.a(dVar.h(d), j10 - dVar.h(d), dVar.p(j10)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i3 < dVar.t()) {
        }
        if (lVar.b) {
        }
    }
}
