package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iq0 implements oi.m, r0.n, org.telegram.ui.ActionBar.m1, oi.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr0 b;

    public /* synthetic */ iq0(nr0 nr0Var, int i10) {
        this.a = i10;
        this.b = nr0Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        nr0 nr0Var = this.b;
        nr0Var.processLegacyContainerInsets(g7);
        i0.b f7 = k1Var.a.f(519);
        if (!nr0Var.H0.equals(f7)) {
            nr0Var.H0 = f7;
            nr0Var.container.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // oi.n
    public int f() {
        nr0 nr0Var = this.b;
        nr0Var.getClass();
        return nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6);
    }

    @Override // oi.m
    public void k(int i10) {
        nr0.m(this.b, i10);
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 2:
                nr0 nr0Var = this.b;
                nr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = nr0Var.K0) != null && o1Var.isShowing()) {
                    nr0Var.K0.d(true);
                    break;
                }
                break;
            default:
                nr0 nr0Var2 = this.b;
                nr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var2 = nr0Var2.K0) != null && o1Var2.isShowing()) {
                    nr0Var2.K0.d(true);
                    break;
                }
                break;
        }
    }
}
