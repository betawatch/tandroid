package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ u4.d1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ u4.f1 h;

    public /* synthetic */ bs(u4.f1 f1Var, u4.d1 d1Var, int i3, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.a = i11;
        this.h = f1Var;
        this.b = d1Var;
        this.c = i3;
        this.d = view;
        this.e = i10;
        this.f = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                int i3 = this.c;
                View view = this.d;
                if (i3 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                }
                View view2 = this.b.a;
                if (!(view2 instanceof org.telegram.ui.Cells.t2)) {
                    if (view2 instanceof kg.l) {
                        ((kg.l) view2).a = false;
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
                u4.d1 d1Var = this.b;
                esVar.v(d1Var);
                esVar.w.remove(d1Var);
                esVar.A();
                View view = d1Var.a;
                if (view instanceof org.telegram.ui.Cells.t2) {
                    ((org.telegram.ui.Cells.t2) view).setMoving(false);
                } else if (view instanceof kg.l) {
                    ((kg.l) view).a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                break;
            default:
                this.f.setListener(null);
                u4.k kVar = (u4.k) this.h;
                u4.d1 d1Var2 = this.b;
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
                ((u4.k) this.h).getClass();
                break;
        }
    }
}
