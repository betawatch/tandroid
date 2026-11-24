// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cx7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ vx7 c;

    public /* synthetic */ cx7(vx7 vx7Var, boolean z, byte b) {
        this.a = b;
        this.c = vx7Var;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        vx7 vx7Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = vx7Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    vx7Var.N = null;
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet2 = vx7Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    vx7Var.N = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        boolean z = this.b;
        vx7 vx7Var = this.c;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = vx7Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!z) {
                        vx7Var.O.setVisibility(4);
                        break;
                    } else {
                        vx7Var.M.getContentView().setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                AnimatorSet animatorSet2 = vx7Var.N;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        vx7Var.Q.setVisibility(4);
                        break;
                    } else {
                        vx7Var.P.setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }
}
