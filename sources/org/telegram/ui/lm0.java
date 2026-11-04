package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lm0 implements org.telegram.ui.Components.r4, org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.d1, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sm0 b;

    public /* synthetic */ lm0(sm0 sm0Var, int i3) {
        this.a = i3;
        this.b = sm0Var;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        switch (this.a) {
            case 0:
                this.b.j0(i3, z10);
                break;
            default:
                this.b.j0(i3, z10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        sm0 sm0Var = this.b;
        if (sm0Var.Z) {
            sm0Var.f0(view, sm0Var.K.e.get(i3));
            return true;
        }
        if (!(view instanceof org.telegram.ui.Cells.q5)) {
            return false;
        }
        org.telegram.ui.Components.xj0 xj0Var = sm0Var.W;
        boolean z10 = !((org.telegram.ui.Cells.q5) view).a();
        sm0Var.Y = z10;
        xj0Var.d(i3, view, z10);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        sm0 sm0Var = this.b;
        tm0 tm0Var = sm0Var.u0;
        if (tm0Var == null) {
            sm0Var.e0();
            return;
        }
        switch (tm0Var.a) {
            case 1:
                vm0 vm0Var = tm0Var.b;
                vm0Var.a.e0();
                vm0Var.b.e0();
                break;
            default:
                vm0 vm0Var2 = tm0Var.b;
                vm0Var2.a.e0();
                vm0Var2.b.e0();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.f1 f1Var;
        sm0 sm0Var = this.b;
        sm0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (f1Var = sm0Var.n0) != null && f1Var.isShowing()) {
            sm0Var.n0.d(true);
        }
    }
}
