package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ic1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed1 b;

    public /* synthetic */ ic1(ed1 ed1Var, int i10) {
        this.a = i10;
        this.b = ed1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationEnd(animator);
                ed1 ed1Var = this.b;
                ed1Var.u0.invalidate();
                ed1Var.t0[1].setVisibility(8);
                ed1Var.Z1 = null;
                break;
            case 1:
                this.b.y0 = null;
                break;
            case 2:
                ed1 ed1Var2 = this.b;
                if (ed1Var2.A0.getTag() == null) {
                    ed1Var2.A0.setVisibility(4);
                }
                ed1Var2.E0 = null;
                break;
            case 3:
                ed1 ed1Var3 = this.b;
                if (ed1Var3.B0.getTag() == null) {
                    ed1Var3.B0.setVisibility(4);
                }
                ed1Var3.F0 = null;
                break;
            case 4:
                ed1 ed1Var4 = this.b;
                kc kcVar = ed1Var4.e2;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) ed1Var4.e2.getParent()).removeView(ed1Var4.e2);
                    }
                    ed1Var4.e2 = null;
                }
                ed1Var4.g2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                ed1 ed1Var5 = this.b;
                if (!ed1Var5.m1.a()) {
                    ed1Var5.O1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
