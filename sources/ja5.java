// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ja5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oa5 b;

    public /* synthetic */ ja5(oa5 oa5Var, byte b) {
        this.a = b;
        this.b = oa5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        oa5 oa5Var = this.b;
        switch (b) {
            case 0:
                oa5Var.b.setVisibility(8);
                oa5Var.F = false;
                oa5Var.G = 0.0f;
                break;
            default:
                oa5Var.e.setVisibility(8);
                break;
        }
    }
}
