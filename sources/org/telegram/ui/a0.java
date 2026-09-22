package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ a0(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h4 h4Var = this.b;
                h4Var.getClass();
                try {
                    if (h4Var.f0.getParent() != null) {
                        ((WindowManager) h4Var.L.getSystemService("window")).removeView(h4Var.f0);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                h4 h4Var2 = this.b;
                j0 j0Var = h4Var2.g0;
                if (j0Var != null && h4Var2.f0 != null) {
                    j0Var.setLayerType(0, null);
                    h4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(h4Var2.L.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a0(this.b, 11));
                break;
            case 3:
                h4 h4Var3 = this.b;
                float currentProgress = 0.7f - h4Var3.h0.d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f7 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.x80 x80Var = h4Var3.h0.d0;
                    x80Var.a(x80Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(h4Var3.j0, 100L);
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new a0(this.b, 11));
                break;
            case 5:
                this.b.K.dismiss(true);
                break;
            case 6:
                this.b.K.dismiss(true);
                break;
            case 7:
                h4 h4Var4 = this.b;
                j0 j0Var2 = h4Var4.g0;
                if (j0Var2 != null) {
                    j0Var2.setLayerType(0, null);
                    h4Var4.Z = 0;
                    h4Var4.M();
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
                    U.showAsSheet(new org.telegram.ui.web.a2(new r(this.b, 3)), l2Var);
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
