package di;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ x1(i4 i4Var, int i7) {
        this.a = i7;
        this.b = i4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                i4Var.getClass();
                i4Var.q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                break;
            case 1:
                i4 i4Var2 = this.b;
                i4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var2.c3 = floatValue;
                i4Var2.a3.setTransitionProgress(floatValue);
                break;
            default:
                i4.X(this.b, valueAnimator);
                break;
        }
    }
}
