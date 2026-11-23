package a8;

import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class v7 {
    public static void a(c4.d dVar, int i7, h2.j jVar) {
        long i10 = dVar.i(i7);
        List k10 = dVar.k(i10);
        if (k10.isEmpty()) {
            return;
        }
        if (i7 == dVar.m() - 1) {
            throw new IllegalStateException();
        }
        long i11 = dVar.i(i7 + 1) - dVar.i(i7);
        if (i11 > 0) {
            jVar.accept(new c4.a(i10, i11, k10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(c4.d dVar, c4.l lVar, h2.j jVar) {
        int d;
        boolean z10;
        int i7;
        long j3 = lVar.a;
        if (j3 == -9223372036854775807L) {
            d = 0;
        } else {
            d = dVar.d(j3);
            if (d == -1) {
                d = dVar.m();
            }
            if (d > 0 && dVar.i(d - 1) == j3) {
                d--;
            }
        }
        if (j3 != -9223372036854775807L && d < dVar.m()) {
            List k10 = dVar.k(j3);
            long i10 = dVar.i(d);
            if (!k10.isEmpty()) {
                long j10 = lVar.a;
                if (j10 < i10) {
                    jVar.accept(new c4.a(j10, i10 - j10, k10));
                    z10 = true;
                    for (i7 = d; i7 < dVar.m(); i7++) {
                        a(dVar, i7, jVar);
                    }
                    if (lVar.b) {
                        return;
                    }
                    if (z10) {
                        d--;
                    }
                    for (int i11 = 0; i11 < d; i11++) {
                        a(dVar, i11, jVar);
                    }
                    if (z10) {
                        jVar.accept(new c4.a(dVar.i(d), j3 - dVar.i(d), dVar.k(j3)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i7 < dVar.m()) {
        }
        if (lVar.b) {
        }
    }
}
