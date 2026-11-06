package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ q3(t3 t3Var, int i7) {
        this.a = i7;
        this.b = t3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3 t3Var = this.b;
                t3Var.I = floatValue;
                t3Var.c.invalidate();
                t3Var.u();
                t3Var.r();
                break;
            case 1:
                t3 t3Var2 = this.b;
                t3Var2.getClass();
                t3Var2.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3Var2.A();
                t3Var2.u();
                t3Var2.r();
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t3 t3Var3 = this.b;
                t3Var3.y = floatValue2;
                if (!t3Var3.n) {
                    t3Var3.A();
                }
                t3Var3.u();
                t3Var3.r();
                break;
        }
    }
}
