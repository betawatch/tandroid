package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ e(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                AnimatorSet animatorSet = lVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.P = null;
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
                l lVar = this.b;
                AnimatorSet animatorSet = lVar.P;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.P = null;
                    lVar.F.setVisibility(4);
                    break;
                }
                break;
            default:
                l lVar2 = this.b;
                u5 u5Var = lVar2.n[1];
                if (u5Var != null && u5Var.getParent() != null) {
                    ((ViewGroup) lVar2.n[1].getParent()).removeView(lVar2.n[1]);
                }
                lVar2.O0.w(lVar2.n[1]);
                lVar2.n[1] = null;
                lVar2.h1 = false;
                Object[] objArr = lVar2.g0;
                lVar2.L((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) lVar2.g0[2]);
                break;
        }
    }
}
