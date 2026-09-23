package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class d70 implements org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o70 b;

    public /* synthetic */ d70(o70 o70Var, int i10) {
        this.a = i10;
        this.b = o70Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public final void o(KeyEvent keyEvent) {
        o70 o70Var;
        j70 j70Var;
        o70 o70Var2;
        j70 j70Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (j70Var = (o70Var = this.b).m) != null && j70Var.isShowing()) {
                    o70Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (j70Var2 = (o70Var2 = this.b).m) != null && j70Var2.isShowing()) {
                    o70Var2.u();
                    break;
                }
                break;
        }
    }
}
