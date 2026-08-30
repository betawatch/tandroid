package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class us extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f2.l1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ ys e;

    public us(ys ysVar, f2.l1 l1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = ysVar;
        this.b = l1Var;
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
                ys ysVar = this.e;
                f2.l1 l1Var = this.b;
                ysVar.d(l1Var);
                ysVar.x.remove(l1Var);
                ysVar.A();
                break;
            default:
                this.d.setListener(null);
                ys ysVar2 = this.e;
                f2.l1 l1Var2 = this.b;
                ysVar2.u(l1Var2);
                ysVar2.v.remove(l1Var2);
                ysVar2.A();
                View view = l1Var2.a;
                if (view instanceof org.telegram.ui.Cells.r2) {
                    ((org.telegram.ui.Cells.r2) view).setMoving(false);
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

    public us(ys ysVar, f2.l1 l1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = ysVar;
        this.b = l1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
