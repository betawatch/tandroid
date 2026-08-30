package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.ys;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ o1 h;

    public /* synthetic */ h(o1 o1Var, l1 l1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.a = i12;
        this.h = o1Var;
        this.b = l1Var;
        this.c = i10;
        this.d = view;
        this.e = i11;
        this.f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                int i10 = this.c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                int i11 = this.c;
                View view2 = this.d;
                if (i11 != 0) {
                    view2.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view2.setTranslationY(0.0f);
                }
                View view3 = this.b.a;
                if (!(view3 instanceof r2)) {
                    if (view3 instanceof tf.j) {
                        ((tf.j) view3).a = false;
                        break;
                    }
                } else {
                    ((r2) view3).setMoving(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.f.setListener(null);
                l lVar = (l) this.h;
                l1 l1Var = this.b;
                lVar.P(l1Var);
                lVar.v(l1Var);
                lVar.z.remove(l1Var);
                lVar.G();
                lVar.z(l1Var);
                break;
            default:
                this.f.setListener(null);
                ys ysVar = (ys) this.h;
                l1 l1Var2 = this.b;
                ysVar.v(l1Var2);
                ysVar.w.remove(l1Var2);
                ysVar.A();
                View view = l1Var2.a;
                if (view instanceof r2) {
                    ((r2) view).setMoving(false);
                } else if (view instanceof tf.j) {
                    ((tf.j) view).a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((l) this.h).getClass();
                break;
            default:
                ((ys) this.h).getClass();
                break;
        }
    }
}
