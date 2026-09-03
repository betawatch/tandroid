package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;

    public /* synthetic */ d0(n4 n4Var, int i10) {
        this.a = i10;
        this.b = n4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n4 n4Var = this.b;
                n4Var.getClass();
                try {
                    if (n4Var.c0.getParent() != null) {
                        ((WindowManager) n4Var.I.getSystemService("window")).removeView(n4Var.c0);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                n4 n4Var2 = this.b;
                n0 n0Var = n4Var2.d0;
                if (n0Var != null && n4Var2.c0 != null) {
                    n0Var.setLayerType(0, null);
                    n4Var2.W = 0;
                    AndroidUtilities.hideKeyboard(n4Var2.I.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new d0(this.b, 11));
                break;
            case 3:
                n4 n4Var3 = this.b;
                float currentProgress = 0.7f - n4Var3.e0.a0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f10 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.o80 o80Var = n4Var3.e0.a0;
                    o80Var.a(o80Var.getCurrentProgress() + f10, true);
                    AndroidUtilities.runOnUIThread(n4Var3.g0, 100L);
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new d0(this.b, 11));
                break;
            case 5:
                this.b.H.dismiss(true);
                break;
            case 6:
                this.b.H.dismiss(true);
                break;
            case 7:
                n4 n4Var4 = this.b;
                n0 n0Var2 = n4Var4.d0;
                if (n0Var2 != null) {
                    n0Var2.setLayerType(0, null);
                    n4Var4.W = 0;
                    n4Var4.M();
                    break;
                }
                break;
            case 8:
                this.b.c0();
                break;
            case 9:
                this.b.h0();
                break;
            case 10:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                    n2Var.a = true;
                    U.showAsSheet(new org.telegram.ui.web.y1(new t(this.b, 3)), n2Var);
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
