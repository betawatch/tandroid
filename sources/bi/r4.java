package bi;

import org.telegram.messenger.beta.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 b;

    public /* synthetic */ r4(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.cc Q = org.telegram.ui.Components.hc.a0(T).Q(R.raw.error, 36, org.telegram.messenger.id.M0(2131748553, null));
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
