package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ j2(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p2 p2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                d4Var.p3 = 0.0f;
                d4Var.n3.setAlpha(1.0f);
                d4Var.n3.setVisibility(8);
                d4Var.n3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                d4 d4Var2 = this.b;
                d4Var2.J2.unlock();
                d4Var2.D2 = d4Var2.k2;
                n2 n2Var = d4Var2.X1;
                if (n2Var != null && (runnable = n2Var.w) != null) {
                    runnable.run();
                    n2Var.w = null;
                }
                if (d4Var2.G1 && !d4Var2.r2) {
                    i9 i9Var = ((z8) d4Var2.M1).d;
                    if (i9Var.x) {
                        i9Var.x = false;
                        i9Var.P();
                    }
                }
                if (!d4Var2.r2 && (p2Var = d4Var2.Z2) != null) {
                    p2Var.setVisibility(8);
                }
                d4Var2.R2 = true;
                d4Var2.invalidate();
                break;
        }
    }
}
