package be;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class m1 extends m {
    public final v1 r;

    public m1(v1 v1Var, kd.c cVar) {
        super(1, cVar);
        this.r = v1Var;
    }

    @Override // be.m
    public final Throwable q(v1 v1Var) {
        Throwable b10;
        Object u10 = this.r.u();
        return (!(u10 instanceof o1) || (b10 = ((o1) u10).b()) == null) ? u10 instanceof v ? ((v) u10).a : v1Var.getCancellationException() : b10;
    }

    @Override // be.m
    public final String z() {
        return "AwaitContinuation";
    }
}
