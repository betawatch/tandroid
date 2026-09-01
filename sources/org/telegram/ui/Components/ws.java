package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ws extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f2.m1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ at e;

    public ws(at atVar, f2.m1 m1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = atVar;
        this.b = m1Var;
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
                at atVar = this.e;
                f2.m1 m1Var = this.b;
                atVar.d(m1Var);
                atVar.x.remove(m1Var);
                atVar.A();
                break;
            default:
                this.d.setListener(null);
                at atVar2 = this.e;
                f2.m1 m1Var2 = this.b;
                atVar2.u(m1Var2);
                atVar2.v.remove(m1Var2);
                atVar2.A();
                View view = m1Var2.a;
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

    public ws(at atVar, f2.m1 m1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = atVar;
        this.b = m1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
