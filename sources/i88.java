// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class i88 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k88 b;

    public /* synthetic */ i88(k88 k88Var, byte b) {
        this.a = b;
        this.b = k88Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        k88 k88Var = this.b;
        switch (b) {
            case 0:
                k88Var.s = null;
                break;
            default:
                k88Var.w = null;
                break;
        }
    }
}
