package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class yp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ er0 b;

    public /* synthetic */ yp0(er0 er0Var, int i10) {
        this.a = i10;
        this.b = er0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                er0 er0Var = this.b;
                er0Var.B0 = true;
                k20 k20Var = er0Var.z0;
                k20Var.r.setText("");
                AndroidUtilities.showKeyboard(k20Var.r);
                break;
            default:
                rc rcVar = new rc(14);
                er0 er0Var2 = this.b;
                if (!er0Var2.isKeyboardVisible()) {
                    rcVar.run();
                    break;
                } else {
                    k20 k20Var2 = er0Var2.z0;
                    if (k20Var2 != null) {
                        AndroidUtilities.hideKeyboard(k20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(rcVar, 300L);
                    break;
                }
        }
    }
}
