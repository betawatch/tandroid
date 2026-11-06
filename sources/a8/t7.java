package a8;

import java.util.List;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class t7 {
    public static void a(c4.d dVar, int i7, h2.j jVar) {
        long k10 = dVar.k(i7);
        List s5 = dVar.s(k10);
        if (s5.isEmpty()) {
            return;
        }
        if (i7 == dVar.y() - 1) {
            throw new IllegalStateException();
        }
        long k11 = dVar.k(i7 + 1) - dVar.k(i7);
        if (k11 > 0) {
            jVar.accept(new c4.a(k10, k11, s5));
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
        boolean z9;
        int i7;
        long j3 = lVar.a;
        if (j3 == -9223372036854775807L) {
            d = 0;
        } else {
            d = dVar.d(j3);
            if (d == -1) {
                d = dVar.y();
            }
            if (d > 0 && dVar.k(d - 1) == j3) {
                d--;
            }
        }
        if (j3 != -9223372036854775807L && d < dVar.y()) {
            List s5 = dVar.s(j3);
            long k10 = dVar.k(d);
            if (!s5.isEmpty()) {
                long j10 = lVar.a;
                if (j10 < k10) {
                    jVar.accept(new c4.a(j10, k10 - j10, s5));
                    z9 = true;
                    for (i7 = d; i7 < dVar.y(); i7++) {
                        a(dVar, i7, jVar);
                    }
                    if (lVar.b) {
                        return;
                    }
                    if (z9) {
                        d--;
                    }
                    for (int i10 = 0; i10 < d; i10++) {
                        a(dVar, i10, jVar);
                    }
                    if (z9) {
                        jVar.accept(new c4.a(dVar.k(d), j3 - dVar.k(d), dVar.s(j3)));
                        return;
                    }
                    return;
                }
            }
        }
        z9 = false;
        while (i7 < dVar.y()) {
        }
        if (lVar.b) {
        }
    }
}
