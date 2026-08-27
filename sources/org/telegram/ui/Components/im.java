package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class im implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ in b;

    public /* synthetic */ im(in inVar, int i10) {
        this.a = i10;
        this.b = inVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                in inVar = this.b;
                inVar.getClass();
                inVar.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                in inVar2 = this.b;
                inVar2.getClass();
                inVar2.A.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
