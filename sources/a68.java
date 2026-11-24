// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a68 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d68 b;

    public /* synthetic */ a68(d68 d68Var, byte b) {
        this.a = b;
        this.b = d68Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        d68 d68Var = this.b;
        switch (b) {
            case 0:
                d68Var.w1 = null;
                break;
            default:
                d68Var.x1 = null;
                break;
        }
    }
}
