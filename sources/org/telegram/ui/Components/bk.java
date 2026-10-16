package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ bk(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                pk pkVar = (pk) this.d;
                ek ekVar = pkVar.r;
                ek ekVar2 = pkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.b;
                float f7 = this.c;
                if (i10 != 1) {
                    ekVar2.setTranslationX(f7 * floatValue);
                    ekVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    ekVar2.invalidate();
                    ekVar.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    ekVar.setScaleX(f10);
                    ekVar.setScaleY(f10);
                    ekVar2.invalidate();
                    break;
                } else {
                    ekVar.setTranslationX(f7 * floatValue);
                    ekVar.setAlpha(1.0f - floatValue);
                    ekVar.invalidate();
                    ekVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    ekVar2.setScaleX(f11);
                    ekVar2.setScaleY(f11);
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
