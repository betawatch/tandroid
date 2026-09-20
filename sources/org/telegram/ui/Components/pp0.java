package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                b20 b20Var = uq0Var.y0;
                b20Var.r.setText("");
                AndroidUtilities.showKeyboard(b20Var.r);
                break;
            default:
                sh shVar = new sh(9);
                uq0 uq0Var2 = this.b;
                if (!uq0Var2.isKeyboardVisible()) {
                    shVar.run();
                    break;
                } else {
                    b20 b20Var2 = uq0Var2.y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(shVar, 300L);
                    break;
                }
        }
    }
}
