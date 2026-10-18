package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr0 b;

    public /* synthetic */ yp0(dr0 dr0Var, int i10) {
        this.a = i10;
        this.b = dr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dr0 dr0Var = this.b;
                dr0Var.A0 = true;
                k20 k20Var = dr0Var.y0;
                k20Var.r.setText("");
                AndroidUtilities.showKeyboard(k20Var.r);
                break;
            default:
                rc rcVar = new rc(14);
                dr0 dr0Var2 = this.b;
                if (!dr0Var2.isKeyboardVisible()) {
                    rcVar.run();
                    break;
                } else {
                    k20 k20Var2 = dr0Var2.y0;
                    if (k20Var2 != null) {
                        AndroidUtilities.hideKeyboard(k20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(rcVar, 300L);
                    break;
                }
        }
    }
}
