package oi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ j1(b2 b2Var, int i7) {
        this.a = i7;
        this.b = b2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                b2 b2Var = this.b;
                b2Var.getClass();
                b2Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.k0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2 b2Var2 = this.b;
                b2Var2.J = floatValue;
                b2Var2.A0();
                b2Var2.Q.setTranslationX(org.telegram.messenger.g0.W1(b2Var2.J, b2Var2.H[0] - b2Var2.I[0], 0));
                b2Var2.Q.setTranslationY(org.telegram.messenger.g0.W1(b2Var2.J, b2Var2.H[1] - b2Var2.I[1], 0));
                b2Var2.P.invalidate();
                break;
        }
    }
}
