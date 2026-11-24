// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class fge {
    public static final void a(vb1 vb1Var, px2 px2Var, boolean z) {
        Object r = vb1Var.r();
        Throwable f = vb1Var.f(r);
        Object sc9Var = f != null ? new sc9(f) : vb1Var.g(r);
        if (!z) {
            px2Var.resumeWith(sc9Var);
            return;
        }
        px2Var.getClass();
        rp3 rp3Var = (rp3) px2Var;
        qx2 qx2Var = rp3Var.e;
        Object obj = rp3Var.h;
        cy2 context = qx2Var.getContext();
        Object c = gfd.c(context, obj);
        y6c c2 = c != gfd.a ? t1e.c(qx2Var, context, c) : null;
        try {
            qx2Var.resumeWith(sc9Var);
            if (c2 == null || c2.S()) {
                gfd.a(context, c);
            }
        } catch (Throwable th) {
            if (c2 == null || c2.S()) {
                gfd.a(context, c);
            }
            throw th;
        }
    }
}
