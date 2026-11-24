// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bx9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dx9 b;

    public /* synthetic */ bx9(dx9 dx9Var, byte b) {
        this.a = b;
        this.b = dx9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        dx9 dx9Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                dx9Var.J = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                dx9Var.J = null;
                break;
            default:
                super.onAnimationEnd(animator);
                dx9Var.O = 0.0f;
                dx9Var.J = null;
                dx9Var.N = false;
                dx9Var.d(true, false);
                break;
        }
    }
}
