package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class km0 implements org.telegram.ui.Components.z4, org.telegram.ui.ActionBar.e1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ om0 b;

    public /* synthetic */ km0(om0 om0Var, int i7) {
        this.a = i7;
        this.b = om0Var;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                om0 om0Var = this.b;
                om0Var.a0(om0Var.b, om0Var.c, z10, i7);
                om0Var.finishFragment();
                break;
            default:
                om0 om0Var2 = this.b;
                om0Var2.a0(om0Var2.b, om0Var2.c, z10, i7);
                om0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void m(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        om0 om0Var = this.b;
        om0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = om0Var.J) != null && g1Var.isShowing()) {
            om0Var.J.d(true);
        }
    }
}
