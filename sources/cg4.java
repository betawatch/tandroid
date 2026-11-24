// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cg4 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ig4 b;

    public /* synthetic */ cg4(ig4 ig4Var, byte b) {
        this.a = b;
        this.b = ig4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ig4 ig4Var = this.b;
        switch (b) {
            case 0:
                if (ig4Var.C0 == animator) {
                    ig4Var.C0 = null;
                    break;
                }
                break;
            default:
                ig4Var.V = ig4Var.d0;
                ig4Var.c0 = ig4Var.g0;
                ig4Var.W = ig4Var.e0;
                ig4Var.a0 = ig4Var.f0;
                ig4Var.d0 = -1;
                ig4Var.e0 = -1;
                ig4Var.f0 = -1;
                ig4Var.g0 = -1;
                break;
        }
    }
}
