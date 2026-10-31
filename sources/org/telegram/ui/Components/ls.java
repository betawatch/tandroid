package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ls extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ ps e;

    public ls(ps psVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = psVar;
        this.b = c1Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                ps psVar = this.e;
                s4.c1 c1Var = this.b;
                psVar.d(c1Var);
                psVar.x.remove(c1Var);
                psVar.A();
                break;
            default:
                this.d.setListener(null);
                ps psVar2 = this.e;
                s4.c1 c1Var2 = this.b;
                psVar2.u(c1Var2);
                psVar2.v.remove(c1Var2);
                psVar2.A();
                View view = c1Var2.a;
                if (view instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) view).setMoving(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.y();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public ls(ps psVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = psVar;
        this.b = c1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
