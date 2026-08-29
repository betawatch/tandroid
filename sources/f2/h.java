package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.us;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ q1 h;

    public /* synthetic */ h(q1 q1Var, n1 n1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.a = i12;
        this.h = q1Var;
        this.b = n1Var;
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
                if (!(view3 instanceof p2)) {
                    if (view3 instanceof rf.k) {
                        ((rf.k) view3).a = false;
                        break;
                    }
                } else {
                    ((p2) view3).setMoving(false);
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
                n1 n1Var = this.b;
                lVar.P(n1Var);
                lVar.v(n1Var);
                lVar.z.remove(n1Var);
                lVar.G();
                lVar.z(n1Var);
                break;
            default:
                this.f.setListener(null);
                us usVar = (us) this.h;
                n1 n1Var2 = this.b;
                usVar.v(n1Var2);
                usVar.w.remove(n1Var2);
                usVar.A();
                View view = n1Var2.a;
                if (view instanceof p2) {
                    ((p2) view).setMoving(false);
                } else if (view instanceof rf.k) {
                    ((rf.k) view).a = false;
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
                ((us) this.h).getClass();
                break;
        }
    }
}
