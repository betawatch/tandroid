package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ b0(j4 j4Var, int i10) {
        this.a = i10;
        this.b = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                j4Var.getClass();
                try {
                    if (j4Var.f0.getParent() != null) {
                        ((WindowManager) j4Var.L.getSystemService("window")).removeView(j4Var.f0);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 1:
                j4 j4Var2 = this.b;
                k0 k0Var = j4Var2.g0;
                if (k0Var != null && j4Var2.f0 != null) {
                    k0Var.setLayerType(0, null);
                    j4Var2.Z = 0;
                    AndroidUtilities.hideKeyboard(j4Var2.L.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new b0(this.b, 11));
                break;
            case 3:
                j4 j4Var3 = this.b;
                float currentProgress = 0.7f - j4Var3.h0.d0.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f7 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.w80 w80Var = j4Var3.h0.d0;
                    w80Var.a(w80Var.getCurrentProgress() + f7, true);
                    AndroidUtilities.runOnUIThread(j4Var3.j0, 100L);
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
                j4 j4Var4 = this.b;
                k0 k0Var2 = j4Var4.g0;
                if (k0Var2 != null) {
                    k0Var2.setLayerType(0, null);
                    j4Var4.Z = 0;
                    j4Var4.M();
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
                    U.showAsSheet(new org.telegram.ui.web.b2(new s(this.b, 3)), n2Var);
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
