package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp0 b;

    public /* synthetic */ lo0(rp0 rp0Var, int i9) {
        this.a = i9;
        this.b = rp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rp0 rp0Var = this.b;
                rp0Var.w0 = true;
                m10 m10Var = rp0Var.u0;
                m10Var.r.setText("");
                AndroidUtilities.showKeyboard(m10Var.r);
                break;
            default:
                hc hcVar = new hc(12);
                rp0 rp0Var2 = this.b;
                if (!rp0Var2.isKeyboardVisible()) {
                    hcVar.run();
                    break;
                } else {
                    m10 m10Var2 = rp0Var2.u0;
                    if (m10Var2 != null) {
                        AndroidUtilities.hideKeyboard(m10Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(hcVar, 300L);
                    break;
                }
        }
    }
}
