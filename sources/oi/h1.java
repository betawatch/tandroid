package oi;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ h1(z1 z1Var, int i7) {
        this.a = i7;
        this.b = z1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                z1 z1Var = this.b;
                z1Var.getClass();
                z1Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.k0();
                break;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1 z1Var2 = this.b;
                z1Var2.J = floatValue;
                z1Var2.A0();
                z1Var2.Q.setTranslationX(org.telegram.messenger.g0.W1(z1Var2.J, z1Var2.H[0] - z1Var2.I[0], 0));
                z1Var2.Q.setTranslationY(org.telegram.messenger.g0.W1(z1Var2.J, z1Var2.H[1] - z1Var2.I[1], 0));
                z1Var2.P.invalidate();
                break;
        }
    }
}
