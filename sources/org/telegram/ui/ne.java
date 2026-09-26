package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ ne(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wn wnVar = this.b;
                wnVar.K8 = floatValue;
                pm pmVar = wnVar.X0;
                if (pmVar != null) {
                    pmVar.invalidate();
                    wnVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                wn wnVar2 = this.b;
                wnVar2.getClass();
                wnVar2.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.lc();
                break;
            case 2:
                wn wnVar3 = this.b;
                wnVar3.getClass();
                wnVar3.i3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar3.lc();
                break;
            case 3:
                wn wnVar4 = this.b;
                wnVar4.getClass();
                wnVar4.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar4.o9();
                break;
            default:
                wn wnVar5 = this.b;
                wnVar5.getClass();
                wnVar5.Da = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar5.o9();
                break;
        }
    }
}
