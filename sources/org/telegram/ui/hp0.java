package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp0 b;

    public /* synthetic */ hp0(pp0 pp0Var, int i10) {
        this.a = i10;
        this.b = pp0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 0:
                pp0 pp0Var = this.b;
                pp0Var.V(pp0Var.b, pp0Var.c, z4, i10);
                pp0Var.finishFragment();
                break;
            default:
                pp0 pp0Var2 = this.b;
                pp0Var2.V(pp0Var2.b, pp0Var2.c, z4, i10);
                pp0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        pp0 pp0Var = this.b;
        pp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = pp0Var.F) != null && p1Var.isShowing()) {
            pp0Var.F.d(true);
        }
    }
}
