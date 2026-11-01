package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class yr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ au0 b;

    public /* synthetic */ yr0(au0 au0Var, int i10) {
        this.a = i10;
        this.b = au0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.N0 = null;
                break;
            default:
                au0 au0Var = this.b;
                org.telegram.ui.ActionBar.t0 t0Var = au0Var.p0;
                ts0[] ts0VarArr = au0Var.m0;
                au0Var.h1 = null;
                if (au0Var.k1) {
                    ts0VarArr[1].setVisibility(8);
                    if (t0Var == null || au0Var.H()) {
                        au0Var.q0 = au0Var.k0(0.0f);
                        au0Var.I1(0.0f);
                    } else {
                        au0Var.setSearchItemVisibility(au0Var.F0() ? 8 : 4);
                        au0Var.q0 = 0.0f;
                    }
                    au0Var.E1(false);
                    au0Var.z0 = 0;
                } else {
                    ts0 ts0Var = ts0VarArr[0];
                    ts0VarArr[0] = ts0VarArr[1];
                    ts0VarArr[1] = ts0Var;
                    ts0Var.setVisibility(8);
                    if (t0Var != null && au0Var.z0 == 2) {
                        au0Var.setSearchItemVisibility(au0Var.F0() ? 8 : 4);
                    }
                    au0Var.z0 = 0;
                    au0Var.h1(1.0f, ts0VarArr[0].E);
                    au0Var.U0();
                    au0Var.q1();
                }
                au0Var.i1 = false;
                au0Var.A1 = false;
                au0Var.z1 = false;
                au0Var.setHeaderEnabled(true);
                au0Var.K0.setEnabled(true);
                break;
        }
    }
}
