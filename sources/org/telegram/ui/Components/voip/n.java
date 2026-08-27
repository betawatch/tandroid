package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ n(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t tVar = this.b;
                tVar.T = floatValue;
                tVar.U.setAlpha(floatValue);
                tVar.a.invalidate();
                break;
            default:
                t tVar2 = this.b;
                o oVar = tVar2.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !tVar2.G0) {
                    tVar2.t0.setAlpha(1.0f);
                    tVar2.G0 = true;
                    oVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                tVar2.t0.setRotationY(f10);
                oVar.d.setRotationY(f10);
                break;
        }
    }
}
