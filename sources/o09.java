// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class o09 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r09 b;

    public /* synthetic */ o09(r09 r09Var, byte b) {
        this.a = b;
        this.b = r09Var;
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
                r09 r09Var = this.b;
                t09 t09Var = r09Var.Q;
                try {
                    r09Var.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                t09Var.n0 = t09Var.U.indexOf(r09Var.e);
                t09Var.m0 = r09Var.e;
                t09Var.invalidate();
                break;
        }
    }
}
