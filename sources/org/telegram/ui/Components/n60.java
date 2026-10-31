package org.telegram.ui.Components;

import android.view.KeyEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n60 implements org.telegram.ui.ActionBar.i1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z60 b;

    public /* synthetic */ n60(z60 z60Var, int i10) {
        this.a = i10;
        this.b = z60Var;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public final void r(KeyEvent keyEvent) {
        z60 z60Var;
        u60 u60Var;
        z60 z60Var2;
        u60 u60Var2;
        switch (this.a) {
            case 0:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (u60Var = (z60Var = this.b).m) != null && u60Var.isShowing()) {
                    z60Var.u();
                    break;
                }
                break;
            default:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (u60Var2 = (z60Var2 = this.b).m) != null && u60Var2.isShowing()) {
                    z60Var2.u();
                    break;
                }
                break;
        }
    }
}
