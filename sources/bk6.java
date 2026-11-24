// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bk6 implements w37 {
    public w37[] a;

    @Override // w37
    public final j19 a(Class cls) {
        for (w37 w37Var : this.a) {
            if (w37Var.b(cls)) {
                return w37Var.a(cls);
            }
        }
        rjb.j("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // w37
    public final boolean b(Class cls) {
        for (w37 w37Var : this.a) {
            if (w37Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
