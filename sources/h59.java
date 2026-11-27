// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class h59 extends AnimatorListenerAdapter {
    public final /* synthetic */ g59 a;
    public final /* synthetic */ i59 b;

    public h59(i59 i59Var, g59 g59Var) {
        this.b = i59Var;
        this.a = g59Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g59 g59Var = this.a;
        g59Var.setLayerType(0, null);
        this.b.d.removeView(g59Var);
    }
}
