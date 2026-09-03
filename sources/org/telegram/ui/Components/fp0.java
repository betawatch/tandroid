package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq0 b;

    public /* synthetic */ fp0(lq0 lq0Var, int i10) {
        this.a = i10;
        this.b = lq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lq0 lq0Var = this.b;
                lq0Var.x0 = true;
                d20 d20Var = lq0Var.v0;
                d20Var.r.setText("");
                AndroidUtilities.showKeyboard(d20Var.r);
                break;
            default:
                mc mcVar = new mc(10);
                lq0 lq0Var2 = this.b;
                if (!lq0Var2.isKeyboardVisible()) {
                    mcVar.run();
                    break;
                } else {
                    d20 d20Var2 = lq0Var2.v0;
                    if (d20Var2 != null) {
                        AndroidUtilities.hideKeyboard(d20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(mcVar, 300L);
                    break;
                }
        }
    }
}
