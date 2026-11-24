// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fy0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ my0 b;

    public /* synthetic */ fy0(my0 my0Var, byte b) {
        this.a = b;
        this.b = my0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        my0 my0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = my0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    my0Var.A0 = null;
                    my0Var.B0 = (byte) 0;
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet2 = my0Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    my0Var.A0 = null;
                    my0Var.B0 = (byte) 0;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        my0 my0Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = my0Var.A0;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    my0Var.A0 = null;
                    my0Var.B0 = (byte) 0;
                    my0Var.w();
                    hy0 hy0Var = my0Var.z0;
                    if (hy0Var != null) {
                        hy0Var.w();
                    }
                    if (my0Var.K) {
                        my0Var.c.setLayerType(0, null);
                    }
                    if (my0Var.W) {
                        WindowManager.LayoutParams attributes = my0Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        my0Var.getWindow().setAttributes(attributes);
                    }
                }
                if (my0Var.L0) {
                    nm7.e().k(100, 512);
                }
                my0Var.M0.e();
                break;
            default:
                AnimatorSet animatorSet2 = my0Var.A0;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    my0Var.A0 = null;
                    my0Var.B0 = (byte) 0;
                    gm.c3(new yt0(this, (byte) 6));
                }
                nm7.e().k(100, 512);
                break;
        }
    }
}
