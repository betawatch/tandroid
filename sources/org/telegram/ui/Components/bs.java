package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class bs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4.d1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ v4.f1 h;

    public /* synthetic */ bs(v4.f1 f1Var, v4.d1 d1Var, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.a = i11;
        this.h = f1Var;
        this.b = d1Var;
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
                    if (view2 instanceof jg.m) {
                        ((jg.m) view2).a = false;
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
                es esVar = (es) this.h;
                v4.d1 d1Var = this.b;
                esVar.v(d1Var);
                esVar.w.remove(d1Var);
                esVar.A();
                View view = d1Var.a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                } else if (view instanceof jg.m) {
                    ((jg.m) view).a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                break;
            default:
                this.f.setListener(null);
                v4.k kVar = (v4.k) this.h;
                v4.d1 d1Var2 = this.b;
                kVar.P(d1Var2);
                kVar.v(d1Var2);
                kVar.z.remove(d1Var2);
                kVar.G();
                kVar.z(d1Var2);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((es) this.h).getClass();
                break;
            default:
                ((v4.k) this.h).getClass();
                break;
        }
    }
}
