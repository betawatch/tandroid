package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ n(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z4;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t tVar = this.b;
                tVar.U = floatValue;
                tVar.V.setAlpha(floatValue);
                tVar.a.invalidate();
                break;
            default:
                t tVar2 = this.b;
                o oVar = tVar2.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z4 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z4 = true;
                }
                if (z4 && !tVar2.H0) {
                    tVar2.u0.setAlpha(1.0f);
                    tVar2.H0 = true;
                    oVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                tVar2.u0.setRotationY(f10);
                oVar.d.setRotationY(f10);
                break;
        }
    }
}
