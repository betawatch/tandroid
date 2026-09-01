package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        boolean z4;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u uVar = this.b;
                uVar.U = floatValue;
                uVar.V.setAlpha(floatValue);
                uVar.a.invalidate();
                break;
            default:
                u uVar2 = this.b;
                p pVar = uVar2.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z4 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z4 = true;
                }
                if (z4 && !uVar2.H0) {
                    uVar2.u0.setAlpha(1.0f);
                    uVar2.H0 = true;
                    pVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                uVar2.u0.setRotationY(f10);
                pVar.d.setRotationY(f10);
                break;
        }
    }
}
