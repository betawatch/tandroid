package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class v3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ v3(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        c4 c4Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                e6 e6Var = this.b;
                e6Var.t3 = 0.0f;
                e6Var.r3.setAlpha(1.0f);
                e6Var.r3.setVisibility(8);
                e6Var.r3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                e6 e6Var2 = this.b;
                e6Var2.N2.unlock();
                e6Var2.H2 = e6Var2.o2;
                a4 a4Var = e6Var2.b2;
                if (a4Var != null && (runnable = a4Var.w) != null) {
                    runnable.run();
                    a4Var.w = null;
                }
                if (e6Var2.K1 && !e6Var2.v2) {
                    jc jcVar = ((ac) e6Var2.Q1).d;
                    if (jcVar.x) {
                        jcVar.x = false;
                        jcVar.P();
                    }
                }
                if (!e6Var2.v2 && (c4Var = e6Var2.d3) != null) {
                    c4Var.setVisibility(8);
                }
                e6Var2.V2 = true;
                e6Var2.invalidate();
                break;
        }
    }
}
