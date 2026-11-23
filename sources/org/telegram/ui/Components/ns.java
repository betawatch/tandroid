package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ns extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4.f1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ v4.h1 h;

    public /* synthetic */ ns(v4.h1 h1Var, v4.f1 f1Var, int i7, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.a = i11;
        this.h = h1Var;
        this.b = f1Var;
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
                if (!(view2 instanceof org.telegram.ui.Cells.u2)) {
                    if (view2 instanceof jg.l) {
                        ((jg.l) view2).a = false;
                        break;
                    }
                } else {
                    ((org.telegram.ui.Cells.u2) view2).setMoving(false);
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
                qs qsVar = (qs) this.h;
                v4.f1 f1Var = this.b;
                qsVar.v(f1Var);
                qsVar.w.remove(f1Var);
                qsVar.A();
                View view = f1Var.a;
                if (view instanceof org.telegram.ui.Cells.u2) {
                    ((org.telegram.ui.Cells.u2) view).setMoving(false);
                } else if (view instanceof jg.l) {
                    ((jg.l) view).a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                break;
            default:
                this.f.setListener(null);
                v4.l lVar = (v4.l) this.h;
                v4.f1 f1Var2 = this.b;
                lVar.P(f1Var2);
                lVar.v(f1Var2);
                lVar.z.remove(f1Var2);
                lVar.G();
                lVar.z(f1Var2);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((qs) this.h).getClass();
                break;
            default:
                ((v4.l) this.h).getClass();
                break;
        }
    }
}
