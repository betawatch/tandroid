package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import v4.d1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ d1 c;
    public final /* synthetic */ l d;

    public f(l lVar, d1 d1Var, View view) {
        this.d = lVar;
        this.c = d1Var;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(1.0f);
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
                animator.removeAllListeners();
                View view = this.b;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationY(0.0f);
                view.setTranslationY(0.0f);
                l lVar = this.d;
                ArrayList arrayList = lVar.y;
                d1 d1Var = this.c;
                if (arrayList.remove(d1Var)) {
                    lVar.u(d1Var);
                    lVar.G();
                    break;
                }
                break;
            default:
                animator.removeAllListeners();
                View view2 = this.b;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                l lVar2 = this.d;
                ArrayList arrayList2 = lVar2.A;
                d1 d1Var2 = this.c;
                if (arrayList2.remove(d1Var2)) {
                    lVar2.d(d1Var2);
                    lVar2.G();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public f(l lVar, View view, d1 d1Var) {
        this.d = lVar;
        this.b = view;
        this.c = d1Var;
    }
}
