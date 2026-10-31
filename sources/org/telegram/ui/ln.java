package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ln implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mn b;

    public /* synthetic */ ln(mn mnVar, int i10) {
        this.a = i10;
        this.b = mnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar = this.b;
                mnVar.a = floatValue;
                View view = mnVar.b.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar2 = this.b;
                mnVar2.a = floatValue2;
                View view2 = mnVar2.b.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn mnVar3 = this.b;
                mnVar3.a = floatValue3;
                View view3 = mnVar3.b.fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    break;
                }
                break;
        }
    }
}
