// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class h2c implements zy5, yy5 {
    public final /* synthetic */ b3c a;
    public final /* synthetic */ k47 b;
    public final /* synthetic */ u21 c;
    public final /* synthetic */ rp2 d;

    public /* synthetic */ h2c(b3c b3cVar, k47 k47Var, u21 u21Var, rp2 rp2Var) {
        this.a = b3cVar;
        this.b = k47Var;
        this.c = u21Var;
        this.d = rp2Var;
    }

    @Override // zy5
    public final void a(String str) {
        gm.c3(new vua(this.a, this.b, str, this.c, this.d, (byte) 7));
    }

    @Override // yy5
    public final void o(Exception exc) {
        gm.c3(new hza((Object) this.a, (Object) this.b, (Object) this.c, (Object) this.d, (byte) 15));
    }
}
