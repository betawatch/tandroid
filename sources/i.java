// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u21 b;

    public /* synthetic */ i(u21 u21Var, byte b) {
        this.a = b;
        this.b = u21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        u21 u21Var = this.b;
        switch (b) {
            case 0:
                new jh8(42, u21Var.c, u21Var.X()).show();
                break;
            default:
                if (LaunchActivity.S() != null) {
                    if (u21Var == null) {
                        u21Var = u21.b0(LaunchActivity.S());
                    }
                    if (u21Var != null) {
                        m21 I = u21Var.I(R.raw.msg_antispam, k96.M0(2131746029, null), k96.M0(2131745992, null));
                        I.j = 5000;
                        I.j();
                        break;
                    }
                }
                break;
        }
    }
}
