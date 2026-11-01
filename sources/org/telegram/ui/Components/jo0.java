package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo0 implements ei.n, r0.m, org.telegram.ui.ActionBar.i1, ei.o {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp0 b;

    public /* synthetic */ jo0(pp0 pp0Var, int i10) {
        this.a = i10;
        this.b = pp0Var;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        WindowInsets g10 = j1Var.g();
        pp0 pp0Var = this.b;
        pp0Var.t0(g10);
        i0.c f7 = j1Var.a.f(519);
        if (!pp0Var.y2.equals(f7)) {
            pp0Var.y2 = f7;
            pp0Var.c.requestLayout();
        }
        return r0.j1.b;
    }

    @Override // ei.o
    public int c() {
        pp0 pp0Var = this.b;
        pp0Var.getClass();
        return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, pp0Var.I0);
    }

    @Override // ei.n
    public void j(int i10) {
        pp0 pp0Var = this.b;
        tg.f fVar = pp0Var.G2;
        if (Build.VERSION.SDK_INT < 31 || fVar == null) {
            return;
        }
        if (v7.u7.a(i10, 4)) {
            fVar.h(pp0Var.X0.e());
        }
        fVar.e(pp0Var.L2, pp0Var.b.getWidth(), pp0Var.b.getHeight());
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        org.telegram.ui.ActionBar.k1 k1Var2;
        switch (this.a) {
            case 2:
                pp0 pp0Var = this.b;
                pp0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = pp0Var.B2) != null && k1Var.isShowing()) {
                    pp0Var.B2.d(true);
                    break;
                }
                break;
            default:
                pp0 pp0Var2 = this.b;
                pp0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var2 = pp0Var2.B2) != null && k1Var2.isShowing()) {
                    pp0Var2.B2.d(true);
                    break;
                }
                break;
        }
    }
}
