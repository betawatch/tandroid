package id;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m1 extends m {
    public final v1 r;

    public m1(v1 v1Var, rc.c cVar) {
        super(1, cVar);
        this.r = v1Var;
    }

    @Override // id.m
    public final Throwable q(v1 v1Var) {
        Throwable b10;
        Object u10 = this.r.u();
        return (!(u10 instanceof o1) || (b10 = ((o1) u10).b()) == null) ? u10 instanceof v ? ((v) u10).a : v1Var.getCancellationException() : b10;
    }

    @Override // id.m
    public final String z() {
        return "AwaitContinuation";
    }
}
