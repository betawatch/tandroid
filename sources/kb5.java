// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kb5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ka5 b;
    public final /* synthetic */ mb5 c;

    public /* synthetic */ kb5(mb5 mb5Var, ka5 ka5Var, byte b) {
        this.a = b;
        this.c = mb5Var;
        this.b = ka5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        mb5 mb5Var = this.c;
        ka5 ka5Var = this.b;
        switch (b) {
            case 0:
                mb5Var.O0 = null;
                ka5Var.F = false;
                ka5 ka5Var2 = mb5Var.F;
                if (ka5Var2 != null) {
                    if (ka5Var2.getParent() != null) {
                        mb5Var.removeView(mb5Var.F);
                        mb5Var.F.e();
                    }
                    mb5Var.F = null;
                    break;
                }
                break;
            case 1:
                mb5Var.y.e();
                mb5Var.r = null;
                ka5Var.r = false;
                if (!mb5Var.b) {
                    mb5Var.d();
                    mb5Var.E = null;
                    mb5Var.d = 0L;
                }
                mb5Var.c = mb5Var.b ? 1.0f : 0.0f;
                mb5Var.j();
                mb5Var.g(false);
                if (!mb5Var.b) {
                    mb5Var.l0.setVisibility(8);
                    mb5Var.m0.setVisibility(8);
                    mb5Var.f0.setVisibility(8);
                    mb5Var.g0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (ka5Var.getParent() != null) {
                    mb5Var.removeView(ka5Var);
                    ka5Var.e();
                    break;
                }
                break;
            default:
                if (ka5Var.getParent() != null) {
                    mb5Var.removeView(ka5Var);
                    ka5Var.e();
                    break;
                }
                break;
        }
    }
}
