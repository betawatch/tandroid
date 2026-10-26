package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw0 b;

    public /* synthetic */ xt0(aw0 aw0Var, int i10) {
        this.a = i10;
        this.b = aw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.N0 = null;
                break;
            default:
                aw0 aw0Var = this.b;
                org.telegram.ui.ActionBar.w0 w0Var = aw0Var.p0;
                tu0[] tu0VarArr = aw0Var.m0;
                aw0Var.h1 = null;
                if (aw0Var.k1) {
                    tu0VarArr[1].setVisibility(8);
                    if (w0Var == null || aw0Var.G()) {
                        aw0Var.q0 = aw0Var.i0(0.0f);
                        aw0Var.G1(0.0f);
                    } else {
                        aw0Var.setSearchItemVisibility(aw0Var.D0() ? 8 : 4);
                        aw0Var.q0 = 0.0f;
                    }
                    aw0Var.C1(false);
                    aw0Var.z0 = 0;
                } else {
                    tu0 tu0Var = tu0VarArr[0];
                    tu0VarArr[0] = tu0VarArr[1];
                    tu0VarArr[1] = tu0Var;
                    tu0Var.setVisibility(8);
                    if (w0Var != null && aw0Var.z0 == 2) {
                        aw0Var.setSearchItemVisibility(aw0Var.D0() ? 8 : 4);
                    }
                    aw0Var.z0 = 0;
                    aw0Var.f1(1.0f, tu0VarArr[0].E);
                    aw0Var.S0();
                    aw0Var.o1();
                }
                aw0Var.i1 = false;
                aw0Var.A1 = false;
                aw0Var.z1 = false;
                aw0Var.setHeaderEnabled(true);
                aw0Var.K0.setEnabled(true);
                break;
        }
    }
}
