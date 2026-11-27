// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k08 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ b18 c;

    public /* synthetic */ k08(b18 b18Var, boolean z, byte b) {
        this.a = b;
        this.c = b18Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        b18 b18Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = b18Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    b18Var.N = null;
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet2 = b18Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    b18Var.N = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        b18 b18Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = b18Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        b18Var.O.setVisibility(4);
                        break;
                    } else {
                        b18Var.M.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                AnimatorSet animatorSet2 = b18Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        b18Var.Q.setVisibility(4);
                        break;
                    } else {
                        b18Var.P.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
