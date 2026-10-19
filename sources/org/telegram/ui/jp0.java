package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp0 b;

    public /* synthetic */ jp0(sp0 sp0Var, int i10) {
        this.a = i10;
        this.b = sp0Var;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                sp0 sp0Var = this.b;
                sp0Var.V(sp0Var.b, sp0Var.c, z10, i10);
                sp0Var.finishFragment();
                break;
            default:
                sp0 sp0Var2 = this.b;
                sp0Var2.V(sp0Var2.b, sp0Var2.c, z10, i10);
                sp0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        sp0 sp0Var = this.b;
        sp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = sp0Var.I) != null && m1Var.isShowing()) {
            sp0Var.I.d(true);
        }
    }
}
