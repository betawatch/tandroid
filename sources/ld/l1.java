package ld;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
