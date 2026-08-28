package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ms extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f2.q1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ ps e;

    public ms(ps psVar, f2.q1 q1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = psVar;
        this.b = q1Var;
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
                f2.q1 q1Var = this.b;
                psVar.d(q1Var);
                psVar.x.remove(q1Var);
                psVar.A();
                break;
            default:
                this.d.setListener(null);
                ps psVar2 = this.e;
                f2.q1 q1Var2 = this.b;
                psVar2.u(q1Var2);
                psVar2.v.remove(q1Var2);
                psVar2.A();
                View view = q1Var2.a;
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

    public ms(ps psVar, f2.q1 q1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = psVar;
        this.b = q1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
