package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp0 implements org.telegram.ui.Components.x4, org.telegram.ui.ActionBar.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp0 b;

    public /* synthetic */ bp0(jp0 jp0Var, int i10) {
        this.a = i10;
        this.b = jp0Var;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                jp0 jp0Var = this.b;
                jp0Var.V(jp0Var.b, jp0Var.c, z10, i10);
                jp0Var.finishFragment();
                break;
            default:
                jp0 jp0Var2 = this.b;
                jp0Var2.V(jp0Var2.b, jp0Var2.c, z10, i10);
                jp0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n1 n1Var;
        jp0 jp0Var = this.b;
        jp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n1Var = jp0Var.E) != null && n1Var.isShowing()) {
            jp0Var.E.d(true);
        }
    }
}
