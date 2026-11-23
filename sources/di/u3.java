package di;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 b;

    public /* synthetic */ u3(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        this.a = i7;
        this.b = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.t1 t1Var = this.b;
        switch (i7) {
            case 0:
                t1Var.dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.b0(T).Q(R.raw.error, 36, hd.N0(2131748359, null));
                    Q.t = true;
                    Q.j();
                    break;
                }
                break;
            case 1:
                t1Var.dismiss();
                break;
            case 2:
                t1Var.dismiss();
                break;
            default:
                if (!t1Var.isShowing()) {
                    try {
                        t1Var.show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
