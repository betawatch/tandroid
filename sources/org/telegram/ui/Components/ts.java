package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ts extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f2.l1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ xs e;

    public ts(xs xsVar, f2.l1 l1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = xsVar;
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
                xs xsVar = this.e;
                f2.l1 l1Var = this.b;
                xsVar.d(l1Var);
                xsVar.x.remove(l1Var);
                xsVar.A();
                break;
            default:
                this.d.setListener(null);
                xs xsVar2 = this.e;
                f2.l1 l1Var2 = this.b;
                xsVar2.u(l1Var2);
                xsVar2.v.remove(l1Var2);
                xsVar2.A();
                View view = l1Var2.a;
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

    public ts(xs xsVar, f2.l1 l1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = xsVar;
        this.b = l1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
