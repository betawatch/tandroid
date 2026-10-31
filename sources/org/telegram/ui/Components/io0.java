package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class io0 implements ei.n, r0.m, org.telegram.ui.ActionBar.i1, ei.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ op0 b;

    public /* synthetic */ io0(op0 op0Var, int i10) {
        this.a = i10;
        this.b = op0Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        op0 op0Var = this.b;
        op0Var.t0(g10);
        i0.c f7 = j1Var.a.f(519);
        if (!op0Var.y2.equals(f7)) {
            op0Var.y2 = f7;
            op0Var.c.requestLayout();
        }
        return r0.j1.b;
    }

    @Override // ei.o
    public int c() {
        op0 op0Var = this.b;
        op0Var.getClass();
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, op0Var.I0);
    }

    @Override // ei.n
    public void j(int i10) {
        op0 op0Var = this.b;
        tg.f fVar = op0Var.G2;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (v7.u7.a(i10, 4)) {
            fVar.h(op0Var.X0.e());
        }
        fVar.e(op0Var.L2, op0Var.b.getWidth(), op0Var.b.getHeight());
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void r(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        org.telegram.ui.ActionBar.k1 k1Var2;
        switch (this.a) {
            case 2:
                op0 op0Var = this.b;
                op0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = op0Var.B2) != null && k1Var.isShowing()) {
                    op0Var.B2.d(true);
                    break;
                }
                break;
            default:
                op0 op0Var2 = this.b;
                op0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var2 = op0Var2.B2) != null && k1Var2.isShowing()) {
                    op0Var2.B2.d(true);
                    break;
                }
                break;
        }
    }
}
