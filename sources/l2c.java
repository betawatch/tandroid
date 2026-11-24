// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class l2c implements zy5, yy5 {
    public final /* synthetic */ b3c a;
    public final /* synthetic */ k47 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ l2c(b3c b3cVar, k47 k47Var, long j, int i) {
        this.a = b3cVar;
        this.b = k47Var;
        this.c = j;
        this.d = i;
    }

    @Override // zy5
    public final void a(String str) {
        gm.c3(new i2c(this.a, str, this.b, this.c, this.d, (byte) 1));
    }

    @Override // yy5
    public final void o(Exception exc) {
        gm.c3(new o77((Object) this.a, (Object) this.b, this.c, this.d, (byte) 20));
    }
}
