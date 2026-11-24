// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hf4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kf4 b;

    public /* synthetic */ hf4(kf4 kf4Var, byte b) {
        this.a = b;
        this.b = kf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kf4 kf4Var = this.b;
        switch (b) {
            case 0:
                kf4Var.d();
                break;
            case 1:
                kf4Var.a();
                break;
            default:
                kf4Var.b(kf4Var.E);
                break;
        }
    }
}
