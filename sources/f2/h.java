package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.os;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ o1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ r1 h;

    public /* synthetic */ h(r1 r1Var, o1 o1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.a = i12;
        this.h = r1Var;
        this.b = o1Var;
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
                    if (view3 instanceof pf.j) {
                        ((pf.j) view3).a = false;
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
                o1 o1Var = this.b;
                lVar.P(o1Var);
                lVar.v(o1Var);
                lVar.z.remove(o1Var);
                lVar.G();
                lVar.z(o1Var);
                break;
            default:
                this.f.setListener(null);
                os osVar = (os) this.h;
                o1 o1Var2 = this.b;
                osVar.v(o1Var2);
                osVar.w.remove(o1Var2);
                osVar.A();
                View view = o1Var2.a;
                if (view instanceof p2) {
                    ((p2) view).setMoving(false);
                } else if (view instanceof pf.j) {
                    ((pf.j) view).a = false;
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
                ((os) this.h).getClass();
                break;
        }
    }
}
