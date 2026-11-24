// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fz7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xz7 c;

    public /* synthetic */ fz7(xz7 xz7Var, boolean z, byte b) {
        this.a = b;
        this.c = xz7Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        xz7 xz7Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = xz7Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xz7Var.N = null;
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet2 = xz7Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    xz7Var.N = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        xz7 xz7Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = xz7Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        xz7Var.O.setVisibility(4);
                        break;
                    } else {
                        xz7Var.M.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                AnimatorSet animatorSet2 = xz7Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        xz7Var.Q.setVisibility(4);
                        break;
                    } else {
                        xz7Var.P.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
