package bi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class w5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r7 b;

    public /* synthetic */ w5(r7 r7Var, int i10) {
        this.a = i10;
        this.b = r7Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r7 r7Var = this.b;
                r7Var.getClass();
                r7Var.p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                r7 r7Var2 = this.b;
                r7Var2.getClass();
                r7Var2.p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                r7 r7Var3 = this.b;
                r7Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var3.b2 = floatValue;
                r7Var3.Z1.setTransitionProgress(floatValue);
                break;
        }
    }
}
