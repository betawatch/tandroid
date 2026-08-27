package org.telegram.ui;

import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ d0(m4 m4Var, int i10) {
        this.a = i10;
        this.b = m4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m4 m4Var = this.b;
                m4Var.getClass();
                try {
                    if (m4Var.b0.getParent() != null) {
                        ((WindowManager) m4Var.H.getSystemService("window")).removeView(m4Var.b0);
                        break;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 1:
                m4 m4Var2 = this.b;
                n0 n0Var = m4Var2.c0;
                if (n0Var != null && m4Var2.b0 != null) {
                    n0Var.setLayerType(0, null);
                    m4Var2.V = 0;
                    AndroidUtilities.hideKeyboard(m4Var2.H.getCurrentFocus());
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new d0(this.b, 11));
                break;
            case 3:
                m4 m4Var3 = this.b;
                float currentProgress = 0.7f - m4Var3.d0.W.getCurrentProgress();
                if (currentProgress > 0.0f) {
                    float f10 = currentProgress < 0.25f ? 0.01f : 0.02f;
                    org.telegram.ui.Components.z70 z70Var = m4Var3.d0.W;
                    z70Var.a(z70Var.getCurrentProgress() + f10, true);
                    AndroidUtilities.runOnUIThread(m4Var3.f0, 100L);
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new d0(this.b, 11));
                break;
            case 5:
                this.b.G.dismiss(true);
                break;
            case 6:
                this.b.G.dismiss(true);
                break;
            case 7:
                m4 m4Var4 = this.b;
                n0 n0Var2 = m4Var4.c0;
                if (n0Var2 != null) {
                    n0Var2.setLayerType(0, null);
                    m4Var4.V = 0;
                    m4Var4.M();
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
                    U.showAsSheet(new org.telegram.ui.web.v1(new s(this.b, 3)), l2Var);
                    break;
                }
                break;
            default:
                this.b.f0();
                break;
        }
    }
}
