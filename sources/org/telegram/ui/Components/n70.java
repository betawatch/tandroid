package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n70 implements org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y70 b;

    public /* synthetic */ n70(y70 y70Var, int i10) {
        this.a = i10;
        this.b = y70Var;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public final void p(KeyEvent keyEvent) {
        y70 y70Var;
        t70 t70Var;
        y70 y70Var2;
        t70 t70Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (t70Var = (y70Var = this.b).m) != null && t70Var.isShowing()) {
                    y70Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (t70Var2 = (y70Var2 = this.b).m) != null && t70Var2.isShowing()) {
                    y70Var2.u();
                    break;
                }
                break;
        }
    }
}
