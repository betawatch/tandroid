package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l51 b;

    public /* synthetic */ i51(l51 l51Var, int i10) {
        this.a = i10;
        this.b = l51Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l51 l51Var = this.b;
                l51Var.N = floatValue;
                l51Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l51 l51Var2 = this.b;
                l51Var2.N = floatValue2;
                l51Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l51 l51Var3 = this.b;
                l51Var3.N = floatValue3;
                l51Var3.V.h0.invalidate();
                break;
        }
    }
}
