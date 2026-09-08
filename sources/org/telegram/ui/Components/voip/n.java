package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                tVar.a0 = floatValue;
                tVar.b0.setAlpha(floatValue);
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
                if (z10 && !tVar2.K0) {
                    tVar2.x0.setAlpha(1.0f);
                    tVar2.K0 = true;
                    oVar.d.clearImage();
                }
                float f7 = floatValue2 * 180.0f;
                tVar2.x0.setRotationY(f7);
                oVar.d.setRotationY(f7);
                break;
        }
    }
}
