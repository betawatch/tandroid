package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wz b;

    public /* synthetic */ pz(wz wzVar, int i10) {
        this.a = i10;
        this.b = wzVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz wzVar = this.b;
                wzVar.x = floatValue;
                wzVar.invalidate();
                break;
            default:
                wz wzVar2 = this.b;
                wzVar2.getClass();
                wzVar2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wzVar2.invalidate();
                break;
        }
    }
}
