package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class it0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pv0 b;

    public /* synthetic */ it0(pv0 pv0Var, int i10) {
        this.a = i10;
        this.b = pv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                pv0 pv0Var = this.b;
                org.telegram.ui.ActionBar.v0 v0Var = pv0Var.n0;
                iu0[] iu0VarArr = pv0Var.k0;
                pv0Var.f1 = null;
                if (pv0Var.i1) {
                    iu0VarArr[1].setVisibility(8);
                    if (v0Var == null || pv0Var.D()) {
                        pv0Var.o0 = pv0Var.b0(0.0f);
                        pv0Var.s1(0.0f);
                    } else {
                        v0Var.setVisibility(pv0Var.v0() ? 8 : 4);
                        pv0Var.o0 = 0.0f;
                    }
                    pv0Var.q1(false);
                    pv0Var.x0 = 0;
                } else {
                    iu0 iu0Var = iu0VarArr[0];
                    iu0VarArr[0] = iu0VarArr[1];
                    iu0VarArr[1] = iu0Var;
                    iu0Var.setVisibility(8);
                    if (v0Var != null && pv0Var.x0 == 2) {
                        v0Var.setVisibility(pv0Var.v0() ? 8 : 4);
                    }
                    pv0Var.x0 = 0;
                    pv0Var.Z0(1.0f, iu0VarArr[0].F);
                    pv0Var.L0();
                    pv0Var.f1();
                }
                pv0Var.g1 = false;
                pv0Var.y1 = false;
                pv0Var.x1 = false;
                pv0Var.N0(false);
                pv0Var.G.setEnabled(true);
                pv0Var.I0.setEnabled(true);
                break;
        }
    }
}
