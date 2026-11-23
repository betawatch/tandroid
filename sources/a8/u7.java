package a8;

import java.util.List;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class u7 {
    public static void a(c4.d dVar, int i7, h2.j jVar) {
        long h = dVar.h(i7);
        List m10 = dVar.m(h);
        if (m10.isEmpty()) {
            return;
        }
        if (i7 == dVar.p() - 1) {
            throw new IllegalStateException();
        }
        long h7 = dVar.h(i7 + 1) - dVar.h(i7);
        if (h7 > 0) {
            jVar.accept(new c4.a(h, h7, m10));
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
                d = dVar.p();
            }
            if (d > 0 && dVar.h(d - 1) == j3) {
                d--;
            }
        }
        if (j3 != -9223372036854775807L && d < dVar.p()) {
            List m10 = dVar.m(j3);
            long h = dVar.h(d);
            if (!m10.isEmpty()) {
                long j10 = lVar.a;
                if (j10 < h) {
                    jVar.accept(new c4.a(j10, h - j10, m10));
                    z10 = true;
                    for (i7 = d; i7 < dVar.p(); i7++) {
                        a(dVar, i7, jVar);
                    }
                    if (lVar.b) {
                        return;
                    }
                    if (z10) {
                        d--;
                    }
                    for (int i10 = 0; i10 < d; i10++) {
                        a(dVar, i10, jVar);
                    }
                    if (z10) {
                        jVar.accept(new c4.a(dVar.h(d), j3 - dVar.h(d), dVar.m(j3)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i7 < dVar.p()) {
        }
        if (lVar.b) {
        }
    }
}
