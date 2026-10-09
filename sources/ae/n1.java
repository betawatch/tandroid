package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class n1 extends m {
    public final w1 r;

    public n1(w1 w1Var, jd.c cVar) {
        super(1, cVar);
        this.r = w1Var;
    }

    @Override // ae.m
    public final Throwable q(w1 w1Var) {
        Throwable b10;
        Object u10 = this.r.u();
        return (!(u10 instanceof p1) || (b10 = ((p1) u10).b()) == null) ? u10 instanceof v ? ((v) u10).a : w1Var.getCancellationException() : b10;
    }

    @Override // ae.m
    public final String z() {
        return "AwaitContinuation";
    }
}
