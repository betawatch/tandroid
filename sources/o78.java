// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class o78 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r78 b;

    public /* synthetic */ o78(r78 r78Var, byte b) {
        this.a = b;
        this.b = r78Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        r78 r78Var = this.b;
        switch (b) {
            case 0:
                r78Var.w1 = null;
                break;
            default:
                r78Var.x1 = null;
                break;
        }
    }
}
