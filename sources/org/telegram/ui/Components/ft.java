package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ft extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s4.b1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ kt e;

    public ft(kt ktVar, s4.b1 b1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = ktVar;
        this.b = b1Var;
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
                kt ktVar = this.e;
                s4.b1 b1Var = this.b;
                ktVar.d(b1Var);
                ktVar.x.remove(b1Var);
                ktVar.A();
                break;
            default:
                this.d.setListener(null);
                kt ktVar2 = this.e;
                s4.b1 b1Var2 = this.b;
                ktVar2.u(b1Var2);
                ktVar2.v.remove(b1Var2);
                ktVar2.A();
                View view = b1Var2.a;
                if (view instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) view).setMoving(false);
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

    public ft(kt ktVar, s4.b1 b1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = ktVar;
        this.b = b1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
