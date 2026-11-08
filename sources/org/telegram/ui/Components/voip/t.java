package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ t(y yVar, int i7) {
        this.a = i7;
        this.b = yVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z9;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y yVar = this.b;
                yVar.a0 = floatValue;
                yVar.b0.setAlpha(floatValue);
                yVar.a.invalidate();
                break;
            default:
                y yVar2 = this.b;
                u uVar = yVar2.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z9 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z9 = true;
                }
                if (z9 && !yVar2.K0) {
                    yVar2.x0.setAlpha(1.0f);
                    yVar2.K0 = true;
                    uVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                yVar2.x0.setRotationY(f10);
                uVar.d.setRotationY(f10);
                break;
        }
    }
}
