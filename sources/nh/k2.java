package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class k2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ k2(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q2 q2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                d4Var.q3 = 0.0f;
                d4Var.o3.setAlpha(1.0f);
                d4Var.o3.setVisibility(8);
                d4Var.o3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                d4 d4Var2 = this.b;
                d4Var2.K2.unlock();
                d4Var2.E2 = d4Var2.l2;
                o2 o2Var = d4Var2.Y1;
                if (o2Var != null && (runnable = o2Var.w) != null) {
                    runnable.run();
                    o2Var.w = null;
                }
                if (d4Var2.H1 && !d4Var2.s2) {
                    i9 i9Var = ((z8) d4Var2.N1).d;
                    if (i9Var.x) {
                        i9Var.x = false;
                        i9Var.P();
                    }
                }
                if (!d4Var2.s2 && (q2Var = d4Var2.a3) != null) {
                    q2Var.setVisibility(8);
                }
                d4Var2.S2 = true;
                d4Var2.invalidate();
                break;
        }
    }
}
