package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f70 implements org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q70 b;

    public /* synthetic */ f70(q70 q70Var, int i10) {
        this.a = i10;
        this.b = q70Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public final void n(KeyEvent keyEvent) {
        q70 q70Var;
        l70 l70Var;
        q70 q70Var2;
        l70 l70Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (l70Var = (q70Var = this.b).m) != null && l70Var.isShowing()) {
                    q70Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (l70Var2 = (q70Var2 = this.b).m) != null && l70Var2.isShowing()) {
                    q70Var2.u();
                    break;
                }
                break;
        }
    }
}
