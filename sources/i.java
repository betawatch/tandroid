// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d31 b;

    public /* synthetic */ i(d31 d31Var, byte b) {
        this.a = b;
        this.b = d31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d31 d31Var = this.b;
        switch (b) {
            case 0:
                new xk8(42, d31Var.c, d31Var.X()).show();
                break;
            default:
                if (LaunchActivity.S() != null) {
                    if (d31Var == null) {
                        d31Var = d31.b0(LaunchActivity.S());
                    }
                    if (d31Var != null) {
                        v21 I = d31Var.I(R.raw.msg_antispam, ob6.M0(2131745949, null), ob6.M0(2131745912, null));
                        I.j = 5000;
                        I.j();
                        break;
                    }
                }
                break;
        }
    }
}
