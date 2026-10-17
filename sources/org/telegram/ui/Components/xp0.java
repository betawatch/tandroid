package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xp0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr0 b;

    public /* synthetic */ xp0(dr0 dr0Var, int i10) {
        this.a = i10;
        this.b = dr0Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        dr0 dr0Var = this.b;
        dr0Var.processLegacyContainerInsets(g10);
        i0.c f7 = k1Var.a.f(519);
        if (!dr0Var.G0.equals(f7)) {
            dr0Var.G0 = f7;
            dr0Var.container.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 1:
                dr0 dr0Var = this.b;
                dr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = dr0Var.J0) != null && m1Var.isShowing()) {
                    dr0Var.J0.d(true);
                    break;
                }
                break;
            default:
                dr0 dr0Var2 = this.b;
                dr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = dr0Var2.J0) != null && m1Var2.isShowing()) {
                    dr0Var2.J0.d(true);
                    break;
                }
                break;
        }
    }
}
