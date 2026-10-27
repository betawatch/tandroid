package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import s4.e1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ e1 c;
    public final /* synthetic */ m d;

    public f(m mVar, e1 e1Var, View view) {
        this.d = mVar;
        this.c = e1Var;
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
                m mVar = this.d;
                ArrayList arrayList = mVar.y;
                e1 e1Var = this.c;
                if (arrayList.remove(e1Var)) {
                    mVar.u(e1Var);
                    mVar.G();
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
                m mVar2 = this.d;
                ArrayList arrayList2 = mVar2.A;
                e1 e1Var2 = this.c;
                if (arrayList2.remove(e1Var2)) {
                    mVar2.d(e1Var2);
                    mVar2.G();
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

    public f(m mVar, View view, e1 e1Var) {
        this.d = mVar;
        this.b = view;
        this.c = e1Var;
    }
}
