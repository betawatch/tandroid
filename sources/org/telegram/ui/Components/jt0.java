package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class jt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv0 b;

    public /* synthetic */ jt0(qv0 qv0Var, int i10) {
        this.a = i10;
        this.b = qv0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.L0 = null;
                break;
            default:
                qv0 qv0Var = this.b;
                org.telegram.ui.ActionBar.v0 v0Var = qv0Var.n0;
                ju0[] ju0VarArr = qv0Var.k0;
                qv0Var.f1 = null;
                if (qv0Var.i1) {
                    ju0VarArr[1].setVisibility(8);
                    if (v0Var == null || qv0Var.D()) {
                        qv0Var.o0 = qv0Var.b0(0.0f);
                        qv0Var.s1(0.0f);
                    } else {
                        v0Var.setVisibility(qv0Var.v0() ? 8 : 4);
                        qv0Var.o0 = 0.0f;
                    }
                    qv0Var.q1(false);
                    qv0Var.x0 = 0;
                } else {
                    ju0 ju0Var = ju0VarArr[0];
                    ju0VarArr[0] = ju0VarArr[1];
                    ju0VarArr[1] = ju0Var;
                    ju0Var.setVisibility(8);
                    if (v0Var != null && qv0Var.x0 == 2) {
                        v0Var.setVisibility(qv0Var.v0() ? 8 : 4);
                    }
                    qv0Var.x0 = 0;
                    qv0Var.Z0(1.0f, ju0VarArr[0].F);
                    qv0Var.L0();
                    qv0Var.f1();
                }
                qv0Var.g1 = false;
                qv0Var.y1 = false;
                qv0Var.x1 = false;
                qv0Var.N0(false);
                qv0Var.G.setEnabled(true);
                qv0Var.I0.setEnabled(true);
                break;
        }
    }
}
