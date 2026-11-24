// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ia2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eb3 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ la2 e;

    public /* synthetic */ ia2(la2 la2Var, eb3 eb3Var, ViewPropertyAnimator viewPropertyAnimator, View view, byte b) {
        this.a = b;
        this.e = la2Var;
        this.b = eb3Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        la2 la2Var = this.e;
        eb3 eb3Var = this.b;
        switch (b) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof gb2) {
                    ((gb2) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                if (la2Var.B.remove(eb3Var.a)) {
                    la2Var.d(eb3Var.a);
                    la2Var.G();
                    break;
                }
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof gb2) {
                    ((gb2) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                if (la2Var.B.remove(eb3Var.b)) {
                    la2Var.d(eb3Var.b);
                    la2Var.G();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                s49 s49Var = this.b.a;
                break;
            default:
                s49 s49Var2 = this.b.b;
                break;
        }
    }
}
