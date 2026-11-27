// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
