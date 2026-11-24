// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dz9 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fz9 b;

    public /* synthetic */ dz9(fz9 fz9Var, byte b) {
        this.a = b;
        this.b = fz9Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        fz9 fz9Var = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                fz9Var.J = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                fz9Var.J = null;
                break;
            default:
                super.onAnimationEnd(animator);
                fz9Var.O = 0.0f;
                fz9Var.J = null;
                fz9Var.N = false;
                fz9Var.d(true, false);
                break;
        }
    }
}
