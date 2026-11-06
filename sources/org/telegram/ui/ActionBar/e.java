package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ e(k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    break;
                }
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
                k kVar = this.b;
                AnimatorSet animatorSet = kVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.P = null;
                    kVar.F.setVisibility(4);
                    break;
                }
                break;
            default:
                k kVar2 = this.b;
                k5 k5Var = kVar2.n[1];
                if (k5Var != null && k5Var.getParent() != null) {
                    ((ViewGroup) kVar2.n[1].getParent()).removeView(kVar2.n[1]);
                }
                kVar2.O0.x(kVar2.n[1]);
                kVar2.n[1] = null;
                kVar2.i1 = false;
                Object[] objArr = kVar2.g0;
                kVar2.L((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.g0[2]);
                break;
        }
    }
}
