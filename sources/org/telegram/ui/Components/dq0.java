package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir0 b;

    public /* synthetic */ dq0(ir0 ir0Var, int i10) {
        this.a = i10;
        this.b = ir0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ir0 ir0Var = this.b;
                ir0Var.A0 = true;
                o20 o20Var = ir0Var.y0;
                o20Var.r.setText("");
                AndroidUtilities.showKeyboard(o20Var.r);
                break;
            default:
                ve veVar = new ve(10);
                ir0 ir0Var2 = this.b;
                if (!ir0Var2.isKeyboardVisible()) {
                    veVar.run();
                    break;
                } else {
                    o20 o20Var2 = ir0Var2.y0;
                    if (o20Var2 != null) {
                        AndroidUtilities.hideKeyboard(o20Var2.r);
                    }
                    AndroidUtilities.runOnUIThread(veVar, 300L);
                    break;
                }
        }
    }
}
