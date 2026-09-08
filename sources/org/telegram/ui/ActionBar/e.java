package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ e(k kVar, int i10) {
        this.a = i10;
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
                j5 j5Var = kVar2.n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) kVar2.n[1].getParent()).removeView(kVar2.n[1]);
                }
                kVar2.N0.s(kVar2.n[1]);
                kVar2.n[1] = null;
                kVar2.Y0 = false;
                Object[] objArr = kVar2.g0;
                kVar2.K((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.g0[2]);
                break;
        }
    }
}
