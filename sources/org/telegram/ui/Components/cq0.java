package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir0 b;

    public /* synthetic */ cq0(ir0 ir0Var, int i10) {
        this.a = i10;
        this.b = ir0Var;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        ir0 ir0Var = this.b;
        ir0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.a.f(519);
        if (!ir0Var.H0.equals(f7)) {
            ir0Var.H0 = f7;
            ir0Var.container.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.k1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.a) {
            case 1:
                ir0 ir0Var = this.b;
                ir0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = ir0Var.K0) != null && m1Var.isShowing()) {
                    ir0Var.K0.d(true);
                    break;
                }
                break;
            default:
                ir0 ir0Var2 = this.b;
                ir0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = ir0Var2.K0) != null && m1Var2.isShowing()) {
                    ir0Var2.K0.d(true);
                    break;
                }
                break;
        }
    }
}
