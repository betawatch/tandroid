package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.ps;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ t1 h;

    public /* synthetic */ j(t1 t1Var, q1 q1Var, int i9, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.a = i11;
        this.h = t1Var;
        this.b = q1Var;
        this.c = i9;
        this.d = view;
        this.e = i10;
        this.f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                int i9 = this.c;
                View view = this.d;
                if (i9 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                int i10 = this.c;
                View view2 = this.d;
                if (i10 != 0) {
                    view2.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view2.setTranslationY(0.0f);
                }
                View view3 = this.b.a;
                if (!(view3 instanceof r2)) {
                    if (view3 instanceof of.l) {
                        ((of.l) view3).a = false;
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
                n nVar = (n) this.h;
                q1 q1Var = this.b;
                nVar.P(q1Var);
                nVar.v(q1Var);
                nVar.z.remove(q1Var);
                nVar.G();
                nVar.z(q1Var);
                break;
            default:
                this.f.setListener(null);
                ps psVar = (ps) this.h;
                q1 q1Var2 = this.b;
                psVar.v(q1Var2);
                psVar.w.remove(q1Var2);
                psVar.A();
                View view = q1Var2.a;
                if (view instanceof r2) {
                    ((r2) view).setMoving(false);
                } else if (view instanceof of.l) {
                    ((of.l) view).a = false;
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
                ((n) this.h).getClass();
                break;
            default:
                ((ps) this.h).getClass();
                break;
        }
    }
}
