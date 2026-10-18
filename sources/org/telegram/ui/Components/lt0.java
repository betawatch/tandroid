package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class lt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv0 b;

    public /* synthetic */ lt0(sv0 sv0Var, int i10) {
        this.a = i10;
        this.b = sv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                sv0 sv0Var = this.b;
                org.telegram.ui.ActionBar.u0 u0Var = sv0Var.n0;
                lu0[] lu0VarArr = sv0Var.k0;
                sv0Var.f1 = null;
                if (sv0Var.i1) {
                    lu0VarArr[1].setVisibility(8);
                    if (u0Var == null || sv0Var.D()) {
                        sv0Var.o0 = sv0Var.b0(0.0f);
                        sv0Var.v1(0.0f);
                    } else {
                        u0Var.setVisibility(sv0Var.x0() ? 8 : 4);
                        sv0Var.o0 = 0.0f;
                    }
                    sv0Var.s1(false);
                    sv0Var.x0 = 0;
                } else {
                    lu0 lu0Var = lu0VarArr[0];
                    lu0VarArr[0] = lu0VarArr[1];
                    lu0VarArr[1] = lu0Var;
                    lu0Var.setVisibility(8);
                    if (u0Var != null && sv0Var.x0 == 2) {
                        u0Var.setVisibility(sv0Var.x0() ? 8 : 4);
                    }
                    sv0Var.x0 = 0;
                    sv0Var.b1(1.0f, lu0VarArr[0].F);
                    sv0Var.N0();
                    sv0Var.h1();
                }
                sv0Var.g1 = false;
                sv0Var.y1 = false;
                sv0Var.x1 = false;
                sv0Var.P0(false);
                sv0Var.G.setEnabled(true);
                sv0Var.I0.setEnabled(true);
                break;
        }
    }
}
