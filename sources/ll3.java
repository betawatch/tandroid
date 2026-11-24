// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ll3 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ml3 b;

    public /* synthetic */ ll3(ml3 ml3Var, byte b) {
        this.a = b;
        this.b = ml3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ml3 ml3Var = this.b;
        switch (b) {
            case 0:
                Runnable runnable = ml3Var.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (animator == ml3Var.e) {
                    ml3Var.e = null;
                    break;
                }
                break;
            default:
                Runnable runnable2 = ml3Var.b;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (animator == ml3Var.e) {
                    ml3Var.e = null;
                    break;
                }
                break;
        }
    }
}
