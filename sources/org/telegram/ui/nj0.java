package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class nj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ hk0 c;

    public /* synthetic */ nj0(hk0 hk0Var, boolean z10, int i7) {
        this.a = i7;
        this.c = hk0Var;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                hk0 hk0Var = this.c;
                AnimatorSet animatorSet = hk0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    hk0Var.N = null;
                    break;
                }
                break;
            default:
                hk0 hk0Var2 = this.c;
                AnimatorSet animatorSet2 = hk0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    hk0Var2.N = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                hk0 hk0Var = this.c;
                AnimatorSet animatorSet = hk0Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        hk0Var.O.setVisibility(4);
                        break;
                    } else {
                        hk0Var.M.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                hk0 hk0Var2 = this.c;
                AnimatorSet animatorSet2 = hk0Var2.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        hk0Var2.Q.setVisibility(4);
                        break;
                    } else {
                        hk0Var2.P.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
