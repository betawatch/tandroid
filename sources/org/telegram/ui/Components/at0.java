package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class at0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ iv0 b;

    public /* synthetic */ at0(iv0 iv0Var, int i10) {
        this.a = i10;
        this.b = iv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                iv0 iv0Var = this.b;
                org.telegram.ui.ActionBar.w0 w0Var = iv0Var.n0;
                au0[] au0VarArr = iv0Var.k0;
                iv0Var.f1 = null;
                if (iv0Var.i1) {
                    au0VarArr[1].setVisibility(8);
                    if (w0Var == null || iv0Var.D()) {
                        iv0Var.o0 = iv0Var.b0(0.0f);
                        iv0Var.s1(0.0f);
                    } else {
                        w0Var.setVisibility(iv0Var.v0() ? 8 : 4);
                        iv0Var.o0 = 0.0f;
                    }
                    iv0Var.q1(false);
                    iv0Var.x0 = 0;
                } else {
                    au0 au0Var = au0VarArr[0];
                    au0VarArr[0] = au0VarArr[1];
                    au0VarArr[1] = au0Var;
                    au0Var.setVisibility(8);
                    if (w0Var != null && iv0Var.x0 == 2) {
                        w0Var.setVisibility(iv0Var.v0() ? 8 : 4);
                    }
                    iv0Var.x0 = 0;
                    iv0Var.Z0(1.0f, au0VarArr[0].F);
                    iv0Var.L0();
                    iv0Var.f1();
                }
                iv0Var.g1 = false;
                iv0Var.y1 = false;
                iv0Var.x1 = false;
                iv0Var.N0(false);
                iv0Var.G.setEnabled(true);
                iv0Var.I0.setEnabled(true);
                break;
        }
    }
}
