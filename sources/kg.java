// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ue7 b;

    public /* synthetic */ kg(ue7 ue7Var, byte b) {
        this.a = b;
        this.b = ue7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ue7 ue7Var = this.b;
        switch (b) {
            case 0:
                ue7Var.z(false);
                break;
            case 1:
                ue7Var.z(false);
                break;
            default:
                ue7Var.z(true);
                break;
        }
    }
}
