package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                e20 e20Var = wq0Var.y0;
                e20Var.r.setText("");
                AndroidUtilities.showKeyboard(e20Var.r);
                break;
            default:
                th thVar = new th(9);
                wq0 wq0Var2 = this.b;
                if (!wq0Var2.isKeyboardVisible()) {
                    thVar.run();
                    break;
                } else {
                    e20 e20Var2 = wq0Var2.y0;
                    if (e20Var2 != null) {
                        AndroidUtilities.hideKeyboard(e20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(thVar, 300L);
                    break;
                }
        }
    }
}
