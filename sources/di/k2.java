package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ k2(j4 j4Var, int i7) {
        this.a = i7;
        this.b = j4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q2 q2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                j4Var.c3 = 0.0f;
                j4Var.a3.setAlpha(1.0f);
                j4Var.a3.setVisibility(8);
                j4Var.a3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                j4 j4Var2 = this.b;
                j4Var2.w2.e();
                j4Var2.q2 = j4Var2.X1;
                o2 o2Var = j4Var2.K1;
                if (o2Var != null && (runnable = o2Var.x) != null) {
                    runnable.run();
                    o2Var.x = null;
                }
                if (j4Var2.t1 && !j4Var2.e2) {
                    q9 q9Var = ((h9) j4Var2.z1).d;
                    if (q9Var.y) {
                        q9Var.y = false;
                        q9Var.V();
                    }
                }
                if (!j4Var2.e2 && (q2Var = j4Var2.M2) != null) {
                    q2Var.setVisibility(8);
                }
                j4Var2.E2 = true;
                j4Var2.invalidate();
                break;
        }
    }
}
