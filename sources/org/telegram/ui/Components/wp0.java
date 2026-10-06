package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class wp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ br0 b;

    public /* synthetic */ wp0(br0 br0Var, int i10) {
        this.a = i10;
        this.b = br0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                br0 br0Var = this.b;
                br0Var.A0 = true;
                f20 f20Var = br0Var.y0;
                f20Var.r.setText("");
                AndroidUtilities.showKeyboard(f20Var.r);
                break;
            default:
                uh uhVar = new uh(9);
                br0 br0Var2 = this.b;
                if (!br0Var2.isKeyboardVisible()) {
                    uhVar.run();
                    break;
                } else {
                    f20 f20Var2 = br0Var2.y0;
                    if (f20Var2 != null) {
                        AndroidUtilities.hideKeyboard(f20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(uhVar, 300L);
                    break;
                }
        }
    }
}
