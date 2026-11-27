// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class azd {
    public static kx2 a(kx2 kx2Var, lx2 lx2Var) {
        lx2Var.getClass();
        if (ur5.a(kx2Var.getKey(), lx2Var)) {
            return kx2Var;
        }
        return null;
    }

    public static mx2 b(kx2 kx2Var, lx2 lx2Var) {
        lx2Var.getClass();
        return ur5.a(kx2Var.getKey(), lx2Var) ? u24.a : kx2Var;
    }

    public static mx2 c(kx2 kx2Var, mx2 mx2Var) {
        mx2Var.getClass();
        return mx2Var == u24.a ? kx2Var : (mx2) mx2Var.fold(kx2Var, new xm2((byte) 1));
    }
}
