package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ eu0 b;

    public /* synthetic */ xr0(eu0 eu0Var, int i9) {
        this.a = i9;
        this.b = eu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.H0 = null;
                break;
            default:
                eu0 eu0Var = this.b;
                org.telegram.ui.ActionBar.w0 w0Var = eu0Var.j0;
                xs0[] xs0VarArr = eu0Var.g0;
                eu0Var.b1 = null;
                if (eu0Var.e1) {
                    xs0VarArr[1].setVisibility(8);
                    if (w0Var == null || eu0Var.D()) {
                        eu0Var.k0 = eu0Var.b0(0.0f);
                        eu0Var.s1(0.0f);
                    } else {
                        w0Var.setVisibility(eu0Var.v0() ? 8 : 4);
                        eu0Var.k0 = 0.0f;
                    }
                    eu0Var.q1(false);
                    eu0Var.t0 = 0;
                } else {
                    xs0 xs0Var = xs0VarArr[0];
                    xs0VarArr[0] = xs0VarArr[1];
                    xs0VarArr[1] = xs0Var;
                    xs0Var.setVisibility(8);
                    if (w0Var != null && eu0Var.t0 == 2) {
                        w0Var.setVisibility(eu0Var.v0() ? 8 : 4);
                    }
                    eu0Var.t0 = 0;
                    eu0Var.Z0(1.0f, xs0VarArr[0].B);
                    eu0Var.L0();
                    eu0Var.f1();
                }
                eu0Var.c1 = false;
                eu0Var.u1 = false;
                eu0Var.t1 = false;
                eu0Var.N0(false);
                eu0Var.C.setEnabled(true);
                eu0Var.E0.setEnabled(true);
                break;
        }
    }
}
