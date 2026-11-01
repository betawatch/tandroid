package bi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ q1(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                k2 k2Var = this.b;
                k2Var.getClass();
                k2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var.k0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2 k2Var2 = this.b;
                k2Var2.I = floatValue;
                k2Var2.A0();
                k2Var2.P.setTranslationX(org.telegram.messenger.i0.W1(k2Var2.I, k2Var2.G[0] - k2Var2.H[0], 0));
                k2Var2.P.setTranslationY(org.telegram.messenger.i0.W1(k2Var2.I, k2Var2.G[1] - k2Var2.H[1], 0));
                k2Var2.O.invalidate();
                break;
        }
    }
}
