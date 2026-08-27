package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ lh.w8 b;

    public /* synthetic */ zc0(lh.w8 w8Var, int i10) {
        this.a = i10;
        this.b = w8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                lh.w8 w8Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) w8Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    w8Var.e = null;
                    break;
                }
                break;
            case 1:
                lh.w8 w8Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) w8Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    w8Var2.e = null;
                    break;
                }
                break;
            default:
                lh.w8 w8Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) w8Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    w8Var3.e = null;
                    break;
                }
                break;
        }
    }
}
