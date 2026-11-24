// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class lne {
    public static void a(kab kabVar, int i, us2 us2Var) {
        long h = kabVar.h(i);
        List l = kabVar.l(h);
        if (l.isEmpty()) {
            return;
        }
        if (i == kabVar.t() - 1) {
            sdb.a();
            return;
        }
        long h2 = kabVar.h(i + 1) - kabVar.h(i);
        if (h2 > 0) {
            us2Var.accept(new x33(h, h2, l));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(kab kabVar, tab tabVar, us2 us2Var) {
        int b;
        boolean z;
        int i;
        long j = tabVar.a;
        if (j == -9223372036854775807L) {
            b = 0;
        } else {
            b = kabVar.b(j);
            if (b == -1) {
                b = kabVar.t();
            }
            if (b > 0 && kabVar.h(b - 1) == j) {
                b--;
            }
        }
        if (j != -9223372036854775807L && b < kabVar.t()) {
            List l = kabVar.l(j);
            long h = kabVar.h(b);
            if (!l.isEmpty()) {
                long j2 = tabVar.a;
                if (j2 < h) {
                    us2Var.accept(new x33(j2, h - j2, l));
                    z = true;
                    for (i = b; i < kabVar.t(); i++) {
                        a(kabVar, i, us2Var);
                    }
                    if (tabVar.b) {
                        return;
                    }
                    if (z) {
                        b--;
                    }
                    for (int i2 = 0; i2 < b; i2++) {
                        a(kabVar, i2, us2Var);
                    }
                    if (z) {
                        us2Var.accept(new x33(kabVar.h(b), j - kabVar.h(b), kabVar.l(j)));
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        while (i < kabVar.t()) {
        }
        if (tabVar.b) {
        }
    }
}
