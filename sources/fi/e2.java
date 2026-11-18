package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class e2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ e2(z3 z3Var, int i7) {
        this.a = i7;
        this.b = z3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        k2 k2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                z3 z3Var = this.b;
                z3Var.d3 = 0.0f;
                z3Var.b3.setAlpha(1.0f);
                z3Var.b3.setVisibility(8);
                z3Var.b3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                z3 z3Var2 = this.b;
                z3Var2.x2.e();
                z3Var2.r2 = z3Var2.Y1;
                i2 i2Var = z3Var2.L1;
                if (i2Var != null && (runnable = i2Var.x) != null) {
                    runnable.run();
                    i2Var.x = null;
                }
                if (z3Var2.u1 && !z3Var2.f2) {
                    f9 f9Var = ((w8) z3Var2.A1).d;
                    if (f9Var.y) {
                        f9Var.y = false;
                        f9Var.V();
                    }
                }
                if (!z3Var2.f2 && (k2Var = z3Var2.N2) != null) {
                    k2Var.setVisibility(8);
                }
                z3Var2.F2 = true;
                z3Var2.invalidate();
                break;
        }
    }
}
