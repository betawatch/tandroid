package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class qs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f2.n1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ us e;

    public qs(us usVar, f2.n1 n1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = usVar;
        this.b = n1Var;
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
                us usVar = this.e;
                f2.n1 n1Var = this.b;
                usVar.d(n1Var);
                usVar.x.remove(n1Var);
                usVar.A();
                break;
            default:
                this.d.setListener(null);
                us usVar2 = this.e;
                f2.n1 n1Var2 = this.b;
                usVar2.u(n1Var2);
                usVar2.v.remove(n1Var2);
                usVar2.A();
                View view = n1Var2.a;
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

    public qs(us usVar, f2.n1 n1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = usVar;
        this.b = n1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
