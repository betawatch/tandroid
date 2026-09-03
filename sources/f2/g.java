package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ m1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ l e;

    public g(l lVar, m1 m1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = lVar;
        this.b = m1Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                View view = this.c;
                view.setAlpha(1.0f);
                if (this.e.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    break;
                }
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
                View view = this.c;
                view.setAlpha(1.0f);
                l lVar = this.e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                lVar.Q();
                m1 m1Var = this.b;
                lVar.d(m1Var);
                lVar.A.remove(m1Var);
                lVar.G();
                break;
            default:
                this.d.setListener(null);
                l lVar2 = this.e;
                lVar2.M();
                m1 m1Var2 = this.b;
                lVar2.u(m1Var2);
                lVar2.y.remove(m1Var2);
                lVar2.G();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public g(l lVar, m1 m1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = lVar;
        this.b = m1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
