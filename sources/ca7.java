// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ca7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ ca7(oc7 oc7Var, long j, Runnable runnable, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = j;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.d;
        long j = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                oc7Var.a3(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                oc7Var.a3(0, j, true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
