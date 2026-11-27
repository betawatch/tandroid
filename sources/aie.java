// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        return g9c.a;
    }

    public static final vd3 b(mx2 mx2Var) {
        kx2 kx2Var = mx2Var.get(rj2.b);
        vd3 vd3Var = kx2Var instanceof vd3 ? (vd3) kx2Var : null;
        return vd3Var == null ? bb3.a : vd3Var;
    }
}
