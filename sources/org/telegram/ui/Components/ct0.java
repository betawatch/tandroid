package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ct0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv0 b;

    public /* synthetic */ ct0(jv0 jv0Var, int i10) {
        this.a = i10;
        this.b = jv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                jv0 jv0Var = this.b;
                org.telegram.ui.ActionBar.u0 u0Var = jv0Var.n0;
                cu0[] cu0VarArr = jv0Var.k0;
                jv0Var.f1 = null;
                if (jv0Var.i1) {
                    cu0VarArr[1].setVisibility(8);
                    if (u0Var == null || jv0Var.D()) {
                        jv0Var.o0 = jv0Var.b0(0.0f);
                        jv0Var.s1(0.0f);
                    } else {
                        u0Var.setVisibility(jv0Var.v0() ? 8 : 4);
                        jv0Var.o0 = 0.0f;
                    }
                    jv0Var.q1(false);
                    jv0Var.x0 = 0;
                } else {
                    cu0 cu0Var = cu0VarArr[0];
                    cu0VarArr[0] = cu0VarArr[1];
                    cu0VarArr[1] = cu0Var;
                    cu0Var.setVisibility(8);
                    if (u0Var != null && jv0Var.x0 == 2) {
                        u0Var.setVisibility(jv0Var.v0() ? 8 : 4);
                    }
                    jv0Var.x0 = 0;
                    jv0Var.Z0(1.0f, cu0VarArr[0].F);
                    jv0Var.L0();
                    jv0Var.f1();
                }
                jv0Var.g1 = false;
                jv0Var.y1 = false;
                jv0Var.x1 = false;
                jv0Var.N0(false);
                jv0Var.G.setEnabled(true);
                jv0Var.I0.setEnabled(true);
                break;
        }
    }
}
