package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class jt extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4.e1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ViewPropertyAnimator f;
    public final /* synthetic */ s4.g1 h;

    public /* synthetic */ jt(s4.g1 g1Var, s4.e1 e1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.a = i12;
        this.h = g1Var;
        this.b = e1Var;
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
                if (!(view2 instanceof org.telegram.ui.Cells.p2)) {
                    if (view2 instanceof ig.m) {
                        ((ig.m) view2).a = false;
                        break;
                    }
                } else {
                    ((org.telegram.ui.Cells.p2) view2).setMoving(false);
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
                mt mtVar = (mt) this.h;
                s4.e1 e1Var = this.b;
                mtVar.v(e1Var);
                mtVar.w.remove(e1Var);
                mtVar.A();
                View view = e1Var.a;
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setMoving(false);
                } else if (view instanceof ig.m) {
                    ((ig.m) view).a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                break;
            default:
                this.f.setListener(null);
                s4.l lVar = (s4.l) this.h;
                s4.e1 e1Var2 = this.b;
                lVar.P(e1Var2);
                lVar.v(e1Var2);
                lVar.z.remove(e1Var2);
                lVar.G();
                lVar.z(e1Var2);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((mt) this.h).getClass();
                break;
            default:
                ((s4.l) this.h).getClass();
                break;
        }
    }
}
