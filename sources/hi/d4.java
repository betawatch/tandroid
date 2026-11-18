package hi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
