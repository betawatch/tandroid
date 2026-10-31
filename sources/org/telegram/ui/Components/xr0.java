package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zt0 b;

    public /* synthetic */ xr0(zt0 zt0Var, int i10) {
        this.a = i10;
        this.b = zt0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.N0 = null;
                break;
            default:
                zt0 zt0Var = this.b;
                org.telegram.ui.ActionBar.t0 t0Var = zt0Var.p0;
                ss0[] ss0VarArr = zt0Var.m0;
                zt0Var.h1 = null;
                if (zt0Var.k1) {
                    ss0VarArr[1].setVisibility(8);
                    if (t0Var == null || zt0Var.H()) {
                        zt0Var.q0 = zt0Var.j0(0.0f);
                        zt0Var.H1(0.0f);
                    } else {
                        zt0Var.setSearchItemVisibility(zt0Var.E0() ? 8 : 4);
                        zt0Var.q0 = 0.0f;
                    }
                    zt0Var.D1(false);
                    zt0Var.z0 = 0;
                } else {
                    ss0 ss0Var = ss0VarArr[0];
                    ss0VarArr[0] = ss0VarArr[1];
                    ss0VarArr[1] = ss0Var;
                    ss0Var.setVisibility(8);
                    if (t0Var != null && zt0Var.z0 == 2) {
                        zt0Var.setSearchItemVisibility(zt0Var.E0() ? 8 : 4);
                    }
                    zt0Var.z0 = 0;
                    zt0Var.g1(1.0f, ss0VarArr[0].E);
                    zt0Var.T0();
                    zt0Var.p1();
                }
                zt0Var.i1 = false;
                zt0Var.A1 = false;
                zt0Var.z1 = false;
                zt0Var.setHeaderEnabled(true);
                zt0Var.K0.setEnabled(true);
                break;
        }
    }
}
