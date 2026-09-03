package ld;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
