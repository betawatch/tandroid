// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class kr9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rr9 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ kr9(rr9 rr9Var, Runnable runnable, byte b) {
        this.a = b;
        this.b = rr9Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        rr9 rr9Var = this.b;
        switch (b) {
            case 0:
                if (!rr9Var.h) {
                    runnable.run();
                    break;
                }
                break;
            default:
                if (!rr9Var.h) {
                    rr9Var.h = true;
                    rr9Var.e.C();
                    rr9Var.b.removeCallbacks(rr9Var.n);
                    s64 s64Var = rr9Var.f;
                    if (s64Var != null) {
                        s64Var.g1();
                        rr9Var.f = null;
                    }
                    rr9Var.g = null;
                    rr9Var.a.quitSafely();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
