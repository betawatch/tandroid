package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ m(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r rVar = this.b;
                rVar.a0 = floatValue;
                rVar.b0.setAlpha(floatValue);
                rVar.a.invalidate();
                break;
            default:
                r rVar2 = this.b;
                n nVar = rVar2.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !rVar2.K0) {
                    rVar2.x0.setAlpha(1.0f);
                    rVar2.K0 = true;
                    nVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                rVar2.x0.setRotationY(f7);
                nVar.d.setRotationY(f7);
                break;
        }
    }
}
