// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class mv7 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xv7 b;

    public /* synthetic */ mv7(xv7 xv7Var, byte b) {
        this.a = b;
        this.b = xv7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                xv7Var.R1 = 0.0f;
                xv7Var.P1.setAlpha(1.0f);
                xv7Var.P1.setVisibility(8);
                xv7Var.P1.k();
                break;
            case 1:
                xv7Var.j2.setTranslationY(0.0f);
                break;
            default:
                xv7Var.m2 = false;
                xv7Var.j2.setTranslationY(0.0f);
                xv7Var.t0();
                break;
        }
    }
}
