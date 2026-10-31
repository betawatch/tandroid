package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class co0 implements org.telegram.ui.Components.q4, org.telegram.ui.Components.ik0, org.telegram.ui.ActionBar.i1, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo0 b;

    public /* synthetic */ co0(lo0 lo0Var, int i10) {
        this.a = i10;
        this.b = lo0Var;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.i0(i10, z10);
                break;
            default:
                this.b.i0(i10, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        lo0 lo0Var = this.b;
        if (lo0Var.Y) {
            lo0Var.e0(view, lo0Var.J.e.get(i10));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.v5)) {
            return false;
        }
        org.telegram.ui.Components.xk0 xk0Var = lo0Var.V;
        boolean z10 = !((org.telegram.ui.Cells.v5) view).a();
        lo0Var.X = z10;
        xk0Var.d(i10, view, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        lo0 lo0Var = this.b;
        mo0 mo0Var = lo0Var.t0;
        if (mo0Var == null) {
            lo0Var.d0();
            return;
        }
        switch (mo0Var.a) {
            case 1:
                oo0 oo0Var = mo0Var.b;
                oo0Var.a.d0();
                oo0Var.b.d0();
                break;
            default:
                oo0 oo0Var2 = mo0Var.b;
                oo0Var2.a.d0();
                oo0Var2.b.d0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        lo0 lo0Var = this.b;
        lo0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = lo0Var.m0) != null && k1Var.isShowing()) {
            lo0Var.m0.d(true);
        }
    }
}
