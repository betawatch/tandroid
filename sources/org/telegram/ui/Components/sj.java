package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ sj(FrameLayout frameLayout, int i10, float f10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                hk hkVar = (hk) this.d;
                vj vjVar = hkVar.r;
                vj vjVar2 = hkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.b;
                float f10 = this.c;
                if (i10 != 1) {
                    vjVar2.setTranslationX(f10 * floatValue);
                    vjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    vjVar2.invalidate();
                    vjVar.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    vjVar.setScaleX(f11);
                    vjVar.setScaleY(f11);
                    vjVar2.invalidate();
                    break;
                } else {
                    vjVar.setTranslationX(f10 * floatValue);
                    vjVar.setAlpha(1.0f - floatValue);
                    vjVar.invalidate();
                    vjVar2.setAlpha(floatValue);
                    float f12 = (floatValue * 0.05f) + 0.95f;
                    vjVar2.setScaleX(f12);
                    vjVar2.setScaleY(f12);
                    break;
                }
            default:
                rb0 rb0Var = (rb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i11 = (int) ((rb0Var.O * floatValue2) + (this.b * f13));
                rb0Var.Q = i11;
                rb0Var.e((rb0Var.P * floatValue2) + (this.c * f13), i11);
                break;
        }
    }
}
