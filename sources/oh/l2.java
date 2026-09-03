package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class l2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    public /* synthetic */ l2(f4 f4Var, int i10) {
        this.a = i10;
        this.b = f4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r2 r2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                f4 f4Var = this.b;
                f4Var.q3 = 0.0f;
                f4Var.o3.setAlpha(1.0f);
                f4Var.o3.setVisibility(8);
                f4Var.o3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                f4 f4Var2 = this.b;
                f4Var2.K2.unlock();
                f4Var2.E2 = f4Var2.l2;
                p2 p2Var = f4Var2.Y1;
                if (p2Var != null && (runnable = p2Var.w) != null) {
                    runnable.run();
                    p2Var.w = null;
                }
                if (f4Var2.H1 && !f4Var2.s2) {
                    i9 i9Var = ((z8) f4Var2.N1).d;
                    if (i9Var.x) {
                        i9Var.x = false;
                        i9Var.P();
                    }
                }
                if (!f4Var2.s2 && (r2Var = f4Var2.a3) != null) {
                    r2Var.setVisibility(8);
                }
                f4Var2.S2 = true;
                f4Var2.invalidate();
                break;
        }
    }
}
