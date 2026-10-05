package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class zs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ dt e;

    public zs(dt dtVar, s4.c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = dtVar;
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
                dt dtVar = this.e;
                s4.c1 c1Var = this.b;
                dtVar.d(c1Var);
                dtVar.x.remove(c1Var);
                dtVar.A();
                break;
            default:
                this.d.setListener(null);
                dt dtVar2 = this.e;
                s4.c1 c1Var2 = this.b;
                dtVar2.u(c1Var2);
                dtVar2.v.remove(c1Var2);
                dtVar2.A();
                View view = c1Var2.a;
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

    public zs(dt dtVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = dtVar;
        this.b = c1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
