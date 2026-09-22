package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class n70 implements org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y70 b;

    public /* synthetic */ n70(y70 y70Var, int i10) {
        this.a = i10;
        this.b = y70Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public final void o(KeyEvent keyEvent) {
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
