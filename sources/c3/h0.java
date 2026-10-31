package c3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h0 extends v {
    public final /* synthetic */ b0 b;
    public final /* synthetic */ g0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g0 g0Var, b0 b0Var, b0 b0Var2) {
        super(b0Var);
        this.c = g0Var;
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
