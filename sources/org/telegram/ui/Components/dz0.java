package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez0 b;

    public /* synthetic */ dz0(ez0 ez0Var, int i7) {
        this.a = i7;
        this.b = ez0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ez0 ez0Var = this.b;
                ez0Var.getClass();
                ez0Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var.invalidate();
                break;
            case 1:
                ez0 ez0Var2 = this.b;
                ez0Var2.getClass();
                ez0Var2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var2.invalidate();
                break;
            case 2:
                ez0 ez0Var3 = this.b;
                ez0Var3.getClass();
                ez0Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var3.invalidate();
                break;
            case 3:
                ez0 ez0Var4 = this.b;
                ez0Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var4.s = floatValue;
                ez0Var4.x = (int) ((ez0Var4.h * floatValue) + 0);
                ez0Var4.invalidate();
                break;
            default:
                ez0 ez0Var5 = this.b;
                ez0Var5.getClass();
                ez0Var5.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ez0Var5.y = ez0Var5.r + ((int) Math.ceil((ez0Var5.n - r1) * r5));
                ez0Var5.invalidate();
                break;
        }
    }
}
