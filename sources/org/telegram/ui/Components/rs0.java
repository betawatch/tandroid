package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class rs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ yu0 b;

    public /* synthetic */ rs0(yu0 yu0Var, int i10) {
        this.a = i10;
        this.b = yu0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                yu0 yu0Var = this.b;
                org.telegram.ui.ActionBar.v0 v0Var = yu0Var.n0;
                rt0[] rt0VarArr = yu0Var.k0;
                yu0Var.f1 = null;
                if (yu0Var.i1) {
                    rt0VarArr[1].setVisibility(8);
                    if (v0Var == null || yu0Var.D()) {
                        yu0Var.o0 = yu0Var.b0(0.0f);
                        yu0Var.s1(0.0f);
                    } else {
                        v0Var.setVisibility(yu0Var.v0() ? 8 : 4);
                        yu0Var.o0 = 0.0f;
                    }
                    yu0Var.q1(false);
                    yu0Var.x0 = 0;
                } else {
                    rt0 rt0Var = rt0VarArr[0];
                    rt0VarArr[0] = rt0VarArr[1];
                    rt0VarArr[1] = rt0Var;
                    rt0Var.setVisibility(8);
                    if (v0Var != null && yu0Var.x0 == 2) {
                        v0Var.setVisibility(yu0Var.v0() ? 8 : 4);
                    }
                    yu0Var.x0 = 0;
                    yu0Var.Z0(1.0f, rt0VarArr[0].F);
                    yu0Var.L0();
                    yu0Var.f1();
                }
                yu0Var.g1 = false;
                yu0Var.y1 = false;
                yu0Var.x1 = false;
                yu0Var.N0(false);
                yu0Var.G.setEnabled(true);
                yu0Var.I0.setEnabled(true);
                break;
        }
    }
}
