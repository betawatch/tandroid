// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class j11 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z11 b;

    public /* synthetic */ j11(z11 z11Var, byte b) {
        this.a = b;
        this.b = z11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        z11 z11Var = this.b;
        switch (b) {
            case 0:
                z11Var.onExitTransitionStart();
                break;
            case 1:
                z11Var.onEnterTransitionStart();
                break;
            default:
                try {
                    z11Var.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
