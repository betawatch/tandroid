package c3;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class h0 extends v {
    public final /* synthetic */ c0 b;
    public final /* synthetic */ ad.d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ad.d dVar, c0 c0Var, c0 c0Var2) {
        super(c0Var);
        this.c = dVar;
        this.b = c0Var2;
    }

    @Override // c3.v, c3.c0
    public final b0 f(long j10) {
        b0 f7 = this.b.f(j10);
        d0 d0Var = f7.a;
        long j11 = d0Var.a;
        long j12 = d0Var.b;
        long j13 = this.c.b;
        d0 d0Var2 = new d0(j11, j12 + j13);
        d0 d0Var3 = f7.b;
        return new b0(d0Var2, new d0(d0Var3.a, d0Var3.b + j13));
    }
}
