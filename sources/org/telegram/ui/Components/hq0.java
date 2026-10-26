package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq0 implements oi.m, r0.n, org.telegram.ui.ActionBar.m1, oi.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr0 b;

    public /* synthetic */ hq0(mr0 mr0Var, int i10) {
        this.a = i10;
        this.b = mr0Var;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        mr0 mr0Var = this.b;
        mr0Var.processLegacyContainerInsets(g7);
        i0.b f7 = k1Var.a.f(519);
        if (!mr0Var.H0.equals(f7)) {
            mr0Var.H0 = f7;
            mr0Var.container.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // oi.n
    public int f() {
        mr0 mr0Var = this.b;
        mr0Var.getClass();
        return mr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.d6);
    }

    @Override // oi.m
    public void k(int i10) {
        mr0.m(this.b, i10);
    }

    @Override // org.telegram.ui.ActionBar.m1
    public void n(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        org.telegram.ui.ActionBar.o1 o1Var2;
        switch (this.a) {
            case 2:
                mr0 mr0Var = this.b;
                mr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = mr0Var.K0) != null && o1Var.isShowing()) {
                    mr0Var.K0.d(true);
                    break;
                }
                break;
            default:
                mr0 mr0Var2 = this.b;
                mr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var2 = mr0Var2.K0) != null && o1Var2.isShowing()) {
                    mr0Var2.K0.d(true);
                    break;
                }
                break;
        }
    }
}
