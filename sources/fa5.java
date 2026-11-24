// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fa5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ha5 b;

    public /* synthetic */ fa5(ha5 ha5Var, byte b) {
        this.a = b;
        this.b = ha5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ha5 ha5Var = this.b;
        switch (b) {
            case 0:
                ha5Var.F = false;
                ha5Var.invalidate();
                break;
            case 1:
                ga5 ga5Var = ha5Var.b0;
                float f = ha5Var.W ? 0.0f : 1.0f;
                ha5Var.a0 = f;
                ga5Var.setAlpha(f);
                ga5Var.setVisibility(ha5Var.W ? 8 : 0);
                ha5Var.a.invalidate();
                break;
            case 2:
                super.onAnimationEnd(animator);
                ha5Var.H0 = null;
                da5 da5Var = ha5Var.a;
                da5Var.setRotationY(0.0f);
                if (!ha5Var.I0) {
                    da5Var.d.clearImage();
                    break;
                }
                break;
            case 3:
                ha5Var.F = false;
                break;
            default:
                ha5Var.F = false;
                break;
        }
    }
}
