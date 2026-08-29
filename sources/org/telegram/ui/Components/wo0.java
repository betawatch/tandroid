package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq0 b;

    public /* synthetic */ wo0(dq0 dq0Var, int i10) {
        this.a = i10;
        this.b = dq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dq0 dq0Var = this.b;
                dq0Var.w0 = true;
                x10 x10Var = dq0Var.u0;
                x10Var.r.setText("");
                AndroidUtilities.showKeyboard(x10Var.r);
                break;
            default:
                g5 g5Var = new g5(14);
                dq0 dq0Var2 = this.b;
                if (!dq0Var2.isKeyboardVisible()) {
                    g5Var.run();
                    break;
                } else {
                    x10 x10Var2 = dq0Var2.u0;
                    if (x10Var2 != null) {
                        AndroidUtilities.hideKeyboard(x10Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(g5Var, 300L);
                    break;
                }
        }
    }
}
