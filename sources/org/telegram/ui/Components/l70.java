package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l70 implements org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w70 b;

    public /* synthetic */ l70(w70 w70Var, int i10) {
        this.a = i10;
        this.b = w70Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public final void p(KeyEvent keyEvent) {
        w70 w70Var;
        r70 r70Var;
        w70 w70Var2;
        r70 r70Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r70Var = (w70Var = this.b).m) != null && r70Var.isShowing()) {
                    w70Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (r70Var2 = (w70Var2 = this.b).m) != null && r70Var2.isShowing()) {
                    w70Var2.u();
                    break;
                }
                break;
        }
    }
}
