// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gt5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ht5 b;

    public /* synthetic */ gt5(ht5 ht5Var, byte b) {
        this.a = b;
        this.b = ht5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ht5 ht5Var = this.b;
        switch (b) {
            case 0:
                ht5Var.e.X1 = null;
                ht5Var.requestLayout();
                break;
            default:
                ht5Var.e.X1 = null;
                ht5Var.a = false;
                break;
        }
    }
}
