// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ne3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ue3 b;

    public /* synthetic */ ne3(ue3 ue3Var, byte b) {
        this.a = b;
        this.b = ue3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ue3 ue3Var = this.b;
        switch (b) {
            case 0:
                ue3Var.W3 = 1.0f;
                ue3Var.Z3 = null;
                ue3Var.a4 = null;
                ue3Var.b4 = null;
                ue3Var.invalidate();
                break;
            case 1:
                ue3Var.X3 = 1.0f;
                ue3Var.invalidate();
                break;
            default:
                int i = (ue3Var.T2 ? 1 : 0) + (ue3Var.R2 ? 2 : 0) + (ue3Var.S2 ? 4 : 0);
                int i2 = ue3Var.w4;
                if (i2 != i) {
                    ue3Var.J(i2, i);
                } else {
                    ue3Var.A4 = false;
                    ue3Var.y4 = i2;
                }
                ue3Var.invalidate();
                break;
        }
    }
}
