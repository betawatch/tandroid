package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4.e1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ v4.g1 h;

    public /* synthetic */ hs(v4.g1 g1Var, v4.e1 e1Var, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.a = i11;
        this.h = g1Var;
        this.b = e1Var;
        this.c = i7;
        this.d = view;
        this.e = i10;
        this.f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                int i7 = this.c;
                View view = this.d;
                if (i7 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.b.a;
                if (!(view2 instanceof org.telegram.ui.Cells.t2)) {
                    if (view2 instanceof jg.l) {
                        ((jg.l) view2).a = false;
                        break;
                    }
                } else {
                    ((org.telegram.ui.Cells.t2) view2).setMoving(false);
                    break;
                }
                break;
            default:
                int i10 = this.c;
                View view3 = this.d;
                if (i10 != 0) {
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
                ks ksVar = (ks) this.h;
                v4.e1 e1Var = this.b;
                ksVar.v(e1Var);
                ksVar.w.remove(e1Var);
                ksVar.A();
                View view = e1Var.a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                } else if (view instanceof jg.l) {
                    ((jg.l) view).a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                break;
            default:
                this.f.setListener(null);
                v4.k kVar = (v4.k) this.h;
                v4.e1 e1Var2 = this.b;
                kVar.P(e1Var2);
                kVar.v(e1Var2);
                kVar.z.remove(e1Var2);
                kVar.G();
                kVar.z(e1Var2);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((ks) this.h).getClass();
                break;
            default:
                ((v4.k) this.h).getClass();
                break;
        }
    }
}
