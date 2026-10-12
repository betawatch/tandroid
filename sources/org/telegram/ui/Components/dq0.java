package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr0 b;

    public /* synthetic */ dq0(jr0 jr0Var, int i10) {
        this.a = i10;
        this.b = jr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jr0 jr0Var = this.b;
                jr0Var.A0 = true;
                o20 o20Var = jr0Var.y0;
                o20Var.r.setText("");
                AndroidUtilities.showKeyboard(o20Var.r);
                break;
            default:
                ve veVar = new ve(10);
                jr0 jr0Var2 = this.b;
                if (!jr0Var2.isKeyboardVisible()) {
                    veVar.run();
                    break;
                } else {
                    o20 o20Var2 = jr0Var2.y0;
                    if (o20Var2 != null) {
                        AndroidUtilities.hideKeyboard(o20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(veVar, 300L);
                    break;
                }
        }
    }
}
