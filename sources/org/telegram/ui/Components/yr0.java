package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu0 b;

    public /* synthetic */ yr0(hu0 hu0Var, int i10) {
        this.a = i10;
        this.b = hu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.H0 = null;
                break;
            default:
                hu0 hu0Var = this.b;
                org.telegram.ui.ActionBar.v0 v0Var = hu0Var.j0;
                zs0[] zs0VarArr = hu0Var.g0;
                hu0Var.b1 = null;
                if (hu0Var.e1) {
                    zs0VarArr[1].setVisibility(8);
                    if (v0Var == null || hu0Var.D()) {
                        hu0Var.k0 = hu0Var.b0(0.0f);
                        hu0Var.s1(0.0f);
                    } else {
                        v0Var.setVisibility(hu0Var.v0() ? 8 : 4);
                        hu0Var.k0 = 0.0f;
                    }
                    hu0Var.q1(false);
                    hu0Var.t0 = 0;
                } else {
                    zs0 zs0Var = zs0VarArr[0];
                    zs0VarArr[0] = zs0VarArr[1];
                    zs0VarArr[1] = zs0Var;
                    zs0Var.setVisibility(8);
                    if (v0Var != null && hu0Var.t0 == 2) {
                        v0Var.setVisibility(hu0Var.v0() ? 8 : 4);
                    }
                    hu0Var.t0 = 0;
                    hu0Var.Z0(1.0f, zs0VarArr[0].B);
                    hu0Var.L0();
                    hu0Var.f1();
                }
                hu0Var.c1 = false;
                hu0Var.u1 = false;
                hu0Var.t1 = false;
                hu0Var.N0(false);
                hu0Var.C.setEnabled(true);
                hu0Var.E0.setEnabled(true);
                break;
        }
    }
}
