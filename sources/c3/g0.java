package c3;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class g0 extends v {
    public final /* synthetic */ b0 b;
    public final /* synthetic */ ad.d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ad.d dVar, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.c = dVar;
        this.b = b0Var2;
    }

    @Override // c3.v, c3.b0
    public final a0 f(long j10) {
        a0 f7 = this.b.f(j10);
        c0 c0Var = f7.a;
        long j11 = c0Var.a;
        long j12 = c0Var.b;
        long j13 = this.c.b;
        c0 c0Var2 = new c0(j11, j12 + j13);
        c0 c0Var3 = f7.b;
        return new a0(c0Var2, new c0(c0Var3.a, c0Var3.b + j13));
    }
}
