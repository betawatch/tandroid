// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fya extends so4 {
    public final /* synthetic */ ix9 b;
    public final /* synthetic */ vh2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fya(vh2 vh2Var, ix9 ix9Var, ix9 ix9Var2) {
        super(ix9Var);
        this.c = vh2Var;
        this.b = ix9Var2;
    }

    @Override // so4, ix9
    public final hx9 f(long j) {
        hx9 f = this.b.f(j);
        kx9 kx9Var = f.a;
        long j2 = kx9Var.a;
        long j3 = kx9Var.b;
        long j4 = this.c.b;
        kx9 kx9Var2 = new kx9(j2, j3 + j4);
        kx9 kx9Var3 = f.b;
        return new hx9(kx9Var2, new kx9(kx9Var3.a, kx9Var3.b + j4));
    }
}
