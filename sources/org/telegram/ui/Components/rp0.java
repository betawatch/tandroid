package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wq0 b;

    public /* synthetic */ rp0(wq0 wq0Var, int i10) {
        this.a = i10;
        this.b = wq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wq0 wq0Var = this.b;
                wq0Var.A0 = true;
                b20 b20Var = wq0Var.y0;
                b20Var.r.setText("");
                AndroidUtilities.showKeyboard(b20Var.r);
                break;
            default:
                sh shVar = new sh(9);
                wq0 wq0Var2 = this.b;
                if (!wq0Var2.isKeyboardVisible()) {
                    shVar.run();
                    break;
                } else {
                    b20 b20Var2 = wq0Var2.y0;
                    if (b20Var2 != null) {
                        AndroidUtilities.hideKeyboard(b20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(shVar, 300L);
                    break;
                }
        }
    }
}
