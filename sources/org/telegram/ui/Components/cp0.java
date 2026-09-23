package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                c20 c20Var = hq0Var.y0;
                c20Var.r.setText("");
                AndroidUtilities.showKeyboard(c20Var.r);
                break;
            default:
                th thVar = new th(7);
                hq0 hq0Var2 = this.b;
                if (!hq0Var2.isKeyboardVisible()) {
                    thVar.run();
                    break;
                } else {
                    c20 c20Var2 = hq0Var2.y0;
                    if (c20Var2 != null) {
                        AndroidUtilities.hideKeyboard(c20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(thVar, 300L);
                    break;
                }
        }
    }
}
