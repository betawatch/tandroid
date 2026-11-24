// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class i34 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l34 b;

    public /* synthetic */ i34(l34 l34Var, byte b) {
        this.a = b;
        this.b = l34Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        l34 l34Var = this.b;
        switch (b) {
            case 0:
                if (animator == l34Var.c0) {
                    l34Var.c0 = null;
                    break;
                }
                break;
            case 1:
                if (animator == l34Var.d0) {
                    l34Var.d0 = null;
                    break;
                }
                break;
            case 2:
                if (animator == l34Var.R) {
                    l34Var.R = null;
                    l34Var.Q = 0.0f;
                    break;
                }
                break;
            case 3:
                if (animator == l34Var.S) {
                    l34Var.S = null;
                    break;
                }
                break;
            default:
                if (!l34Var.n0) {
                    gl.B2(l34Var.J);
                    l34Var.J = null;
                    break;
                }
                break;
        }
    }
}
