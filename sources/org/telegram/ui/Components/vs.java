package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ zs e;

    public vs(zs zsVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = zsVar;
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
                zs zsVar = this.e;
                s4.c1 c1Var = this.b;
                zsVar.d(c1Var);
                zsVar.x.remove(c1Var);
                zsVar.A();
                break;
            default:
                this.d.setListener(null);
                zs zsVar2 = this.e;
                s4.c1 c1Var2 = this.b;
                zsVar2.u(c1Var2);
                zsVar2.v.remove(c1Var2);
                zsVar2.A();
                View view = c1Var2.a;
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

    public vs(zs zsVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = zsVar;
        this.b = c1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
