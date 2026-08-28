package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ c0(l4 l4Var, int i9) {
        this.a = i9;
        this.b = l4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                l4Var.getClass();
                try {
                    if (l4Var.b0.getParent() != null) {
                        ((WindowManager) l4Var.H.getSystemService("window")).removeView(l4Var.b0);
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 1:
                l4 l4Var2 = this.b;
                m0 m0Var = l4Var2.c0;
                if (m0Var != null && l4Var2.b0 != null) {
                    m0Var.setLayerType(0, null);
                    l4Var2.V = 0;
                    AndroidUtilities.hideKeyboard(l4Var2.H.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new c0(this.b, 11));
                break;
            case 3:
                l4 l4Var3 = this.b;
                float currentProgress = 0.7f - l4Var3.d0.W.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f10 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.v70 v70Var = l4Var3.d0.W;
                    v70Var.a(v70Var.getCurrentProgress() + f10, true);
                    AndroidUtilities.runOnUIThread(l4Var3.f0, 100L);
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new c0(this.b, 11));
                break;
            case 5:
                this.b.G.dismiss(true);
                break;
            case 6:
                this.b.G.dismiss(true);
                break;
            case 7:
                l4 l4Var4 = this.b;
                m0 m0Var2 = l4Var4.c0;
                if (m0Var2 != null) {
                    m0Var2.setLayerType(0, null);
                    l4Var4.V = 0;
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
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                    m2Var.a = true;
                    U.showAsSheet(new org.telegram.ui.web.u1(new r(this.b, 3)), m2Var);
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
