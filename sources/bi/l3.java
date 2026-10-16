package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class l3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    public /* synthetic */ l3(q5 q5Var, int i10) {
        this.a = i10;
        this.b = q5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s3 s3Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                q5 q5Var = this.b;
                q5Var.t3 = 0.0f;
                q5Var.r3.setAlpha(1.0f);
                q5Var.r3.setVisibility(8);
                q5Var.r3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                q5 q5Var2 = this.b;
                q5Var2.N2.unlock();
                q5Var2.H2 = q5Var2.o2;
                q3 q3Var = q5Var2.b2;
                if (q3Var != null && (runnable = q3Var.w) != null) {
                    runnable.run();
                    q3Var.w = null;
                }
                if (q5Var2.K1 && !q5Var2.v2) {
                    sb sbVar = ((jb) q5Var2.Q1).d;
                    if (sbVar.x) {
                        sbVar.x = false;
                        sbVar.P();
                    }
                }
                if (!q5Var2.v2 && (s3Var = q5Var2.d3) != null) {
                    s3Var.setVisibility(8);
                }
                q5Var2.V2 = true;
                q5Var2.invalidate();
                break;
        }
    }
}
