// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ew7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hw7 b;

    public /* synthetic */ ew7(hw7 hw7Var, byte b) {
        this.a = b;
        this.b = hw7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hw7 hw7Var = this.b;
        switch (b) {
            case 0:
                hw7Var.c = null;
                x59 x59Var = hw7Var.a;
                if (x59Var != null) {
                    x59Var.f0();
                    break;
                }
                break;
            default:
                hw7Var.b();
                break;
        }
    }
}
