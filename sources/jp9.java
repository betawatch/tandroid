// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jp9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pp9 b;

    public /* synthetic */ jp9(pp9 pp9Var, byte b) {
        this.a = b;
        this.b = pp9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        pp9 pp9Var = this.b;
        switch (b) {
            case 0:
                pp9Var.Y = null;
                break;
            case 1:
                pp9Var.V = null;
                break;
            default:
                pp9Var.p0 = null;
                break;
        }
    }
}
