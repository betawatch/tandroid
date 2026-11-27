// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class d49 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g49 b;

    public /* synthetic */ d49(g49 g49Var, byte b) {
        this.a = b;
        this.b = g49Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.a.getImageReceiver().y() != null && !this.b.a.getImageReceiver().y().l0 && !this.b.a.getImageReceiver().y().t()) {
                    this.b.a.getImageReceiver().y().start();
                }
                this.b.F = false;
                break;
            default:
                g49 g49Var = this.b;
                i49 i49Var = g49Var.Q;
                try {
                    g49Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                i49Var.n0 = i49Var.U.indexOf(g49Var.e);
                i49Var.m0 = g49Var.e;
                i49Var.invalidate();
                break;
        }
    }
}
