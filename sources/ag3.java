// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ag3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hg3 b;

    public /* synthetic */ ag3(hg3 hg3Var, byte b) {
        this.a = b;
        this.b = hg3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        hg3 hg3Var = this.b;
        switch (b) {
            case 0:
                hg3Var.W3 = 1.0f;
                hg3Var.Z3 = null;
                hg3Var.a4 = null;
                hg3Var.b4 = null;
                hg3Var.invalidate();
                break;
            case 1:
                hg3Var.X3 = 1.0f;
                hg3Var.invalidate();
                break;
            default:
                int i = (hg3Var.T2 ? 1 : 0) + (hg3Var.R2 ? 2 : 0) + (hg3Var.S2 ? 4 : 0);
                int i2 = hg3Var.w4;
                if (i2 != i) {
                    hg3Var.F(i2, i);
                } else {
                    hg3Var.A4 = false;
                    hg3Var.y4 = i2;
                }
                hg3Var.invalidate();
                break;
        }
    }
}
