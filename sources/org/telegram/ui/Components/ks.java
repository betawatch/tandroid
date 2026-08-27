package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ks extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ f2.o1 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ os e;

    public ks(os osVar, f2.o1 o1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = osVar;
        this.b = o1Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                os osVar = this.e;
                f2.o1 o1Var = this.b;
                osVar.d(o1Var);
                osVar.x.remove(o1Var);
                osVar.A();
                break;
            default:
                this.d.setListener(null);
                os osVar2 = this.e;
                f2.o1 o1Var2 = this.b;
                osVar2.u(o1Var2);
                osVar2.v.remove(o1Var2);
                osVar2.A();
                View view = o1Var2.a;
                if (view instanceof org.telegram.ui.Cells.p2) {
                    ((org.telegram.ui.Cells.p2) view).setMoving(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.y();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public ks(os osVar, f2.o1 o1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = osVar;
        this.b = o1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
