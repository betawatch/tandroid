package ci;

import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1 b;

    public /* synthetic */ b4(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        this.a = i3;
        this.b = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        org.telegram.ui.ActionBar.s1 s1Var = this.b;
        switch (i3) {
            case 0:
                s1Var.dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.ac Q = org.telegram.ui.Components.fc.a0(T).Q(R.raw.error, 36, bd.M0(2131748560, null));
                    Q.t = true;
                    Q.j();
                    break;
                }
                break;
            case 1:
                s1Var.dismiss();
                break;
            case 2:
                s1Var.dismiss();
                break;
            default:
                if (!s1Var.isShowing()) {
                    try {
                        s1Var.show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
