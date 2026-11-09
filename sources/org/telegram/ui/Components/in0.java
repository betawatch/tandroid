package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements oi.m, r0.m, org.telegram.ui.ActionBar.e1, oi.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ no0 b;

    public /* synthetic */ in0(no0 no0Var, int i7) {
        this.a = i7;
        this.b = no0Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        no0 no0Var = this.b;
        no0Var.t0(g10);
        i0.b f10 = k1Var.a.f(519);
        if (!no0Var.y2.equals(f10)) {
            no0Var.y2 = f10;
            no0Var.c.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // oi.n
    public int h() {
        no0 no0Var = this.b;
        no0Var.getClass();
        return org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d6, no0Var.I0);
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.a) {
            case 2:
                no0 no0Var = this.b;
                no0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = no0Var.B2) != null && g1Var.isShowing()) {
                    no0Var.B2.d(true);
                    break;
                }
                break;
            default:
                no0 no0Var2 = this.b;
                no0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var2 = no0Var2.B2) != null && g1Var2.isShowing()) {
                    no0Var2.B2.d(true);
                    break;
                }
                break;
        }
    }

    @Override // oi.m
    public void l(int i7) {
        no0 no0Var = this.b;
        dh.g gVar = no0Var.G2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            gVar.h(no0Var.X0.e());
        }
        gVar.e(no0Var.L2, no0Var.b.getWidth(), no0Var.b.getHeight());
    }
}
