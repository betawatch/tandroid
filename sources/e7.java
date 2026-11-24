// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7 b;

    public /* synthetic */ e7(r7 r7Var, byte b) {
        this.a = b;
        this.b = r7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        r7 r7Var = this.b;
        switch (b) {
            case 0:
                r7Var.s.setVisibility(4);
                r7Var.w = null;
                break;
            default:
                r7Var.w = null;
                break;
        }
    }
}
