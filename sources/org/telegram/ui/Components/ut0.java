package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ut0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bw0 b;

    public /* synthetic */ ut0(bw0 bw0Var, int i10) {
        this.a = i10;
        this.b = bw0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                bw0 bw0Var = this.b;
                org.telegram.ui.ActionBar.v0 v0Var = bw0Var.n0;
                uu0[] uu0VarArr = bw0Var.k0;
                bw0Var.f1 = null;
                if (bw0Var.i1) {
                    uu0VarArr[1].setVisibility(8);
                    if (v0Var == null || bw0Var.D()) {
                        bw0Var.o0 = bw0Var.b0(0.0f);
                        bw0Var.s1(0.0f);
                    } else {
                        v0Var.setVisibility(bw0Var.v0() ? 8 : 4);
                        bw0Var.o0 = 0.0f;
                    }
                    bw0Var.q1(false);
                    bw0Var.x0 = 0;
                } else {
                    uu0 uu0Var = uu0VarArr[0];
                    uu0VarArr[0] = uu0VarArr[1];
                    uu0VarArr[1] = uu0Var;
                    uu0Var.setVisibility(8);
                    if (v0Var != null && bw0Var.x0 == 2) {
                        v0Var.setVisibility(bw0Var.v0() ? 8 : 4);
                    }
                    bw0Var.x0 = 0;
                    bw0Var.Z0(1.0f, uu0VarArr[0].F);
                    bw0Var.L0();
                    bw0Var.f1();
                }
                bw0Var.g1 = false;
                bw0Var.y1 = false;
                bw0Var.x1 = false;
                bw0Var.N0(false);
                bw0Var.G.setEnabled(true);
                bw0Var.I0.setEnabled(true);
                break;
        }
    }
}
