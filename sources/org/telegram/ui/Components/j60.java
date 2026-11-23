package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j60 implements org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x60 b;

    public /* synthetic */ j60(x60 x60Var, int i7) {
        this.a = i7;
        this.b = x60Var;
    }

    @Override // org.telegram.ui.ActionBar.e1
    public final void m(KeyEvent keyEvent) {
        x60 x60Var;
        q60 q60Var;
        x60 x60Var2;
        q60 q60Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (q60Var = (x60Var = this.b).m) != null && q60Var.isShowing()) {
                    x60Var.v();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (q60Var2 = (x60Var2 = this.b).m) != null && q60Var2.isShowing()) {
                    x60Var2.v();
                    break;
                }
                break;
        }
    }
}
