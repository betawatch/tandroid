package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class km implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pm b;

    public /* synthetic */ km(pm pmVar, int i10) {
        this.a = i10;
        this.b = pmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pm pmVar = this.b;
                pmVar.getClass();
                pmVar.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar.invalidate();
                break;
            default:
                pm pmVar2 = this.b;
                pmVar2.getClass();
                pmVar2.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmVar2.invalidate();
                break;
        }
    }
}
