// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o07 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x07 b;

    public /* synthetic */ o07(x07 x07Var, byte b) {
        this.a = b;
        this.b = x07Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        x07 x07Var = this.b;
        switch (b) {
            case 0:
                x07Var.e();
                break;
            case 1:
                x07.k(x07Var.q, true, true);
                break;
            default:
                x07Var.e();
                break;
        }
    }
}
