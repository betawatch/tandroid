package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ w1(a3 a3Var, int i7) {
        this.a = i7;
        this.b = a3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                a3 a3Var = this.b;
                a3Var.getClass();
                a3Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a3Var.l();
                break;
            default:
                this.b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
