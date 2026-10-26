package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ht extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s4.e1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ mt e;

    public ht(mt mtVar, s4.e1 e1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = mtVar;
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
                mt mtVar = this.e;
                s4.e1 e1Var = this.b;
                mtVar.d(e1Var);
                mtVar.x.remove(e1Var);
                mtVar.A();
                break;
            default:
                this.d.setListener(null);
                mt mtVar2 = this.e;
                s4.e1 e1Var2 = this.b;
                mtVar2.u(e1Var2);
                mtVar2.v.remove(e1Var2);
                mtVar2.A();
                View view = e1Var2.a;
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setMoving(false);
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

    public ht(mt mtVar, s4.e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = mtVar;
        this.b = e1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
