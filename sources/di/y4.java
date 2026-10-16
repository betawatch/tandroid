package di;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o6 b;

    public /* synthetic */ y4(o6 o6Var, int i10) {
        this.a = i10;
        this.b = o6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                o6 o6Var = this.b;
                o6Var.getClass();
                o6Var.p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                o6 o6Var2 = this.b;
                o6Var2.getClass();
                o6Var2.p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                o6 o6Var3 = this.b;
                o6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var3.b2 = floatValue;
                o6Var3.Z1.setTransitionProgress(floatValue);
                break;
        }
    }
}
