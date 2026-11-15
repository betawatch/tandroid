package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ v4.e1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ ks e;

    public gs(ks ksVar, v4.e1 e1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = ksVar;
        this.b = e1Var;
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
                ks ksVar = this.e;
                v4.e1 e1Var = this.b;
                ksVar.d(e1Var);
                ksVar.x.remove(e1Var);
                ksVar.A();
                break;
            default:
                this.d.setListener(null);
                ks ksVar2 = this.e;
                v4.e1 e1Var2 = this.b;
                ksVar2.u(e1Var2);
                ksVar2.v.remove(e1Var2);
                ksVar2.A();
                View view = e1Var2.a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
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

    public gs(ks ksVar, v4.e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = ksVar;
        this.b = e1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
