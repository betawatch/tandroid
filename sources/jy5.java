// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jy5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ry5 b;

    public /* synthetic */ jy5(ry5 ry5Var, byte b) {
        this.a = b;
        this.b = ry5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ry5 ry5Var = this.b;
        switch (b) {
            case 0:
                ry5Var.Z1.setTranslationY(0.0f);
                break;
            default:
                ry5Var.c2 = false;
                ry5Var.Z1.setTranslationY(0.0f);
                ry5Var.j0();
                break;
        }
    }
}
