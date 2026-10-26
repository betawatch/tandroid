package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ n60 b;

    public /* synthetic */ i60(n60 n60Var, int i10) {
        this.a = i10;
        this.b = n60Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n60 n60Var = this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * n60Var.getMeasuredHeight() * 0.5f;
                n60Var.w0 = floatValue;
                n60Var.v.setTranslationY(floatValue + n60Var.v0);
                break;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n60 n60Var2 = this.b;
                n60Var2.y0 = floatValue2;
                vi.s0 s0Var = n60Var2.P;
                if (s0Var != null) {
                    s0Var.w(floatValue2);
                    break;
                }
                break;
        }
    }
}
