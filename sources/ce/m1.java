package ce;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class m1 extends m {
    public final v1 r;

    public m1(v1 v1Var, ld.c cVar) {
        super(1, cVar);
        this.r = v1Var;
    }

    @Override // ce.m
    public final Throwable q(v1 v1Var) {
        Throwable b10;
        Object u10 = this.r.u();
        return (!(u10 instanceof o1) || (b10 = ((o1) u10).b()) == null) ? u10 instanceof v ? ((v) u10).a : v1Var.getCancellationException() : b10;
    }

    @Override // ce.m
    public final String z() {
        return "AwaitContinuation";
    }
}
