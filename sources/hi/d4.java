package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class d4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l5 b;

    public /* synthetic */ d4(l5 l5Var, int i7) {
        this.a = i7;
        this.b = l5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                l5 l5Var = this.b;
                l5Var.getClass();
                l5Var.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                l5 l5Var2 = this.b;
                l5Var2.getClass();
                l5Var2.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                l5 l5Var3 = this.b;
                l5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var3.L1 = floatValue;
                l5Var3.J1.setTransitionProgress(floatValue);
                break;
        }
    }
}
