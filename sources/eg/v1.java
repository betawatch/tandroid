package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v1 extends AnimatorListenerAdapter {
    public final /* synthetic */ t1 a;
    public final /* synthetic */ w1 b;

    public v1(w1 w1Var, t1 t1Var) {
        this.b = w1Var;
        this.a = t1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.a;
        t1Var.setLayerType(0, null);
        this.b.d.removeView(t1Var);
    }
}
