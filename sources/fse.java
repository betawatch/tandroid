// default package

import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class fse {
    public static void a(heb hebVar, int i, ot2 ot2Var) {
        long i2 = hebVar.i(i);
        List l = hebVar.l(i2);
        if (l.isEmpty()) {
            return;
        }
        if (i == hebVar.q() - 1) {
            grb.g();
            return;
        }
        long i3 = hebVar.i(i + 1) - hebVar.i(i);
        if (i3 > 0) {
            ot2Var.accept(new p43(i2, i3, l));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:14:0x0053->B:16:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(heb hebVar, qeb qebVar, ot2 ot2Var) {
        int b;
        boolean z;
        int i;
        long j = qebVar.a;
        if (j == -9223372036854775807L) {
            b = 0;
        } else {
            b = hebVar.b(j);
            if (b == -1) {
                b = hebVar.q();
            }
            if (b > 0 && hebVar.i(b - 1) == j) {
                b--;
            }
        }
        if (j != -9223372036854775807L && b < hebVar.q()) {
            List l = hebVar.l(j);
            long i2 = hebVar.i(b);
            if (!l.isEmpty()) {
                long j2 = qebVar.a;
                if (j2 < i2) {
                    ot2Var.accept(new p43(j2, i2 - j2, l));
                    z = true;
                    for (i = b; i < hebVar.q(); i++) {
                        a(hebVar, i, ot2Var);
                    }
                    if (qebVar.b) {
                        return;
                    }
                    if (z) {
                        b--;
                    }
                    for (int i3 = 0; i3 < b; i3++) {
                        a(hebVar, i3, ot2Var);
                    }
                    if (z) {
                        ot2Var.accept(new p43(hebVar.i(b), j - hebVar.i(b), hebVar.l(j)));
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        while (i < hebVar.q()) {
        }
        if (qebVar.b) {
        }
    }
}
