package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.at;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ p1 h;

    public /* synthetic */ h(p1 p1Var, m1 m1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.a = i12;
        this.h = p1Var;
        this.b = m1Var;
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
                    if (view3 instanceof uf.j) {
                        ((uf.j) view3).a = false;
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
                m1 m1Var = this.b;
                lVar.P(m1Var);
                lVar.v(m1Var);
                lVar.z.remove(m1Var);
                lVar.G();
                lVar.z(m1Var);
                break;
            default:
                this.f.setListener(null);
                at atVar = (at) this.h;
                m1 m1Var2 = this.b;
                atVar.v(m1Var2);
                atVar.w.remove(m1Var2);
                atVar.A();
                View view = m1Var2.a;
                if (view instanceof r2) {
                    ((r2) view).setMoving(false);
                } else if (view instanceof uf.j) {
                    ((uf.j) view).a = false;
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
                ((at) this.h).getClass();
                break;
        }
    }
}
