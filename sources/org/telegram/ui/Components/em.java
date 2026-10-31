package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class em implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ im b;

    public /* synthetic */ em(im imVar, int i10) {
        this.a = i10;
        this.b = imVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                im imVar = this.b;
                imVar.getClass();
                imVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imVar.invalidate();
                break;
            default:
                im imVar2 = this.b;
                imVar2.getClass();
                imVar2.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                imVar2.invalidate();
                break;
        }
    }
}
