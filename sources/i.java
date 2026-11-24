// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c41 b;

    public /* synthetic */ i(c41 c41Var, byte b) {
        this.a = b;
        this.b = c41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        c41 c41Var = this.b;
        switch (b) {
            case 0:
                new kj8(42, c41Var.c, c41Var.X()).show();
                break;
            default:
                if (LaunchActivity.S() != null) {
                    if (c41Var == null) {
                        c41Var = c41.b0(LaunchActivity.S());
                    }
                    if (c41Var != null) {
                        u31 I = c41Var.I(R.raw.msg_antispam, jb6.M0(2131745955, null), jb6.M0(2131745918, null));
                        I.j = 5000;
                        I.j();
                        break;
                    }
                }
                break;
        }
    }
}
