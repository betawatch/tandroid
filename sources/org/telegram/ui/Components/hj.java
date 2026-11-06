package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ hj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = i7;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                vj vjVar = (vj) this.d;
                kj kjVar = vjVar.r;
                kj kjVar2 = vjVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.b;
                float f10 = this.c;
                if (i7 != 1) {
                    kjVar2.setTranslationX(f10 * floatValue);
                    kjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    kjVar2.invalidate();
                    kjVar.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    kjVar.setScaleX(f11);
                    kjVar.setScaleY(f11);
                    kjVar2.invalidate();
                    break;
                } else {
                    kjVar.setTranslationX(f10 * floatValue);
                    kjVar.setAlpha(1.0f - floatValue);
                    kjVar.invalidate();
                    kjVar2.setAlpha(floatValue);
                    float f12 = (floatValue * 0.05f) + 0.95f;
                    kjVar2.setScaleX(f12);
                    kjVar2.setScaleY(f12);
                    break;
                }
            default:
                ca0 ca0Var = (ca0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((ca0Var.R * floatValue2) + (this.b * f13));
                ca0Var.T = i10;
                ca0Var.f((ca0Var.S * floatValue2) + (this.c * f13), i10);
                break;
        }
    }
}
