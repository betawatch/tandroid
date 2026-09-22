package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hq0 b;

    public /* synthetic */ cp0(hq0 hq0Var, int i10) {
        this.a = i10;
        this.b = hq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hq0 hq0Var = this.b;
                hq0Var.A0 = true;
                b20 b20Var = hq0Var.y0;
                b20Var.r.setText("");
                AndroidUtilities.showKeyboard(b20Var.r);
                break;
            default:
                sh shVar = new sh(7);
                hq0 hq0Var2 = this.b;
                if (!hq0Var2.isKeyboardVisible()) {
                    shVar.run();
                    break;
                } else {
                    b20 b20Var2 = hq0Var2.y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(shVar, 300L);
                    break;
                }
        }
    }
}
