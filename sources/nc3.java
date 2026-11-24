// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nc3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ u69 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ sc3 e;

    public nc3(sc3 sc3Var, u69 u69Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = sc3Var;
        this.b = u69Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
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
        byte b = this.a;
        u69 u69Var = this.b;
        sc3 sc3Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                View view = this.c;
                view.setAlpha(1.0f);
                if (sc3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                sc3Var.Q();
                sc3Var.d(u69Var);
                sc3Var.A.remove(u69Var);
                sc3Var.G();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                sc3Var.M();
                sc3Var.u(u69Var);
                sc3Var.y.remove(u69Var);
                sc3Var.G();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
    }

    public nc3(sc3 sc3Var, u69 u69Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = sc3Var;
        this.b = u69Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
