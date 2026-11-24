// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kc8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mc8 b;

    public /* synthetic */ kc8(mc8 mc8Var, byte b) {
        this.a = b;
        this.b = mc8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mc8 mc8Var = this.b;
        switch (b) {
            case 0:
                mc8Var.d.a(false);
                break;
            default:
                Runnable runnable = mc8Var.I;
                mc8Var.I = null;
                if (runnable != null) {
                    runnable.run();
                }
                Runnable runnable2 = mc8Var.J;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
