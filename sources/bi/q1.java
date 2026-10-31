package bi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                k2Var.j0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2 k2Var2 = this.b;
                k2Var2.I = floatValue;
                k2Var2.z0();
                k2Var2.P.setTranslationX(org.telegram.messenger.i0.W1(k2Var2.I, k2Var2.G[0] - k2Var2.H[0], 0));
                k2Var2.P.setTranslationY(org.telegram.messenger.i0.W1(k2Var2.I, k2Var2.G[1] - k2Var2.H[1], 0));
                k2Var2.O.invalidate();
                break;
        }
    }
}
