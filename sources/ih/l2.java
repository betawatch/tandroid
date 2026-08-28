package ih;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ l2(i4 i4Var, int i9) {
        this.a = i9;
        this.b = i4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r2 r2Var;
        Runnable runnable;
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                i4Var.p3 = 0.0f;
                i4Var.n3.setAlpha(1.0f);
                i4Var.n3.setVisibility(8);
                i4Var.n3.n();
                break;
            default:
                super.onAnimationEnd(animator);
                i4 i4Var2 = this.b;
                i4Var2.J2.unlock();
                i4Var2.D2 = i4Var2.k2;
                p2 p2Var = i4Var2.X1;
                if (p2Var != null && (runnable = p2Var.w) != null) {
                    runnable.run();
                    p2Var.w = null;
                }
                if (i4Var2.G1 && !i4Var2.r2) {
                    m9 m9Var = ((d9) i4Var2.M1).d;
                    if (m9Var.x) {
                        m9Var.x = false;
                        m9Var.P();
                    }
                }
                if (!i4Var2.r2 && (r2Var = i4Var2.Z2) != null) {
                    r2Var.setVisibility(8);
                }
                i4Var2.R2 = true;
                i4Var2.invalidate();
                break;
        }
    }
}
