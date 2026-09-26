package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uq0 b;

    public /* synthetic */ pp0(uq0 uq0Var, int i10) {
        this.a = i10;
        this.b = uq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uq0 uq0Var = this.b;
                uq0Var.A0 = true;
                c20 c20Var = uq0Var.y0;
                c20Var.r.setText("");
                AndroidUtilities.showKeyboard(c20Var.r);
                break;
            default:
                th thVar = new th(9);
                uq0 uq0Var2 = this.b;
                if (!uq0Var2.isKeyboardVisible()) {
                    thVar.run();
                    break;
                } else {
                    c20 c20Var2 = uq0Var2.y0;
                    if (c20Var2 != null) {
                        AndroidUtilities.hideKeyboard(c20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(thVar, 300L);
                    break;
                }
        }
    }
}
