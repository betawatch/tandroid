package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class c4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    public /* synthetic */ c4(k5 k5Var, int i7) {
        this.a = i7;
        this.b = k5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k5 k5Var = this.b;
                k5Var.getClass();
                k5Var.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                k5 k5Var2 = this.b;
                k5Var2.getClass();
                k5Var2.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                k5 k5Var3 = this.b;
                k5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var3.L1 = floatValue;
                k5Var3.J1.setTransitionProgress(floatValue);
                break;
        }
    }
}
