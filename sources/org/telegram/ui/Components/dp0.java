package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq0 b;

    public /* synthetic */ dp0(iq0 iq0Var, int i10) {
        this.a = i10;
        this.b = iq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iq0 iq0Var = this.b;
                iq0Var.A0 = true;
                b20 b20Var = iq0Var.y0;
                b20Var.r.setText("");
                AndroidUtilities.showKeyboard(b20Var.r);
                break;
            default:
                sh shVar = new sh(7);
                iq0 iq0Var2 = this.b;
                if (!iq0Var2.isKeyboardVisible()) {
                    shVar.run();
                    break;
                } else {
                    b20 b20Var2 = iq0Var2.y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(shVar, 300L);
                    break;
                }
        }
    }
}
