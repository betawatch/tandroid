package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq0 b;

    public /* synthetic */ gp0(lq0 lq0Var, int i10) {
        this.a = i10;
        this.b = lq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lq0 lq0Var = this.b;
                lq0Var.x0 = true;
                d20 d20Var = lq0Var.v0;
                d20Var.r.setText("");
                AndroidUtilities.showKeyboard(d20Var.r);
                break;
            default:
                jc jcVar = new jc(12);
                lq0 lq0Var2 = this.b;
                if (!lq0Var2.isKeyboardVisible()) {
                    jcVar.run();
                    break;
                } else {
                    d20 d20Var2 = lq0Var2.v0;
                    if (d20Var2 != null) {
                        AndroidUtilities.hideKeyboard(d20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(jcVar, 300L);
                    break;
                }
        }
    }
}
