package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class l9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n9 b;

    public /* synthetic */ l9(n9 n9Var, int i10) {
        this.a = i10;
        this.b = n9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                z9 z9Var = this.b.I0;
                z9Var.X = 0.0f;
                z9.k(z9Var);
                break;
            default:
                z9 z9Var2 = this.b.I0;
                z9Var2.W = 0.0f;
                z9Var2.Z = 0.0f;
                z9.k(z9Var2);
                break;
        }
    }
}
