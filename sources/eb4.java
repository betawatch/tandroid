// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class eb4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kb4 b;

    public /* synthetic */ eb4(kb4 kb4Var, byte b) {
        this.a = b;
        this.b = kb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kb4 kb4Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = kb4Var.l;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Runnable runnable2 = kb4Var.l;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
