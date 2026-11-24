// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bed implements nh1 {
    public final tad a;

    public bed(tad tadVar) {
        this.a = tadVar;
    }

    @Override // nh1
    public final void a(pgd pgdVar) {
        ite.i(pgdVar, "channel must not be null");
    }

    @Override // nh1
    public final void b(pgd pgdVar) {
        ite.i(pgdVar, "channel must not be null");
    }

    @Override // nh1
    public final void c(pgd pgdVar) {
        ite.i(pgdVar, "channel must not be null");
    }

    @Override // nh1
    public final void d(pgd pgdVar) {
        ite.i(pgdVar, "channel must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bed.class == obj.getClass() && this.a == ((bed) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
