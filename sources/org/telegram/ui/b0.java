package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ b0(l4 l4Var, int i10) {
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
                    if (l4Var.f0.getParent() != null) {
                        ((WindowManager) l4Var.L.getSystemService("window")).removeView(l4Var.f0);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                l4 l4Var2 = this.b;
                m0 m0Var = l4Var2.g0;
                if (m0Var != null && l4Var2.f0 != null) {
                    m0Var.setLayerType(0, null);
                    l4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(l4Var2.L.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new b0(this.b, 11));
                break;
            case 3:
                l4 l4Var3 = this.b;
                float currentProgress = 0.7f - l4Var3.h0.d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f7 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.g90 g90Var = l4Var3.h0.d0;
                    g90Var.a(g90Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(l4Var3.j0, 100L);
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
                l4 l4Var4 = this.b;
                m0 m0Var2 = l4Var4.g0;
                if (m0Var2 != null) {
                    m0Var2.setLayerType(0, null);
                    l4Var4.Z = 0;
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
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.a = true;
                    U.showAsSheet(new org.telegram.ui.web.x1(new r(this.b, 3)), l2Var);
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
