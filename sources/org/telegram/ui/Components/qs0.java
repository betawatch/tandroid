package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ yu0 b;

    public /* synthetic */ qs0(yu0 yu0Var, int i10) {
        this.a = i10;
        this.b = yu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.I0 = null;
                break;
            default:
                yu0 yu0Var = this.b;
                org.telegram.ui.ActionBar.w0 w0Var = yu0Var.k0;
                qt0[] qt0VarArr = yu0Var.h0;
                yu0Var.c1 = null;
                if (yu0Var.f1) {
                    qt0VarArr[1].setVisibility(8);
                    if (w0Var == null || yu0Var.D()) {
                        yu0Var.l0 = yu0Var.b0(0.0f);
                        yu0Var.s1(0.0f);
                    } else {
                        w0Var.setVisibility(yu0Var.v0() ? 8 : 4);
                        yu0Var.l0 = 0.0f;
                    }
                    yu0Var.q1(false);
                    yu0Var.u0 = 0;
                } else {
                    qt0 qt0Var = qt0VarArr[0];
                    qt0VarArr[0] = qt0VarArr[1];
                    qt0VarArr[1] = qt0Var;
                    qt0Var.setVisibility(8);
                    if (w0Var != null && yu0Var.u0 == 2) {
                        w0Var.setVisibility(yu0Var.v0() ? 8 : 4);
                    }
                    yu0Var.u0 = 0;
                    yu0Var.Z0(1.0f, qt0VarArr[0].C);
                    yu0Var.L0();
                    yu0Var.f1();
                }
                yu0Var.d1 = false;
                yu0Var.v1 = false;
                yu0Var.u1 = false;
                yu0Var.N0(false);
                yu0Var.D.setEnabled(true);
                yu0Var.F0.setEnabled(true);
                break;
        }
    }
}
