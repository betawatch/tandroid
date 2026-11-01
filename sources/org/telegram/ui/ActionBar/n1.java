package org.telegram.ui.ActionBar;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;

    public /* synthetic */ n1(x1 x1Var, int i10) {
        this.a = i10;
        this.b = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        x1 x1Var = this.b;
        switch (i10) {
            case 0:
                x1Var.dismiss();
                break;
            case 1:
                if (!x1Var.isShowing()) {
                    try {
                        x1Var.show();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 2:
                x1Var.dismiss();
                k2 T = LaunchActivity.T();
                if (T != null) {
                    wb Q = cc.a0(T).Q(R.raw.error, 36, dd.L0(2131748567, null));
                    Q.t = true;
                    Q.j();
                    break;
                }
                break;
            default:
                x1Var.dismiss();
                break;
        }
    }
}
