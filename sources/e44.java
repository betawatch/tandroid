// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class e44 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h44 b;

    public /* synthetic */ e44(h44 h44Var, byte b) {
        this.a = b;
        this.b = h44Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        h44 h44Var = this.b;
        switch (b) {
            case 0:
                if (animator == h44Var.c0) {
                    h44Var.c0 = null;
                    break;
                }
                break;
            case 1:
                if (animator == h44Var.d0) {
                    h44Var.d0 = null;
                    break;
                }
                break;
            case 2:
                if (animator == h44Var.R) {
                    h44Var.R = null;
                    h44Var.Q = 0.0f;
                    break;
                }
                break;
            case 3:
                if (animator == h44Var.S) {
                    h44Var.S = null;
                    break;
                }
                break;
            default:
                if (!h44Var.n0) {
                    hl.B2(h44Var.J);
                    h44Var.J = null;
                    break;
                }
                break;
        }
    }
}
