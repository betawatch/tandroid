package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ms extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ s4.f1 h;

    public /* synthetic */ ms(s4.f1 f1Var, s4.c1 c1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.a = i12;
        this.h = f1Var;
        this.b = c1Var;
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
                if (!(view2 instanceof org.telegram.ui.Cells.v2)) {
                    if (view2 instanceof zf.l) {
                        ((zf.l) view2).a = false;
                        break;
                    }
                } else {
                    ((org.telegram.ui.Cells.v2) view2).setMoving(false);
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
                ps psVar = (ps) this.h;
                s4.c1 c1Var = this.b;
                psVar.v(c1Var);
                psVar.w.remove(c1Var);
                psVar.A();
                View view = c1Var.a;
                if (view instanceof org.telegram.ui.Cells.v2) {
                    ((org.telegram.ui.Cells.v2) view).setMoving(false);
                } else if (view instanceof zf.l) {
                    ((zf.l) view).a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                break;
            default:
                this.f.setListener(null);
                s4.j jVar = (s4.j) this.h;
                s4.c1 c1Var2 = this.b;
                jVar.P(c1Var2);
                jVar.v(c1Var2);
                jVar.z.remove(c1Var2);
                jVar.G();
                jVar.z(c1Var2);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((ps) this.h).getClass();
                break;
            default:
                ((s4.j) this.h).getClass();
                break;
        }
    }
}
