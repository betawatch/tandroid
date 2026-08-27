package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yl implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dm b;

    public /* synthetic */ yl(dm dmVar, int i10) {
        this.a = i10;
        this.b = dmVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                dm dmVar = this.b;
                dmVar.getClass();
                dmVar.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dmVar.invalidate();
                break;
            default:
                dm dmVar2 = this.b;
                dmVar2.getClass();
                dmVar2.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dmVar2.invalidate();
                break;
        }
    }
}
