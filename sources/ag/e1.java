package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ e1(f1 f1Var, int i10) {
        this.a = i10;
        this.b = f1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                f1Var.K = null;
                f1Var.f.f(new a4.g(this, 1));
                break;
            default:
                this.b.f.f(new a4.g(this, 2));
                break;
        }
    }
}
