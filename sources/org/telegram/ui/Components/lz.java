package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class lz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;

    public /* synthetic */ lz(rz rzVar, int i10) {
        this.a = i10;
        this.b = rzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rz rzVar = this.b;
                rzVar.y = floatValue;
                rzVar.invalidate();
                break;
            default:
                rz rzVar2 = this.b;
                rzVar2.getClass();
                rzVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rzVar2.invalidate();
                break;
        }
    }
}
