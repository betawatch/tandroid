package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ xj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = i7;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                mk mkVar = (mk) this.d;
                ak akVar = mkVar.r;
                ak akVar2 = mkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.b;
                float f10 = this.c;
                if (i7 != 1) {
                    akVar2.setTranslationX(f10 * floatValue);
                    akVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    akVar2.invalidate();
                    akVar.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    akVar.setScaleX(f11);
                    akVar.setScaleY(f11);
                    akVar2.invalidate();
                    break;
                } else {
                    akVar.setTranslationX(f10 * floatValue);
                    akVar.setAlpha(1.0f - floatValue);
                    akVar.invalidate();
                    akVar2.setAlpha(floatValue);
                    float f12 = (floatValue * 0.05f) + 0.95f;
                    akVar2.setScaleX(f12);
                    akVar2.setScaleY(f12);
                    break;
                }
            default:
                qa0 qa0Var = (qa0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((qa0Var.S * floatValue2) + (this.b * f13));
                qa0Var.U = i10;
                qa0Var.f((qa0Var.T * floatValue2) + (this.c * f13), i10);
                break;
        }
    }
}
