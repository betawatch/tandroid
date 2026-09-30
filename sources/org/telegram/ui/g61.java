package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j61 b;

    public /* synthetic */ g61(j61 j61Var, int i10) {
        this.a = i10;
        this.b = j61Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j61 j61Var = this.b;
                j61Var.N = floatValue;
                j61Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j61 j61Var2 = this.b;
                j61Var2.N = floatValue2;
                j61Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j61 j61Var3 = this.b;
                j61Var3.N = floatValue3;
                j61Var3.V.h0.invalidate();
                break;
        }
    }
}
