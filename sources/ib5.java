// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ib5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jb5 b;

    public /* synthetic */ ib5(jb5 jb5Var, byte b) {
        this.a = b;
        this.b = jb5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        jb5 jb5Var = this.b;
        switch (b) {
            case 0:
                jb5Var.O0 = null;
                jb5Var.E.F = false;
                ha5 ha5Var = jb5Var.F;
                if (ha5Var != null) {
                    if (ha5Var.getParent() != null) {
                        jb5Var.removeView(jb5Var.F);
                        jb5Var.F.e();
                    }
                    jb5Var.F = null;
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                jb5Var.K0 = null;
                jb5Var.J0 = 0.0f;
                jb5Var.invalidate();
                break;
            default:
                jb5Var.C0 = null;
                jb5Var.z0 = 1.0f;
                jb5Var.s0 = 0.0f;
                jb5Var.t0 = 0.0f;
                jb5Var.invalidate();
                break;
        }
    }
}
