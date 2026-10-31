package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
