package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class xp0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ er0 b;

    public /* synthetic */ xp0(er0 er0Var, int i10) {
        this.a = i10;
        this.b = er0Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        er0 er0Var = this.b;
        er0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.a.f(519);
        if (!er0Var.H0.equals(f7)) {
            er0Var.H0 = f7;
            er0Var.container.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 1:
                er0 er0Var = this.b;
                er0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = er0Var.K0) != null && m1Var.isShowing()) {
                    er0Var.K0.d(true);
                    break;
                }
                break;
            default:
                er0 er0Var2 = this.b;
                er0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = er0Var2.K0) != null && m1Var2.isShowing()) {
                    er0Var2.K0.d(true);
                    break;
                }
                break;
        }
    }
}
