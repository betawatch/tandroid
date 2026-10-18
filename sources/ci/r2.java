package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class r2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ r2(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x2 x2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                q4 q4Var = this.b;
                q4Var.t3 = 0.0f;
                q4Var.r3.setAlpha(1.0f);
                q4Var.r3.setVisibility(8);
                q4Var.r3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                q4 q4Var2 = this.b;
                q4Var2.N2.unlock();
                q4Var2.H2 = q4Var2.o2;
                v2 v2Var = q4Var2.b2;
                if (v2Var != null && (runnable = v2Var.w) != null) {
                    runnable.run();
                    v2Var.w = null;
                }
                if (q4Var2.K1 && !q4Var2.v2) {
                    aa aaVar = ((r9) q4Var2.Q1).d;
                    if (aaVar.x) {
                        aaVar.x = false;
                        aaVar.P();
                    }
                }
                if (!q4Var2.v2 && (x2Var = q4Var2.d3) != null) {
                    x2Var.setVisibility(8);
                }
                q4Var2.V2 = true;
                q4Var2.invalidate();
                break;
        }
    }
}
