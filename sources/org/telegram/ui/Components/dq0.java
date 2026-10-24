package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir0 b;

    public /* synthetic */ dq0(ir0 ir0Var, int i10) {
        this.a = i10;
        this.b = ir0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ir0 ir0Var = this.b;
                ir0Var.B0 = true;
                k20 k20Var = ir0Var.z0;
                k20Var.r.setText("");
                AndroidUtilities.showKeyboard(k20Var.r);
                break;
            default:
                rc rcVar = new rc(14);
                ir0 ir0Var2 = this.b;
                if (!ir0Var2.isKeyboardVisible()) {
                    rcVar.run();
                    break;
                } else {
                    k20 k20Var2 = ir0Var2.z0;
                    if (k20Var2 != null) {
                        AndroidUtilities.hideKeyboard(k20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(rcVar, 300L);
                    break;
                }
        }
    }
}
