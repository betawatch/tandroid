// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class je6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qh6 b;

    public /* synthetic */ je6(qh6 qh6Var, byte b) {
        this.a = b;
        this.b = qh6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qh6 qh6Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh6Var.c.setAlpha(floatValue);
                qh6Var.c.setTranslationY((1.0f - floatValue) * hl.L(230.0f));
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh6Var.c.setAlpha(floatValue2);
                qh6Var.c.setTranslationY((1.0f - floatValue2) * hl.L(230.0f));
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = (0.9f * floatValue3) + 0.1f;
                qh6Var.W.setScaleX(f);
                qh6Var.W.setScaleY(f);
                qh6Var.W.setAlpha(floatValue3);
                break;
        }
    }
}
