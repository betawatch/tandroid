package kh;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ s4(g6 g6Var, int i9) {
        this.a = i9;
        this.b = g6Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g6 g6Var = this.b;
                g6Var.getClass();
                g6Var.l2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                g6 g6Var2 = this.b;
                g6Var2.getClass();
                g6Var2.l2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                g6 g6Var3 = this.b;
                g6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var3.X1 = floatValue;
                g6Var3.V1.setTransitionProgress(floatValue);
                break;
        }
    }
}
