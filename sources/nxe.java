// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
