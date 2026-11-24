// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class lr7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pr7 b;

    public /* synthetic */ lr7(pr7 pr7Var, byte b) {
        this.a = b;
        this.b = pr7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pr7 pr7Var = this.b;
        switch (b) {
            case 0:
                if (pr7Var.k2) {
                    pr7Var.k2 = false;
                    pr7Var.c2.setLoading(false);
                    pr7Var.a1();
                    break;
                }
                break;
            case 1:
                if (!pr7Var.i2) {
                    pr7Var.i2 = true;
                    pr7Var.h2 = false;
                    pr7Var.g2 = false;
                    pr7Var.dismiss();
                    Runnable runnable = pr7Var.q2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!pr7Var.j2) {
                    pr7Var.j2 = true;
                    h65 h65Var = pr7Var.s2;
                    if (h65Var != null) {
                        h65Var.run();
                        break;
                    }
                }
                break;
            case 2:
                pr7Var.Z0();
                break;
            default:
                pr7Var.dismiss();
                break;
        }
    }
}
