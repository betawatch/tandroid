// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class lm0 implements mm0, x76, sx6, fu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ lm0(int i, int i2, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    @Override // fu2
    public final void accept(Object obj) {
        switch (this.a) {
            case 4:
                ((cf8) obj).J(this.b, this.c);
                break;
            default:
                ((cf8) obj).s0(this.b, this.c);
                break;
        }
    }

    @Override // sx6
    public final void d(rw6 rw6Var, int i) {
        rw6Var.c(i, this.b, this.c);
    }

    @Override // x76
    public final void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((pe8) obj).M(this.b, this.c);
                break;
            default:
                ((pe8) obj).M(this.b, this.c);
                break;
        }
    }

    @Override // mm0
    public final int o(ylb ylbVar, boolean z) {
        return z ? this.b : this.c;
    }
}
