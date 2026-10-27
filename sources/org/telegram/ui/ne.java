package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                wnVar.a9 = floatValue;
                om omVar = wnVar.j1;
                if (omVar != null) {
                    omVar.invalidate();
                    wnVar.x0.invalidate();
                    break;
                }
                break;
            case 1:
                wn wnVar2 = this.b;
                wnVar2.getClass();
                wnVar2.u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar2.Cc();
                break;
            case 2:
                wn wnVar3 = this.b;
                wnVar3.getClass();
                wnVar3.u3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar3.Cc();
                break;
            case 3:
                wn wnVar4 = this.b;
                wnVar4.getClass();
                wnVar4.Ua = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar4.A9();
                break;
            default:
                wn wnVar5 = this.b;
                wnVar5.getClass();
                wnVar5.Ua = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wnVar5.A9();
                break;
        }
    }
}
