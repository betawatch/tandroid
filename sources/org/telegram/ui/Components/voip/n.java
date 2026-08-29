package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
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
                uVar.T = floatValue;
                uVar.U.setAlpha(floatValue);
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
                if (z10 && !uVar2.G0) {
                    uVar2.t0.setAlpha(1.0f);
                    uVar2.G0 = true;
                    pVar.d.clearImage();
                }
                float f9 = floatValue2 * 180.0f;
                uVar2.t0.setRotationY(f9);
                pVar.d.setRotationY(f9);
                break;
        }
    }
}
