package a8;

import java.util.List;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class u7 {
    public static void a(c4.d dVar, int i7, h2.j jVar) {
        long i10 = dVar.i(i7);
        List q10 = dVar.q(i10);
        if (q10.isEmpty()) {
            return;
        }
        if (i7 == dVar.u() - 1) {
            throw new IllegalStateException();
        }
        long i11 = dVar.i(i7 + 1) - dVar.i(i7);
        if (i11 > 0) {
            jVar.accept(new c4.a(i10, i11, q10));
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
                d = dVar.u();
            }
            if (d > 0 && dVar.i(d - 1) == j3) {
                d--;
            }
        }
        if (j3 != -9223372036854775807L && d < dVar.u()) {
            List q10 = dVar.q(j3);
            long i10 = dVar.i(d);
            if (!q10.isEmpty()) {
                long j10 = lVar.a;
                if (j10 < i10) {
                    jVar.accept(new c4.a(j10, i10 - j10, q10));
                    z10 = true;
                    for (i7 = d; i7 < dVar.u(); i7++) {
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
                        jVar.accept(new c4.a(dVar.i(d), j3 - dVar.i(d), dVar.q(j3)));
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        while (i7 < dVar.u()) {
        }
        if (lVar.b) {
        }
    }
}
