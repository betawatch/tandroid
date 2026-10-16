package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;

    public /* synthetic */ b0(k4 k4Var, int i10) {
        this.a = i10;
        this.b = k4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k4 k4Var = this.b;
                k4Var.getClass();
                try {
                    if (k4Var.f0.getParent() != null) {
                        ((WindowManager) k4Var.L.getSystemService("window")).removeView(k4Var.f0);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                k4 k4Var2 = this.b;
                l0 l0Var = k4Var2.g0;
                if (l0Var != null && k4Var2.f0 != null) {
                    l0Var.setLayerType(0, null);
                    k4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(k4Var2.L.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new b0(this.b, 11));
                break;
            case 3:
                k4 k4Var3 = this.b;
                float currentProgress = 0.7f - k4Var3.h0.d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f7 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.n90 n90Var = k4Var3.h0.d0;
                    n90Var.a(n90Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(k4Var3.j0, 100L);
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new b0(this.b, 11));
                break;
            case 5:
                this.b.K.dismiss(true);
                break;
            case 6:
                this.b.K.dismiss(true);
                break;
            case 7:
                k4 k4Var4 = this.b;
                l0 l0Var2 = k4Var4.g0;
                if (l0Var2 != null) {
                    l0Var2.setLayerType(0, null);
                    k4Var4.Z = 0;
                    k4Var4.M();
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
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                    k2Var.a = true;
                    U.showAsSheet(new org.telegram.ui.web.z1(new r(this.b, 3)), k2Var);
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
