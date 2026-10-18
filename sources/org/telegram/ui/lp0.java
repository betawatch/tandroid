package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp0 implements org.telegram.ui.Components.e5, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ up0 b;

    public /* synthetic */ lp0(up0 up0Var, int i10) {
        this.a = i10;
        this.b = up0Var;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                up0 up0Var = this.b;
                up0Var.V(up0Var.b, up0Var.c, z10, i10);
                up0Var.finishFragment();
                break;
            default:
                up0 up0Var2 = this.b;
                up0Var2.V(up0Var2.b, up0Var2.c, z10, i10);
                up0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        up0 up0Var = this.b;
        up0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = up0Var.I) != null && m1Var.isShowing()) {
            up0Var.I.d(true);
        }
    }
}
