package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class et0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ lv0 b;

    public /* synthetic */ et0(lv0 lv0Var, int i10) {
        this.a = i10;
        this.b = lv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                lv0 lv0Var = this.b;
                org.telegram.ui.ActionBar.u0 u0Var = lv0Var.n0;
                eu0[] eu0VarArr = lv0Var.k0;
                lv0Var.f1 = null;
                if (lv0Var.i1) {
                    eu0VarArr[1].setVisibility(8);
                    if (u0Var == null || lv0Var.D()) {
                        lv0Var.o0 = lv0Var.b0(0.0f);
                        lv0Var.s1(0.0f);
                    } else {
                        u0Var.setVisibility(lv0Var.v0() ? 8 : 4);
                        lv0Var.o0 = 0.0f;
                    }
                    lv0Var.q1(false);
                    lv0Var.x0 = 0;
                } else {
                    eu0 eu0Var = eu0VarArr[0];
                    eu0VarArr[0] = eu0VarArr[1];
                    eu0VarArr[1] = eu0Var;
                    eu0Var.setVisibility(8);
                    if (u0Var != null && lv0Var.x0 == 2) {
                        u0Var.setVisibility(lv0Var.v0() ? 8 : 4);
                    }
                    lv0Var.x0 = 0;
                    lv0Var.Z0(1.0f, eu0VarArr[0].F);
                    lv0Var.L0();
                    lv0Var.f1();
                }
                lv0Var.g1 = false;
                lv0Var.y1 = false;
                lv0Var.x1 = false;
                lv0Var.N0(false);
                lv0Var.G.setEnabled(true);
                lv0Var.I0.setEnabled(true);
                break;
        }
    }
}
