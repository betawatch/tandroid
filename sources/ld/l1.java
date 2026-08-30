package ld;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
