// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ds3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fs3 b;
    public final /* synthetic */ gs3 c;

    public /* synthetic */ ds3(fs3 fs3Var, gs3 gs3Var, byte b) {
        this.a = b;
        this.b = fs3Var;
        this.c = gs3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        gs3 gs3Var = this.c;
        fs3 fs3Var = this.b;
        switch (b) {
            case 0:
                gs3Var.I(fs3Var.a, fs3Var.b);
                break;
            default:
                gs3Var.y(fs3Var.a, fs3Var.b);
                break;
        }
    }
}
