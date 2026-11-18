package di;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 b;

    public /* synthetic */ u3(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        this.a = i7;
        this.b = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.u1 u1Var = this.b;
        switch (i7) {
            case 0:
                u1Var.dismiss();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(T).Q(R.raw.error, 36, gd.M0(2131748360, null));
                    Q.t = true;
                    Q.j();
                    break;
                }
                break;
            case 1:
                u1Var.dismiss();
                break;
            case 2:
                u1Var.dismiss();
                break;
            default:
                if (!u1Var.isShowing()) {
                    try {
                        u1Var.show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
