package ld;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l1 extends m {
    public final u1 r;

    public l1(u1 u1Var, uc.c cVar) {
        super(1, cVar);
        this.r = u1Var;
    }

    @Override // ld.m
    public final Throwable q(u1 u1Var) {
        Throwable b10;
        Object u10 = this.r.u();
        return (!(u10 instanceof n1) || (b10 = ((n1) u10).b()) == null) ? u10 instanceof v ? ((v) u10).a : u1Var.getCancellationException() : b10;
    }

    @Override // ld.m
    public final String z() {
        return "AwaitContinuation";
    }
}
