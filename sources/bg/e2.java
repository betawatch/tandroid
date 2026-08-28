package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e2 extends AnimatorListenerAdapter {
    public final /* synthetic */ a2 a;
    public final /* synthetic */ f2 b;

    public e2(f2 f2Var, a2 a2Var) {
        this.b = f2Var;
        this.a = a2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a2 a2Var = this.a;
        a2Var.setLayerType(0, null);
        this.b.d.removeView(a2Var);
    }
}
