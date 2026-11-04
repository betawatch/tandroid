package org.telegram.ui.Components;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn0 implements pi.m, r0.m, org.telegram.ui.ActionBar.d1, pi.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;

    public /* synthetic */ kn0(oo0 oo0Var, int i3) {
        this.a = i3;
        this.b = oo0Var;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        WindowInsets g7 = k1Var.g();
        oo0 oo0Var = this.b;
        oo0Var.t0(g7);
        i0.b f10 = k1Var.a.f(519);
        if (!oo0Var.z2.equals(f10)) {
            oo0Var.z2 = f10;
            oo0Var.c.requestLayout();
        }
        return r0.k1.b;
    }

    @Override // pi.n
    public int e() {
        oo0 oo0Var = this.b;
        oo0Var.getClass();
        return org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, oo0Var.J0);
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        org.telegram.ui.ActionBar.f1 f1Var2;
        switch (this.a) {
            case 2:
                oo0 oo0Var = this.b;
                oo0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = oo0Var.C2) != null && f1Var.isShowing()) {
                    oo0Var.C2.d(true);
                    break;
                }
                break;
            default:
                oo0 oo0Var2 = this.b;
                oo0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var2 = oo0Var2.C2) != null && f1Var2.isShowing()) {
                    oo0Var2.C2.d(true);
                    break;
                }
                break;
        }
    }

    @Override // pi.m
    public void l(int i3) {
        oo0 oo0Var = this.b;
        eh.g gVar = oo0Var.H2;
        if (Build.VERSION.SDK_INT < 31 || gVar == null) {
            return;
        }
        if (x7.u.a(i3, 4)) {
            gVar.h(oo0Var.Y0.e());
        }
        gVar.e(oo0Var.M2, oo0Var.b.getWidth(), oo0Var.b.getHeight());
    }
}
