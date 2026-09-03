package org.telegram.ui;

import android.view.KeyEvent;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class op0 implements org.telegram.ui.Components.y4, org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp0 b;

    public /* synthetic */ op0(wp0 wp0Var, int i10) {
        this.a = i10;
        this.b = wp0Var;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        switch (this.a) {
            case 0:
                wp0 wp0Var = this.b;
                wp0Var.V(wp0Var.b, wp0Var.c, z4, i10);
                wp0Var.finishFragment();
                break;
            default:
                wp0 wp0Var2 = this.b;
                wp0Var2.V(wp0Var2.b, wp0Var2.c, z4, i10);
                wp0Var2.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.p1 p1Var;
        wp0 wp0Var = this.b;
        wp0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (p1Var = wp0Var.F) != null && p1Var.isShowing()) {
            wp0Var.F.d(true);
        }
    }
}
