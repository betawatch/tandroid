package li;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                b2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.k0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2 b2Var2 = this.b;
                b2Var2.I = floatValue;
                b2Var2.A0();
                b2Var2.P.setTranslationX(org.telegram.messenger.g0.W1(b2Var2.I, b2Var2.G[0] - b2Var2.H[0], 0));
                b2Var2.P.setTranslationY(org.telegram.messenger.g0.W1(b2Var2.I, b2Var2.G[1] - b2Var2.H[1], 0));
                b2Var2.O.invalidate();
                break;
        }
    }
}
