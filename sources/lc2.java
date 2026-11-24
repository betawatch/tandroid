// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lc2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rc2 b;

    public /* synthetic */ lc2(rc2 rc2Var, byte b) {
        this.a = b;
        this.b = rc2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rc2 rc2Var = this.b;
        switch (b) {
            case 0:
                rc2Var.Q5.O0 = true;
                rc2Var.invalidate();
                break;
            default:
                rc2Var.setSelectedBackgroundProgress(0.0f);
                break;
        }
    }
}
