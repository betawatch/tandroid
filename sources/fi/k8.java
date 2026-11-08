package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
