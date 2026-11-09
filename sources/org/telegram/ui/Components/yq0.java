package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class yq0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs0 b;

    public /* synthetic */ yq0(zs0 zs0Var, int i7) {
        this.a = i7;
        this.b = zs0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.N0 = null;
                break;
            default:
                zs0 zs0Var = this.b;
                org.telegram.ui.ActionBar.r0 r0Var = zs0Var.p0;
                ur0[] ur0VarArr = zs0Var.m0;
                zs0Var.h1 = null;
                if (zs0Var.k1) {
                    ur0VarArr[1].setVisibility(8);
                    if (r0Var == null || zs0Var.I()) {
                        zs0Var.q0 = zs0Var.l0(0.0f);
                        zs0Var.M1(0.0f);
                    } else {
                        zs0Var.setSearchItemVisibility(zs0Var.I0() ? 8 : 4);
                        zs0Var.q0 = 0.0f;
                    }
                    zs0Var.I1(false);
                    zs0Var.z0 = 0;
                } else {
                    ur0 ur0Var = ur0VarArr[0];
                    ur0VarArr[0] = ur0VarArr[1];
                    ur0VarArr[1] = ur0Var;
                    ur0Var.setVisibility(8);
                    if (r0Var != null && zs0Var.z0 == 2) {
                        zs0Var.setSearchItemVisibility(zs0Var.I0() ? 8 : 4);
                    }
                    zs0Var.z0 = 0;
                    zs0Var.l1(1.0f, ur0VarArr[0].E);
                    zs0Var.Y0();
                    zs0Var.u1();
                }
                zs0Var.i1 = false;
                zs0Var.A1 = false;
                zs0Var.z1 = false;
                zs0Var.setHeaderEnabled(true);
                zs0Var.K0.setEnabled(true);
                break;
        }
    }
}
