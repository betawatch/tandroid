package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq0 b;

    public /* synthetic */ gp0(lq0 lq0Var, int i10) {
        this.a = i10;
        this.b = lq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lq0 lq0Var = this.b;
                lq0Var.x0 = true;
                c20 c20Var = lq0Var.v0;
                c20Var.r.setText("");
                AndroidUtilities.showKeyboard(c20Var.r);
                break;
            default:
                mc mcVar = new mc(10);
                lq0 lq0Var2 = this.b;
                if (!lq0Var2.isKeyboardVisible()) {
                    mcVar.run();
                    break;
                } else {
                    c20 c20Var2 = lq0Var2.v0;
                    if (c20Var2 != null) {
                        AndroidUtilities.hideKeyboard(c20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(mcVar, 300L);
                    break;
                }
        }
    }
}
