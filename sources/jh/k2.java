package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class k2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ k2(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q2 q2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                e4 e4Var = this.b;
                e4Var.p3 = 0.0f;
                e4Var.n3.setAlpha(1.0f);
                e4Var.n3.setVisibility(8);
                e4Var.n3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                e4 e4Var2 = this.b;
                e4Var2.J2.unlock();
                e4Var2.D2 = e4Var2.k2;
                o2 o2Var = e4Var2.X1;
                if (o2Var != null && (runnable = o2Var.w) != null) {
                    runnable.run();
                    o2Var.w = null;
                }
                if (e4Var2.G1 && !e4Var2.r2) {
                    i9 i9Var = ((z8) e4Var2.M1).d;
                    if (i9Var.x) {
                        i9Var.x = false;
                        i9Var.P();
                    }
                }
                if (!e4Var2.r2 && (q2Var = e4Var2.Z2) != null) {
                    q2Var.setVisibility(8);
                }
                e4Var2.R2 = true;
                e4Var2.invalidate();
                break;
        }
    }
}
