// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dt4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ et4 b;

    public /* synthetic */ dt4(et4 et4Var, byte b) {
        this.a = b;
        this.b = et4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        et4 et4Var = this.b;
        switch (b) {
            case 0:
                if (et4Var.d.K == et4Var) {
                    et4Var.d.a0 = false;
                    et4Var.d.b0 = null;
                    et4Var.d.h();
                    break;
                }
                break;
            default:
                if (et4Var.d.K == et4Var && !et4Var.b) {
                    et4Var.d.a0 = true;
                    Runnable runnable = et4Var.d.b0;
                    et4Var.d.b0 = null;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
        }
    }
}
