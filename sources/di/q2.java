package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class q2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ q2(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w2 w2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                q4 q4Var = this.b;
                q4Var.i3 = 0.0f;
                q4Var.g3.setAlpha(1.0f);
                q4Var.g3.setVisibility(8);
                q4Var.g3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                q4 q4Var2 = this.b;
                q4Var2.C2.unlock();
                q4Var2.w2 = q4Var2.d2;
                u2 u2Var = q4Var2.Q1;
                if (u2Var != null && (runnable = u2Var.w) != null) {
                    runnable.run();
                    u2Var.w = null;
                }
                if (q4Var2.z1 && !q4Var2.k2) {
                    y9 y9Var = ((p9) q4Var2.F1).d;
                    if (y9Var.x) {
                        y9Var.x = false;
                        y9Var.Q();
                    }
                }
                if (!q4Var2.k2 && (w2Var = q4Var2.S2) != null) {
                    w2Var.setVisibility(8);
                }
                q4Var2.K2 = true;
                q4Var2.invalidate();
                break;
        }
    }
}
