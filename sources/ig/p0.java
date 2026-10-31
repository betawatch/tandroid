package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ p0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                q0 q0Var = this.b;
                q0Var.K = null;
                q0Var.f.f(new gg.c(this, 6));
                break;
            default:
                this.b.f.f(new gg.c(this, 7));
                break;
        }
    }
}
