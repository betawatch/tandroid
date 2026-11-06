package fi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ h4(o5 o5Var, int i7) {
        this.a = i7;
        this.b = o5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                o5Var.getClass();
                o5Var.Y1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                o5 o5Var2 = this.b;
                o5Var2.getClass();
                o5Var2.Y1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                o5 o5Var3 = this.b;
                o5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var3.K1 = floatValue;
                o5Var3.I1.setTransitionProgress(floatValue);
                break;
        }
    }
}
