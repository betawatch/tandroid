package jd;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l1 extends m {
    public final u1 r;

    public l1(u1 u1Var, sc.c cVar) {
        super(1, cVar);
        this.r = u1Var;
    }

    @Override // jd.m
    public final Throwable q(u1 u1Var) {
        Throwable b10;
        Object u10 = this.r.u();
        return (!(u10 instanceof n1) || (b10 = ((n1) u10).b()) == null) ? u10 instanceof v ? ((v) u10).a : u1Var.getCancellationException() : b10;
    }

    @Override // jd.m
    public final String z() {
        return "AwaitContinuation";
    }
}
