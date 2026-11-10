package di;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ x1(j4 j4Var, int i7) {
        this.a = i7;
        this.b = j4Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                j4Var.getClass();
                j4Var.q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4Var.invalidate();
                break;
            case 1:
                j4 j4Var2 = this.b;
                j4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4Var2.c3 = floatValue;
                j4Var2.a3.setTransitionProgress(floatValue);
                break;
            default:
                j4.X(this.b, valueAnimator);
                break;
        }
    }
}
