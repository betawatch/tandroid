package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class gt extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.b1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ s4.e1 h;

    public /* synthetic */ gt(s4.e1 e1Var, s4.b1 b1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.a = i12;
        this.h = e1Var;
        this.b = b1Var;
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
                }
                View view2 = this.b.a;
                if (!(view2 instanceof org.telegram.ui.Cells.q2)) {
                    if (view2 instanceof hg.l) {
                        ((hg.l) view2).a = false;
                        break;
                    }
                } else {
                    ((org.telegram.ui.Cells.q2) view2).setMoving(false);
                    break;
                }
                break;
            default:
                int i11 = this.c;
                View view3 = this.d;
                if (i11 != 0) {
                    view3.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view3.setTranslationY(0.0f);
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
                kt ktVar = (kt) this.h;
                s4.b1 b1Var = this.b;
                ktVar.v(b1Var);
                ktVar.w.remove(b1Var);
                ktVar.A();
                View view = b1Var.a;
                if (view instanceof org.telegram.ui.Cells.q2) {
                    ((org.telegram.ui.Cells.q2) view).setMoving(false);
                } else if (view instanceof hg.l) {
                    ((hg.l) view).a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                break;
            default:
                this.f.setListener(null);
                s4.k kVar = (s4.k) this.h;
                s4.b1 b1Var2 = this.b;
                kVar.P(b1Var2);
                kVar.v(b1Var2);
                kVar.z.remove(b1Var2);
                kVar.G();
                kVar.z(b1Var2);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((kt) this.h).getClass();
                break;
            default:
                ((s4.k) this.h).getClass();
                break;
        }
    }
}
