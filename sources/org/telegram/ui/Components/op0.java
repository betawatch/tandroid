package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class op0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uq0 b;

    public /* synthetic */ op0(uq0 uq0Var, int i10) {
        this.a = i10;
        this.b = uq0Var;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        WindowInsets g10 = l1Var.g();
        uq0 uq0Var = this.b;
        uq0Var.processLegacyContainerInsets(g10);
        i0.b f7 = l1Var.a.f(519);
        if (!uq0Var.G0.equals(f7)) {
            uq0Var.G0 = f7;
            uq0Var.container.requestLayout();
        }
        return r0.l1.b;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 1:
                uq0 uq0Var = this.b;
                uq0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = uq0Var.J0) != null && m1Var.isShowing()) {
                    uq0Var.J0.d(true);
                    break;
                }
                break;
            default:
                uq0 uq0Var2 = this.b;
                uq0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = uq0Var2.J0) != null && m1Var2.isShowing()) {
                    uq0Var2.J0.d(true);
                    break;
                }
                break;
        }
    }
}
