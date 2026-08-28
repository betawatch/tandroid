package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ q1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ n e;

    public i(n nVar, q1 q1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = nVar;
        this.b = q1Var;
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
                n nVar = this.e;
                if (nVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                nVar.Q();
                q1 q1Var = this.b;
                nVar.d(q1Var);
                nVar.A.remove(q1Var);
                nVar.G();
                break;
            default:
                this.d.setListener(null);
                n nVar2 = this.e;
                nVar2.M();
                q1 q1Var2 = this.b;
                nVar2.u(q1Var2);
                nVar2.y.remove(q1Var2);
                nVar2.G();
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

    public i(n nVar, q1 q1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = nVar;
        this.b = q1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }
}
