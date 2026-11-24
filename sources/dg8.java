// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dg8 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kg8 b;

    public /* synthetic */ dg8(kg8 kg8Var, byte b) {
        this.a = b;
        this.b = kg8Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        kg8 kg8Var = this.b;
        switch (b) {
            case 0:
                kg8Var.S.setTranslationY(0.0f);
                break;
            case 1:
                kg8Var.S.setTranslationY(0.0f);
                break;
            default:
                kg8Var.S.setTranslationY(0.0f);
                kg8Var.n0();
                break;
        }
    }
}
