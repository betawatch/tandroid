package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ l e;

    public /* synthetic */ i(l lVar, j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.a = i10;
        this.e = lVar;
        this.b = jVar;
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
                l lVar = this.e;
                if (lVar.A(view) > 0.0f) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                }
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                j jVar = this.b;
                m1 m1Var = jVar.a;
                lVar.O();
                lVar.d(jVar.a);
                lVar.B.remove(jVar.a);
                lVar.G();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                l lVar2 = this.e;
                if (lVar2.A(view2) > 0.0f) {
                    view2.setScaleX(1.0f);
                    view2.setScaleY(1.0f);
                }
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                j jVar2 = this.b;
                m1 m1Var2 = jVar2.b;
                lVar2.O();
                lVar2.d(jVar2.b);
                lVar2.B.remove(jVar2.b);
                lVar2.G();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                m1 m1Var = this.b.a;
                this.e.getClass();
                break;
            default:
                m1 m1Var2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
