package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
