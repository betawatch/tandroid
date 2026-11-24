// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class hu2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tu2 b;

    public /* synthetic */ hu2(tu2 tu2Var, byte b) {
        this.a = b;
        this.b = tu2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tu2 tu2Var = this.b;
        switch (b) {
            case 0:
                tu2Var.e0();
                break;
            case 1:
                if (tu2Var.K) {
                    tu2Var.d.d.requestFocus();
                    gm.E3(tu2Var.d.d);
                    break;
                }
                break;
            default:
                tu2Var.presentFragment(yv1.ga(tu2Var.I), true);
                break;
        }
    }
}
