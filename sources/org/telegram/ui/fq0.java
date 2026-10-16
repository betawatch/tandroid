package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fq0 implements org.telegram.ui.Components.f5, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oq0 b;

    public /* synthetic */ fq0(oq0 oq0Var, int i10) {
        this.a = i10;
        this.b = oq0Var;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                oq0 oq0Var = this.b;
                oq0Var.V(oq0Var.b, oq0Var.c, z10, i10);
                oq0Var.finishFragment();
                break;
            default:
                oq0 oq0Var2 = this.b;
                oq0Var2.V(oq0Var2.b, oq0Var2.c, z10, i10);
                oq0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        oq0 oq0Var = this.b;
        oq0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = oq0Var.I) != null && m1Var.isShowing()) {
            oq0Var.I.d(true);
        }
    }
}
