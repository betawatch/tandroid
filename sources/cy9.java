// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cy9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vz9 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ cy9(vz9 vz9Var, boolean z, byte b) {
        this.a = b;
        this.b = vz9Var;
        this.c = z;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        boolean z = this.c;
        vz9 vz9Var = this.b;
        switch (b) {
            case 0:
                ty9 ty9Var = vz9Var.i0;
                jy9 jy9Var = vz9Var.j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!z) {
                    floatValue = 1.0f - floatValue;
                }
                float f = 1.0f - floatValue;
                ty9Var.setAlpha(f);
                ty9Var.setTranslationY(gm.L(8.0f) * floatValue);
                jy9Var.setAlpha(floatValue);
                jy9Var.setTranslationY(gm.L(8.0f) * f);
                vz9Var.k0.setAlpha(jy9Var.getAlpha() * floatValue);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!z) {
                    floatValue2 = 1.0f - floatValue2;
                }
                vz9Var.k0.setAlpha(vz9Var.j0.getAlpha() * floatValue2);
                break;
        }
    }
}
