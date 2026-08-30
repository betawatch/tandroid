package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ c0(l4 l4Var, int i10) {
        this.a = i10;
        this.b = l4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                l4Var.getClass();
                try {
                    if (l4Var.c0.getParent() != null) {
                        ((WindowManager) l4Var.I.getSystemService("window")).removeView(l4Var.c0);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                l4 l4Var2 = this.b;
                l0 l0Var = l4Var2.d0;
                if (l0Var != null && l4Var2.c0 != null) {
                    l0Var.setLayerType(0, null);
                    l4Var2.W = 0;
                    AndroidUtilities.hideKeyboard(l4Var2.I.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new c0(this.b, 11));
                break;
            case 3:
                l4 l4Var3 = this.b;
                float currentProgress = 0.7f - l4Var3.e0.a0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f10 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.o80 o80Var = l4Var3.e0.a0;
                    o80Var.a(o80Var.getCurrentProgress() + f10, true);
                    AndroidUtilities.runOnUIThread(l4Var3.g0, 100L);
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new c0(this.b, 11));
                break;
            case 5:
                this.b.H.dismiss(true);
                break;
            case 6:
                this.b.H.dismiss(true);
                break;
            case 7:
                l4 l4Var4 = this.b;
                l0 l0Var2 = l4Var4.d0;
                if (l0Var2 != null) {
                    l0Var2.setLayerType(0, null);
                    l4Var4.W = 0;
                    l4Var4.M();
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
                    U.showAsSheet(new org.telegram.ui.web.x1(new t(this.b, 3)), n2Var);
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
