// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class lb5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mb5 b;

    public /* synthetic */ lb5(mb5 mb5Var, byte b) {
        this.a = b;
        this.b = mb5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        mb5 mb5Var = this.b;
        switch (b) {
            case 0:
                mb5Var.O0 = null;
                mb5Var.E.F = false;
                ka5 ka5Var = mb5Var.F;
                if (ka5Var != null) {
                    if (ka5Var.getParent() != null) {
                        mb5Var.removeView(mb5Var.F);
                        mb5Var.F.e();
                    }
                    mb5Var.F = null;
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                mb5Var.K0 = null;
                mb5Var.J0 = 0.0f;
                mb5Var.invalidate();
                break;
            default:
                mb5Var.C0 = null;
                mb5Var.z0 = 1.0f;
                mb5Var.s0 = 0.0f;
                mb5Var.t0 = 0.0f;
                mb5Var.invalidate();
                break;
        }
    }
}
