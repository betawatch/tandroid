// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class hp6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hs6 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ hp6(hs6 hs6Var, boolean z, int i, byte b) {
        this.a = b;
        this.b = hs6Var;
        this.c = z;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.d;
        boolean z = this.c;
        hs6 hs6Var = this.b;
        switch (b) {
            case 0:
                hs6Var.x0[z ? 1 : 0] = false;
                hs6Var.y0[z ? 1 : 0] = true;
                hs6Var.r0[z ? 1 : 0] = i;
                break;
            default:
                hs6Var.r0[z ? 1 : 0] = i;
                break;
        }
    }
}
