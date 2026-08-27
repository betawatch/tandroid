package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q60 implements org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b70 b;

    public /* synthetic */ q60(b70 b70Var, int i10) {
        this.a = i10;
        this.b = b70Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public final void k(KeyEvent keyEvent) {
        b70 b70Var;
        w60 w60Var;
        b70 b70Var2;
        w60 w60Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (w60Var = (b70Var = this.b).m) != null && w60Var.isShowing()) {
                    b70Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (w60Var2 = (b70Var2 = this.b).m) != null && w60Var2.isShowing()) {
                    b70Var2.u();
                    break;
                }
                break;
        }
    }
}
