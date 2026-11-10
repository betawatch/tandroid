package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements oi.m, r0.m, org.telegram.ui.ActionBar.e1, oi.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo0 b;

    public /* synthetic */ hn0(mo0 mo0Var, int i7) {
        this.a = i7;
        this.b = mo0Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        mo0 mo0Var = this.b;
        mo0Var.t0(g10);
        i0.b f10 = k1Var.a.f(519);
        if (!mo0Var.B2.equals(f10)) {
            mo0Var.B2 = f10;
            mo0Var.c.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // oi.n
    public int h() {
        mo0 mo0Var = this.b;
        mo0Var.getClass();
        return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.d6, mo0Var.I0);
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.g1 g1Var;
        org.telegram.ui.ActionBar.g1 g1Var2;
        switch (this.a) {
            case 2:
                mo0 mo0Var = this.b;
                mo0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var = mo0Var.E2) != null && g1Var.isShowing()) {
                    mo0Var.E2.d(true);
                    break;
                }
                break;
            default:
                mo0 mo0Var2 = this.b;
                mo0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (g1Var2 = mo0Var2.E2) != null && g1Var2.isShowing()) {
                    mo0Var2.E2.d(true);
                    break;
                }
                break;
        }
    }

    @Override // oi.m
    public void l(int i7) {
        mo0 mo0Var = this.b;
        dh.g gVar = mo0Var.J2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (c8.zc.a(i7, 4)) {
            gVar.h(mo0Var.X0.e());
        }
        gVar.e(mo0Var.O2, mo0Var.b.getWidth(), mo0Var.b.getHeight());
    }
}
