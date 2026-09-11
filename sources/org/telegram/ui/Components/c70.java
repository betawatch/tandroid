package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class c70 implements org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n70 b;

    public /* synthetic */ c70(n70 n70Var, int i10) {
        this.a = i10;
        this.b = n70Var;
    }

    @Override // org.telegram.ui.ActionBar.l1
    public final void n(KeyEvent keyEvent) {
        n70 n70Var;
        i70 i70Var;
        n70 n70Var2;
        i70 i70Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i70Var = (n70Var = this.b).m) != null && i70Var.isShowing()) {
                    n70Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (i70Var2 = (n70Var2 = this.b).m) != null && i70Var2.isShowing()) {
                    n70Var2.u();
                    break;
                }
                break;
        }
    }
}
