package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                l5 l5Var = lVar2.n[1];
                if (l5Var != null && l5Var.getParent() != null) {
                    ((ViewGroup) lVar2.n[1].getParent()).removeView(lVar2.n[1]);
                }
                lVar2.N0.s(lVar2.n[1]);
                lVar2.n[1] = null;
                lVar2.Y0 = false;
                Object[] objArr = lVar2.g0;
                lVar2.K((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) lVar2.g0[2]);
                break;
        }
    }
}
