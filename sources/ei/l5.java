package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class l5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ l5(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                f6Var.b2 = 0.0f;
                f6Var.Z1.setAlpha(1.0f);
                f6Var.Z1.setVisibility(8);
                f6Var.Z1.n();
                break;
            case 1:
                this.b.p2.setTranslationY(0.0f);
                break;
            default:
                f6 f6Var2 = this.b;
                f6Var2.s2 = false;
                f6Var2.p2.setTranslationY(0.0f);
                f6Var2.u0();
                break;
        }
    }
}
