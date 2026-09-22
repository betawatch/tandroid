package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ws extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ at e;

    public ws(at atVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = atVar;
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
                at atVar = this.e;
                s4.c1 c1Var = this.b;
                atVar.d(c1Var);
                atVar.x.remove(c1Var);
                atVar.A();
                break;
            default:
                this.d.setListener(null);
                at atVar2 = this.e;
                s4.c1 c1Var2 = this.b;
                atVar2.u(c1Var2);
                atVar2.v.remove(c1Var2);
                atVar2.A();
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

    public ws(at atVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = atVar;
        this.b = c1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
