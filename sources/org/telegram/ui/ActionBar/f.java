package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ f(l lVar, int i7) {
        this.a = i7;
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
                m5 m5Var = lVar2.n[1];
                if (m5Var != null && m5Var.getParent() != null) {
                    ((ViewGroup) lVar2.n[1].getParent()).removeView(lVar2.n[1]);
                }
                lVar2.O0.x(lVar2.n[1]);
                lVar2.n[1] = null;
                lVar2.i1 = false;
                Object[] objArr = lVar2.g0;
                lVar2.N((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) lVar2.g0[2]);
                break;
        }
    }
}
