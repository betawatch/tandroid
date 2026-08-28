package hd;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m1 extends m {
    public final v1 r;

    public m1(v1 v1Var, qc.c cVar) {
        super(1, cVar);
        this.r = v1Var;
    }

    @Override // hd.m
    public final Throwable q(v1 v1Var) {
        Throwable b10;
        Object u10 = this.r.u();
        return (!(u10 instanceof o1) || (b10 = ((o1) u10).b()) == null) ? u10 instanceof v ? ((v) u10).a : v1Var.getCancellationException() : b10;
    }

    @Override // hd.m
    public final String z() {
        return "AwaitContinuation";
    }
}
