package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class l51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ l51(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                n51 n51Var = (n51) this.b;
                n51Var.getClass();
                n51Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n51Var.invalidate();
                break;
            case 1:
                c71 c71Var = (c71) this.b;
                c71Var.getClass();
                c71Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c71Var.invalidate();
                break;
            case 2:
                i71 i71Var = (i71) this.b;
                i71Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i71Var.b = floatValue;
                i71Var.setTranslationY(floatValue);
                break;
            default:
                c91 c91Var = (c91) this.b;
                c91Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c91Var.setAnimationIdicatorProgress(floatValue2);
                b91 b91Var = c91Var.y;
                if (b91Var != null) {
                    ((l2.f) b91Var).I(floatValue2);
                    break;
                }
                break;
        }
    }
}
