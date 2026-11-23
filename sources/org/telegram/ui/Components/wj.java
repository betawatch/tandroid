package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ wj(FrameLayout frameLayout, int i7, float f10, int i10) {
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
                zj zjVar = kkVar.r;
                zj zjVar2 = kkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i7 = this.b;
                float f10 = this.c;
                if (i7 != 1) {
                    zjVar2.setTranslationX(f10 * floatValue);
                    zjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    zjVar2.invalidate();
                    zjVar.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    zjVar.setScaleX(f11);
                    zjVar.setScaleY(f11);
                    zjVar2.invalidate();
                    break;
                } else {
                    zjVar.setTranslationX(f10 * floatValue);
                    zjVar.setAlpha(1.0f - floatValue);
                    zjVar.invalidate();
                    zjVar2.setAlpha(floatValue);
                    float f12 = (floatValue * 0.05f) + 0.95f;
                    zjVar2.setScaleX(f12);
                    zjVar2.setScaleY(f12);
                    break;
                }
            default:
                na0 na0Var = (na0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i10 = (int) ((na0Var.S * floatValue2) + (this.b * f13));
                na0Var.U = i10;
                na0Var.f((na0Var.T * floatValue2) + (this.c * f13), i10);
                break;
        }
    }
}
