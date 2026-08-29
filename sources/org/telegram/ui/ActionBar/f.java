package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ f(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                AnimatorSet animatorSet = lVar.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.L = null;
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
                AnimatorSet animatorSet = lVar.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lVar.L = null;
                    lVar.B.setVisibility(4);
                    break;
                }
                break;
            default:
                l lVar2 = this.b;
                h5 h5Var = lVar2.n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) lVar2.n[1].getParent()).removeView(lVar2.n[1]);
                }
                lVar2.J0.q(lVar2.n[1]);
                lVar2.n[1] = null;
                lVar2.U0 = false;
                Object[] objArr = lVar2.c0;
                lVar2.J((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) lVar2.c0[2]);
                break;
        }
    }
}
