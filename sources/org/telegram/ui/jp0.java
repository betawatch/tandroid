package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp0 b;

    public /* synthetic */ jp0(rp0 rp0Var, int i10) {
        this.a = i10;
        this.b = rp0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 0:
                rp0 rp0Var = this.b;
                rp0Var.V(rp0Var.b, rp0Var.c, z4, i10);
                rp0Var.finishFragment();
                break;
            default:
                rp0 rp0Var2 = this.b;
                rp0Var2.V(rp0Var2.b, rp0Var2.c, z4, i10);
                rp0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        rp0 rp0Var = this.b;
        rp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = rp0Var.F) != null && p1Var.isShowing()) {
            rp0Var.F.d(true);
        }
    }
}
