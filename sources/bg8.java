// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bg8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kg8 b;

    public /* synthetic */ bg8(kg8 kg8Var, byte b) {
        this.a = b;
        this.b = kg8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kg8 kg8Var = this.b;
        switch (b) {
            case 0:
                kg8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                kg8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
