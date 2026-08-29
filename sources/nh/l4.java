package nh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ l4(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                t5 t5Var = this.b;
                t5Var.getClass();
                t5Var.l2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                t5 t5Var2 = this.b;
                t5Var2.getClass();
                t5Var2.l2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                t5 t5Var3 = this.b;
                t5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var3.X1 = floatValue;
                t5Var3.V1.setTransitionProgress(floatValue);
                break;
        }
    }
}
