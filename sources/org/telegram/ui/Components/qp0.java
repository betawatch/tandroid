package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vq0 b;

    public /* synthetic */ qp0(vq0 vq0Var, int i10) {
        this.a = i10;
        this.b = vq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vq0 vq0Var = this.b;
                vq0Var.A0 = true;
                b20 b20Var = vq0Var.y0;
                b20Var.r.setText("");
                AndroidUtilities.showKeyboard(b20Var.r);
                break;
            default:
                sh shVar = new sh(7);
                vq0 vq0Var2 = this.b;
                if (!vq0Var2.isKeyboardVisible()) {
                    shVar.run();
                    break;
                } else {
                    b20 b20Var2 = vq0Var2.y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(shVar, 300L);
                    break;
                }
        }
    }
}
