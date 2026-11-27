// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
