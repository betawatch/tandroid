package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3 b;

    public /* synthetic */ a3(d3 d3Var, int i7) {
        this.a = i7;
        this.b = d3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                d3 d3Var = this.b;
                d3Var.getClass();
                d3Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.invalidate();
                break;
            case 1:
                d3 d3Var2 = this.b;
                d3Var2.getClass();
                d3Var2.x = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var2.invalidate();
                break;
            case 2:
                d3 d3Var3 = this.b;
                d3Var3.getClass();
                d3Var3.s = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var3.invalidate();
                break;
            default:
                d3 d3Var4 = this.b;
                d3Var4.getClass();
                d3Var4.r = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                d3Var4.invalidate();
                break;
        }
    }
}
