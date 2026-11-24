// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ope {
    public static void a(lcb lcbVar, int i, fu2 fu2Var) {
        long k = lcbVar.k(i);
        List p = lcbVar.p(k);
        if (p.isEmpty()) {
            return;
        }
        if (i == lcbVar.q() - 1) {
            rjb.h();
            return;
        }
        long k2 = lcbVar.k(i + 1) - lcbVar.k(i);
        if (k2 > 0) {
            fu2Var.accept(new i53(k, k2, p));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(lcb lcbVar, ucb ucbVar, fu2 fu2Var) {
        int b;
        boolean z;
        int i;
        long j = ucbVar.a;
        if (j == -9223372036854775807L) {
            b = 0;
        } else {
            b = lcbVar.b(j);
            if (b == -1) {
                b = lcbVar.q();
            }
            if (b > 0 && lcbVar.k(b - 1) == j) {
                b--;
            }
        }
        if (j != -9223372036854775807L && b < lcbVar.q()) {
            List p = lcbVar.p(j);
            long k = lcbVar.k(b);
            if (!p.isEmpty()) {
                long j2 = ucbVar.a;
                if (j2 < k) {
                    fu2Var.accept(new i53(j2, k - j2, p));
                    z = true;
                    for (i = b; i < lcbVar.q(); i++) {
                        a(lcbVar, i, fu2Var);
                    }
                    if (ucbVar.b) {
                        return;
                    }
                    if (z) {
                        b--;
                    }
                    for (int i2 = 0; i2 < b; i2++) {
                        a(lcbVar, i2, fu2Var);
                    }
                    if (z) {
                        fu2Var.accept(new i53(lcbVar.k(b), j - lcbVar.k(b), lcbVar.p(j)));
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        while (i < lcbVar.q()) {
        }
        if (ucbVar.b) {
        }
    }
}
