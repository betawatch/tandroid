// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class aie {
    public static final Object a(long j, zw2 zw2Var) {
        if (j > 0) {
            va1 va1Var = new va1(1, xpe.a(zw2Var));
            va1Var.s();
            if (j < Long.MAX_VALUE) {
                b(va1Var.e).b(j, va1Var);
            }
            Object q = va1Var.q();
            if (q == vx2.a) {
                return q;
            }
        }
        return f9c.a;
    }

    public static final vd3 b(mx2 mx2Var) {
        kx2 kx2Var = mx2Var.get(rj2.b);
        vd3 vd3Var = kx2Var instanceof vd3 ? (vd3) kx2Var : null;
        return vd3Var == null ? bb3.a : vd3Var;
    }
}
