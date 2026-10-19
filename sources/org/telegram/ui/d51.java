package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class d51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g51 b;

    public /* synthetic */ d51(g51 g51Var, int i10) {
        this.a = i10;
        this.b = g51Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g51 g51Var = this.b;
                g51Var.N = floatValue;
                g51Var.V.h0.invalidate();
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g51 g51Var2 = this.b;
                g51Var2.N = floatValue2;
                g51Var2.V.h0.invalidate();
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g51 g51Var3 = this.b;
                g51Var3.N = floatValue3;
                g51Var3.V.h0.invalidate();
                break;
        }
    }
}
