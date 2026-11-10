package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ k8(l8 l8Var, int i7) {
        this.a = i7;
        this.b = l8Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l8.a(this.b, valueAnimator);
                break;
            default:
                l8 l8Var = this.b;
                l8Var.getClass();
                l8Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
