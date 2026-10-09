package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ w3(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d4 d4Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                f6Var.t3 = 0.0f;
                f6Var.r3.setAlpha(1.0f);
                f6Var.r3.setVisibility(8);
                f6Var.r3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                f6 f6Var2 = this.b;
                f6Var2.N2.unlock();
                f6Var2.H2 = f6Var2.o2;
                b4 b4Var = f6Var2.b2;
                if (b4Var != null && (runnable = b4Var.w) != null) {
                    runnable.run();
                    b4Var.w = null;
                }
                if (f6Var2.K1 && !f6Var2.v2) {
                    kc kcVar = ((bc) f6Var2.Q1).d;
                    if (kcVar.x) {
                        kcVar.x = false;
                        kcVar.P();
                    }
                }
                if (!f6Var2.v2 && (d4Var = f6Var2.d3) != null) {
                    d4Var.setVisibility(8);
                }
                f6Var2.V2 = true;
                f6Var2.invalidate();
                break;
        }
    }
}
