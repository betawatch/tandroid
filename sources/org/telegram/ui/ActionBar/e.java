package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                AnimatorSet animatorSet = kVar.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.L = null;
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
                AnimatorSet animatorSet = kVar.L;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kVar.L = null;
                    kVar.B.setVisibility(4);
                    break;
                }
                break;
            default:
                k kVar2 = this.b;
                h5 h5Var = kVar2.n[1];
                if (h5Var != null && h5Var.getParent() != null) {
                    ((ViewGroup) kVar2.n[1].getParent()).removeView(kVar2.n[1]);
                }
                kVar2.J0.q(kVar2.n[1]);
                kVar2.n[1] = null;
                kVar2.U0 = false;
                Object[] objArr = kVar2.c0;
                kVar2.K((String) objArr[0], ((Integer) objArr[1]).intValue(), (Runnable) kVar2.c0[2]);
                break;
        }
    }
}
