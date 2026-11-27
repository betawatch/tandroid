// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class gx0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx0 b;

    public /* synthetic */ gx0(nx0 nx0Var, byte b) {
        this.a = b;
        this.b = nx0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        nx0 nx0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = nx0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    nx0Var.A0 = null;
                    nx0Var.B0 = (byte) 0;
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet2 = nx0Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    nx0Var.A0 = null;
                    nx0Var.B0 = (byte) 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        nx0 nx0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = nx0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    nx0Var.A0 = null;
                    nx0Var.B0 = (byte) 0;
                    nx0Var.x();
                    ix0 ix0Var = nx0Var.z0;
                    if (ix0Var != null) {
                        ix0Var.x();
                    }
                    if (nx0Var.K) {
                        nx0Var.c.setLayerType(0, null);
                    }
                    if (nx0Var.W) {
                        WindowManager.LayoutParams attributes = nx0Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        nx0Var.getWindow().setAttributes(attributes);
                    }
                }
                if (nx0Var.L0) {
                    jn7.e().k(100, 512);
                }
                nx0Var.M0.e();
                break;
            default:
                AnimatorSet animatorSet2 = nx0Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    nx0Var.A0 = null;
                    nx0Var.B0 = (byte) 0;
                    hl.c3(new fv0(this, (byte) 5));
                }
                jn7.e().k(100, 512);
                break;
        }
    }
}
