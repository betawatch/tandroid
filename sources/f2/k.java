package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ n e;

    public /* synthetic */ k(n nVar, l lVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i9) {
        this.a = i9;
        this.e = nVar;
        this.b = lVar;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                n nVar = this.e;
                if (nVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                l lVar = this.b;
                q1 q1Var = lVar.a;
                nVar.O();
                nVar.d(lVar.a);
                nVar.B.remove(lVar.a);
                nVar.G();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                n nVar2 = this.e;
                if (nVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                l lVar2 = this.b;
                q1 q1Var2 = lVar2.b;
                nVar2.O();
                nVar2.d(lVar2.b);
                nVar2.B.remove(lVar2.b);
                nVar2.G();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                q1 q1Var = this.b.a;
                this.e.getClass();
                break;
            default:
                q1 q1Var2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
