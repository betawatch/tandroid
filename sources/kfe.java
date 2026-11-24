// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class kfe {
    public static final Object a(long j, px2 px2Var) {
        if (j > 0) {
            vb1 vb1Var = new vb1(1, fne.a(px2Var));
            vb1Var.s();
            if (j < Long.MAX_VALUE) {
                b(vb1Var.e).b(j, vb1Var);
            }
            Object q = vb1Var.q();
            if (q == ly2.a) {
                return q;
            }
        }
        return g7c.a;
    }

    public static final pe3 b(cy2 cy2Var) {
        ay2 ay2Var = cy2Var.get(jk2.b);
        pe3 pe3Var = ay2Var instanceof pe3 ? (pe3) ay2Var : null;
        return pe3Var == null ? ub3.a : pe3Var;
    }
}
