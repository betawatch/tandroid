package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ ek(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                sk skVar = (sk) this.d;
                hk hkVar = skVar.r;
                hk hkVar2 = skVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.b;
                float f7 = this.c;
                if (i10 != 1) {
                    hkVar2.setTranslationX(f7 * floatValue);
                    hkVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    hkVar2.invalidate();
                    hkVar.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    hkVar.setScaleX(f10);
                    hkVar.setScaleY(f10);
                    hkVar2.invalidate();
                    break;
                } else {
                    hkVar.setTranslationX(f7 * floatValue);
                    hkVar.setAlpha(1.0f - floatValue);
                    hkVar.invalidate();
                    hkVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    hkVar2.setScaleX(f11);
                    hkVar2.setScaleY(f11);
                    break;
                }
            default:
                pc0 pc0Var = (pc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((pc0Var.R * floatValue2) + (this.b * f12));
                pc0Var.T = i11;
                pc0Var.e((pc0Var.S * floatValue2) + (this.c * f12), i11);
                break;
        }
    }
}
