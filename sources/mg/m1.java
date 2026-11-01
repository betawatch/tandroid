package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m1 extends AnimatorListenerAdapter {
    public final /* synthetic */ j1 a;
    public final /* synthetic */ n1 b;

    public m1(n1 n1Var, j1 j1Var) {
        this.b = n1Var;
        this.a = j1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j1 j1Var = this.a;
        j1Var.setLayerType(0, null);
        this.b.d.removeView(j1Var);
    }
}
