package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
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
                AnimatorSet animatorSet = kVar.Q;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.Q = null;
                    kVar.G.setVisibility(4);
                    break;
                }
                break;
            default:
                k kVar2 = this.b;
                j5 j5Var = kVar2.n[1];
                if (j5Var != null && j5Var.getParent() != null) {
                    ((ViewGroup) kVar2.n[1].getParent()).removeView(kVar2.n[1]);
                }
                kVar2.P0.x(kVar2.n[1]);
                kVar2.n[1] = null;
                kVar2.j1 = false;
                Object[] objArr = kVar2.h0;
                kVar2.O((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.h0[2]);
                break;
        }
    }
}
