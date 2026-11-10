package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class zr extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ v4.d1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ ds e;

    public zr(ds dsVar, v4.d1 d1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = dsVar;
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
                ds dsVar = this.e;
                v4.d1 d1Var = this.b;
                dsVar.d(d1Var);
                dsVar.x.remove(d1Var);
                dsVar.A();
                break;
            default:
                this.d.setListener(null);
                ds dsVar2 = this.e;
                v4.d1 d1Var2 = this.b;
                dsVar2.u(d1Var2);
                dsVar2.v.remove(d1Var2);
                dsVar2.A();
                View view = d1Var2.a;
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

    public zr(ds dsVar, v4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = dsVar;
        this.b = d1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
