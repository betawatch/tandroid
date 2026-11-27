// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class jt5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kt5 b;

    public /* synthetic */ jt5(kt5 kt5Var, byte b) {
        this.a = b;
        this.b = kt5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        kt5 kt5Var = this.b;
        switch (b) {
            case 0:
                kt5Var.e.X1 = null;
                kt5Var.requestLayout();
                break;
            default:
                kt5Var.e.X1 = null;
                kt5Var.a = false;
                break;
        }
    }
}
