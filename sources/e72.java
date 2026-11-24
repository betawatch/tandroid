// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e72 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v72 b;

    public /* synthetic */ e72(v72 v72Var, byte b) {
        this.a = b;
        this.b = v72Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        v72 v72Var = this.b;
        switch (b) {
            case 0:
                v72Var.F.setTranslationY(0.0f);
                break;
            case 1:
                v72Var.F.setTranslationY(0.0f);
                break;
            default:
                v72Var.g1 = false;
                v72Var.F.setTranslationY(0.0f);
                v72Var.a0();
                break;
        }
    }
}
