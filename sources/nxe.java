// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class nxe {
    public static void a(ab9 ab9Var, vnb vnbVar) {
        ab9Var.p(aob.v0(aob.Fi, vnbVar), vnbVar != null ? vnbVar.a() : aob.I.o());
    }

    public static int b(mk0 mk0Var) {
        if (mk0Var == null) {
            return 0;
        }
        return c(mk0Var) + (Math.max(0, mk0Var.c) > 0 ? hl.L(bp1.h(r4, 1, 24, 28)) : 0);
    }

    public static int c(mk0 mk0Var) {
        if ((mk0Var == null ? 0 : mk0Var.k.size()) <= 0) {
            return 0;
        }
        return hl.L(((r1 - 1) << 4) + 12);
    }

    public static int d(mk0 mk0Var) {
        if ((mk0Var == null ? 0 : mk0Var.k.size()) <= 0) {
            return 0;
        }
        return hl.L(((r1 - 1) << 4) + 8);
    }
}
