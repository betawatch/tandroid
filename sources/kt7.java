// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class kt7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t09 b;

    public /* synthetic */ kt7(t09 t09Var, byte b) {
        this.a = b;
        this.b = t09Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        t09 t09Var = this.b;
        switch (b) {
            case 0:
                gl.B2(t09Var);
                break;
            case 1:
                super.onAnimationEnd(animator);
                t09Var.M0.e();
                break;
            default:
                super.onAnimationEnd(animator);
                t09Var.R = null;
                t09Var.o0 = 0.0f;
                t09Var.m0 = null;
                t09Var.invalidate();
                break;
        }
    }
}
