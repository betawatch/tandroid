// default package

import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ip3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ op3 b;

    public /* synthetic */ ip3(op3 op3Var, byte b) {
        this.a = b;
        this.b = op3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        op3 op3Var = this.b;
        switch (b) {
            case 0:
                op3Var.b();
                break;
            case 1:
                op3Var.e = false;
                lp3 lp3Var = op3Var.s;
                if (lp3Var != null) {
                    lp3Var.a(true);
                    op3Var.s = null;
                }
                np3 np3Var = op3Var.n;
                if (np3Var != null) {
                    np3Var.a();
                }
                op3Var.c = false;
                op3Var.d();
                break;
            default:
                if (op3Var.c && op3Var.r != null) {
                    op3Var.n.b(R.raw.error, 3500, k96.N0("VideoConvertFail"));
                    op3Var.c = false;
                    op3Var.d();
                    break;
                }
                break;
        }
    }
}
