package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uc0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kh.z8 b;

    public /* synthetic */ uc0(kh.z8 z8Var, int i9) {
        this.a = i9;
        this.b = z8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                kh.z8 z8Var = this.b;
                AnimatorSet animatorSet = (AnimatorSet) z8Var.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    z8Var.e = null;
                    break;
                }
                break;
            case 1:
                kh.z8 z8Var2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) z8Var2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    z8Var2.e = null;
                    break;
                }
                break;
            default:
                kh.z8 z8Var3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) z8Var3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    z8Var3.e = null;
                    break;
                }
                break;
        }
    }
}
