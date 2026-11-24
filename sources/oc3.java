// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oc3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u69 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ jka h;

    public /* synthetic */ oc3(jka jkaVar, u69 u69Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator, byte b) {
        this.a = b;
        this.h = jkaVar;
        this.b = u69Var;
        this.c = i;
        this.d = view;
        this.e = i2;
        this.f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        int i = this.e;
        int i2 = this.c;
        View view = this.d;
        switch (b) {
            case 0:
                if (i2 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i != 0) {
                    view.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                if (i2 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (i != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.b.a;
                if (!(view2 instanceof hg3)) {
                    if (view2 instanceof yk3) {
                        ((yk3) view2).a = false;
                        break;
                    }
                } else {
                    ((hg3) view2).setMoving(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        u69 u69Var = this.b;
        jka jkaVar = this.h;
        ViewPropertyAnimator viewPropertyAnimator = this.f;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                sc3 sc3Var = (sc3) jkaVar;
                sc3Var.P(u69Var);
                sc3Var.v(u69Var);
                sc3Var.z.remove(u69Var);
                sc3Var.G();
                sc3Var.z(u69Var);
                break;
            default:
                viewPropertyAnimator.setListener(null);
                ki3 ki3Var = (ki3) jkaVar;
                ki3Var.v(u69Var);
                ki3Var.w.remove(u69Var);
                ki3Var.A();
                View view = u69Var.a;
                if (view instanceof hg3) {
                    ((hg3) view).setMoving(false);
                } else if (view instanceof yk3) {
                    ((yk3) view).a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }
}
