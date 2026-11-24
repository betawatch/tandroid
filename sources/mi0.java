// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class mi0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oi0 b;

    public /* synthetic */ mi0(oi0 oi0Var, byte b) {
        this.a = b;
        this.b = oi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        oi0 oi0Var = this.b;
        switch (b) {
            case 0:
                oi0Var.a(null, false);
                break;
            default:
                oi0Var.b(true);
                break;
        }
    }
}
