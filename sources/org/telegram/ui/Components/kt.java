package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class kt extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s4.b1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ ot e;

    public kt(ot otVar, s4.b1 b1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = otVar;
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
                ot otVar = this.e;
                s4.b1 b1Var = this.b;
                otVar.d(b1Var);
                otVar.x.remove(b1Var);
                otVar.A();
                break;
            default:
                this.d.setListener(null);
                ot otVar2 = this.e;
                s4.b1 b1Var2 = this.b;
                otVar2.u(b1Var2);
                otVar2.v.remove(b1Var2);
                otVar2.A();
                View view = b1Var2.a;
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

    public kt(ot otVar, s4.b1 b1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = otVar;
        this.b = b1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
