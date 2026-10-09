package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class nt extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s4.d1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ rt e;

    public nt(rt rtVar, s4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = rtVar;
        this.b = d1Var;
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
                rt rtVar = this.e;
                s4.d1 d1Var = this.b;
                rtVar.d(d1Var);
                rtVar.x.remove(d1Var);
                rtVar.A();
                break;
            default:
                this.d.setListener(null);
                rt rtVar2 = this.e;
                s4.d1 d1Var2 = this.b;
                rtVar2.u(d1Var2);
                rtVar2.v.remove(d1Var2);
                rtVar2.A();
                View view = d1Var2.a;
                if (view instanceof org.telegram.ui.Cells.s2) {
                    ((org.telegram.ui.Cells.s2) view).setMoving(false);
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

    public nt(rt rtVar, s4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = rtVar;
        this.b = d1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
