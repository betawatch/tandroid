package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq0 b;

    public /* synthetic */ hp0(mq0 mq0Var, int i10) {
        this.a = i10;
        this.b = mq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mq0 mq0Var = this.b;
                mq0Var.x0 = true;
                d20 d20Var = mq0Var.v0;
                d20Var.r.setText("");
                AndroidUtilities.showKeyboard(d20Var.r);
                break;
            default:
                jc jcVar = new jc(12);
                mq0 mq0Var2 = this.b;
                if (!mq0Var2.isKeyboardVisible()) {
                    jcVar.run();
                    break;
                } else {
                    d20 d20Var2 = mq0Var2.v0;
                    if (d20Var2 != null) {
                        AndroidUtilities.hideKeyboard(d20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(jcVar, 300L);
                    break;
                }
        }
    }
}
