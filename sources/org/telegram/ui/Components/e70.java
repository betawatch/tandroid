package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p70 b;

    public /* synthetic */ e70(p70 p70Var, int i10) {
        this.a = i10;
        this.b = p70Var;
    }

    @Override // org.telegram.ui.ActionBar.n1
    public final void n(KeyEvent keyEvent) {
        p70 p70Var;
        k70 k70Var;
        p70 p70Var2;
        k70 k70Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k70Var = (p70Var = this.b).m) != null && k70Var.isShowing()) {
                    p70Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k70Var2 = (p70Var2 = this.b).m) != null && k70Var2.isShowing()) {
                    p70Var2.u();
                    break;
                }
                break;
        }
    }
}
