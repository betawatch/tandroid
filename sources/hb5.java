// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hb5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ha5 b;
    public final /* synthetic */ jb5 c;

    public /* synthetic */ hb5(jb5 jb5Var, ha5 ha5Var, byte b) {
        this.a = b;
        this.c = jb5Var;
        this.b = ha5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        jb5 jb5Var = this.c;
        ha5 ha5Var = this.b;
        switch (b) {
            case 0:
                jb5Var.O0 = null;
                ha5Var.F = false;
                ha5 ha5Var2 = jb5Var.F;
                if (ha5Var2 != null) {
                    if (ha5Var2.getParent() != null) {
                        jb5Var.removeView(jb5Var.F);
                        jb5Var.F.e();
                    }
                    jb5Var.F = null;
                    break;
                }
                break;
            case 1:
                jb5Var.y.e();
                jb5Var.r = null;
                ha5Var.r = false;
                if (!jb5Var.b) {
                    jb5Var.d();
                    jb5Var.E = null;
                    jb5Var.d = 0L;
                }
                jb5Var.c = jb5Var.b ? 1.0f : 0.0f;
                jb5Var.j();
                jb5Var.g(false);
                if (!jb5Var.b) {
                    jb5Var.l0.setVisibility(8);
                    jb5Var.m0.setVisibility(8);
                    jb5Var.f0.setVisibility(8);
                    jb5Var.g0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (ha5Var.getParent() != null) {
                    jb5Var.removeView(ha5Var);
                    ha5Var.e();
                    break;
                }
                break;
            default:
                if (ha5Var.getParent() != null) {
                    jb5Var.removeView(ha5Var);
                    ha5Var.e();
                    break;
                }
                break;
        }
    }
}
