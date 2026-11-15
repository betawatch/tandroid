package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4 b;

    public /* synthetic */ g2(b4 b4Var, int i7) {
        this.a = i7;
        this.b = b4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        m2 m2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                b4 b4Var = this.b;
                b4Var.d3 = 0.0f;
                b4Var.b3.setAlpha(1.0f);
                b4Var.b3.setVisibility(8);
                b4Var.b3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                b4 b4Var2 = this.b;
                b4Var2.x2.e();
                b4Var2.r2 = b4Var2.Y1;
                k2 k2Var = b4Var2.L1;
                if (k2Var != null && (runnable = k2Var.x) != null) {
                    runnable.run();
                    k2Var.x = null;
                }
                if (b4Var2.u1 && !b4Var2.f2) {
                    i9 i9Var = ((z8) b4Var2.A1).d;
                    if (i9Var.y) {
                        i9Var.y = false;
                        i9Var.V();
                    }
                }
                if (!b4Var2.f2 && (m2Var = b4Var2.N2) != null) {
                    m2Var.setVisibility(8);
                }
                b4Var2.F2 = true;
                b4Var2.invalidate();
                break;
        }
    }
}
