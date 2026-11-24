// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lv7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v29 b;

    public /* synthetic */ lv7(v29 v29Var, byte b) {
        this.a = b;
        this.b = v29Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        v29 v29Var = this.b;
        switch (b) {
            case 0:
                gm.B2(v29Var);
                break;
            case 1:
                super.onAnimationEnd(animator);
                v29Var.M0.e();
                break;
            default:
                super.onAnimationEnd(animator);
                v29Var.R = null;
                v29Var.o0 = 0.0f;
                v29Var.m0 = null;
                v29Var.invalidate();
                break;
        }
    }
}
