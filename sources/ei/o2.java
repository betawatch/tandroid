package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ o2(j4 j4Var, int i3) {
        this.a = i3;
        this.b = j4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u2 u2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                j4Var.d3 = 0.0f;
                j4Var.b3.setAlpha(1.0f);
                j4Var.b3.setVisibility(8);
                j4Var.b3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                j4 j4Var2 = this.b;
                j4Var2.x2.e();
                j4Var2.r2 = j4Var2.Y1;
                s2 s2Var = j4Var2.L1;
                if (s2Var != null && (runnable = s2Var.x) != null) {
                    runnable.run();
                    s2Var.x = null;
                }
                if (j4Var2.u1 && !j4Var2.f2) {
                    r9 r9Var = ((i9) j4Var2.A1).d;
                    if (r9Var.y) {
                        r9Var.y = false;
                        r9Var.d0();
                    }
                }
                if (!j4Var2.f2 && (u2Var = j4Var2.N2) != null) {
                    u2Var.setVisibility(8);
                }
                j4Var2.F2 = true;
                j4Var2.invalidate();
                break;
        }
    }
}
