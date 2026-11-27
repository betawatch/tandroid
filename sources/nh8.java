// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class nh8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wh8 b;

    public /* synthetic */ nh8(wh8 wh8Var, byte b) {
        this.a = b;
        this.b = wh8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wh8 wh8Var = this.b;
        switch (b) {
            case 0:
                wh8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                wh8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
