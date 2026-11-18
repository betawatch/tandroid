package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ vj(FrameLayout frameLayout, int i7, float f10, int i10) {
        this.a = i10;
        this.d = frameLayout;
        this.b = i7;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                kk kkVar = (kk) this.d;
                yj yjVar = kkVar.r;
                yj yjVar2 = kkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.b;
                float f10 = this.c;
                if (i7 != 1) {
                    yjVar2.setTranslationX(f10 * floatValue);
                    yjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    yjVar2.invalidate();
                    yjVar.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    yjVar.setScaleX(f11);
                    yjVar.setScaleY(f11);
                    yjVar2.invalidate();
                    break;
                } else {
                    yjVar.setTranslationX(f10 * floatValue);
                    yjVar.setAlpha(1.0f - floatValue);
                    yjVar.invalidate();
                    yjVar2.setAlpha(floatValue);
                    float f12 = (floatValue * 0.05f) + 0.95f;
                    yjVar2.setScaleX(f12);
                    yjVar2.setScaleY(f12);
                    break;
                }
            default:
                oa0 oa0Var = (oa0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((oa0Var.S * floatValue2) + (this.b * f13));
                oa0Var.U = i10;
                oa0Var.f((oa0Var.T * floatValue2) + (this.c * f13), i10);
                break;
        }
    }
}
