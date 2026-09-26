package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ n(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u uVar = this.b;
                uVar.a0 = floatValue;
                uVar.b0.setAlpha(floatValue);
                uVar.a.invalidate();
                break;
            default:
                u uVar2 = this.b;
                p pVar = uVar2.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !uVar2.K0) {
                    uVar2.x0.setAlpha(1.0f);
                    uVar2.K0 = true;
                    pVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                uVar2.x0.setRotationY(f7);
                pVar.d.setRotationY(f7);
                break;
        }
    }
}
