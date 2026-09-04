package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;
import s4.c1;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ View b;
    public final /* synthetic */ c1 c;
    public final /* synthetic */ o d;

    public g(o oVar, c1 c1Var, View view) {
        this.d = oVar;
        this.c = c1Var;
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
                o oVar = this.d;
                ArrayList arrayList = oVar.y;
                c1 c1Var = this.c;
                if (arrayList.remove(c1Var)) {
                    oVar.u(c1Var);
                    oVar.G();
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
                o oVar2 = this.d;
                ArrayList arrayList2 = oVar2.A;
                c1 c1Var2 = this.c;
                if (arrayList2.remove(c1Var2)) {
                    oVar2.d(c1Var2);
                    oVar2.G();
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

    public g(o oVar, View view, c1 c1Var) {
        this.d = oVar;
        this.b = view;
        this.c = c1Var;
    }
}
