package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class q2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4 b;

    public /* synthetic */ q2(p4 p4Var, int i10) {
        this.a = i10;
        this.b = p4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w2 w2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                p4 p4Var = this.b;
                p4Var.t3 = 0.0f;
                p4Var.r3.setAlpha(1.0f);
                p4Var.r3.setVisibility(8);
                p4Var.r3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                p4 p4Var2 = this.b;
                p4Var2.N2.unlock();
                p4Var2.H2 = p4Var2.o2;
                u2 u2Var = p4Var2.b2;
                if (u2Var != null && (runnable = u2Var.w) != null) {
                    runnable.run();
                    u2Var.w = null;
                }
                if (p4Var2.K1 && !p4Var2.v2) {
                    z9 z9Var = ((q9) p4Var2.Q1).d;
                    if (z9Var.x) {
                        z9Var.x = false;
                        z9Var.P();
                    }
                }
                if (!p4Var2.v2 && (w2Var = p4Var2.d3) != null) {
                    w2Var.setVisibility(8);
                }
                p4Var2.V2 = true;
                p4Var2.invalidate();
                break;
        }
    }
}
