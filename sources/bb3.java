// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bb3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ s49 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ gb3 e;

    public bb3(gb3 gb3Var, s49 s49Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = gb3Var;
        this.b = s49Var;
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
        s49 s49Var = this.b;
        gb3 gb3Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                View view = this.c;
                view.setAlpha(1.0f);
                if (gb3Var.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                gb3Var.Q();
                gb3Var.d(s49Var);
                gb3Var.A.remove(s49Var);
                gb3Var.G();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                gb3Var.M();
                gb3Var.u(s49Var);
                gb3Var.y.remove(s49Var);
                gb3Var.G();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
    }

    public bb3(gb3 gb3Var, s49 s49Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = gb3Var;
        this.b = s49Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
