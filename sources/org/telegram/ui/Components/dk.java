package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class dk implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ dk(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                tk tkVar = (tk) this.d;
                ik ikVar = tkVar.r;
                ik ikVar2 = tkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.b;
                float f7 = this.c;
                if (i10 != 1) {
                    ikVar2.setTranslationX(f7 * floatValue);
                    ikVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    ikVar2.invalidate();
                    ikVar.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    ikVar.setScaleX(f10);
                    ikVar.setScaleY(f10);
                    ikVar2.invalidate();
                    break;
                } else {
                    ikVar.setTranslationX(f7 * floatValue);
                    ikVar.setAlpha(1.0f - floatValue);
                    ikVar.invalidate();
                    ikVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    ikVar2.setScaleX(f11);
                    ikVar2.setScaleY(f11);
                    break;
                }
            default:
                yb0 yb0Var = (yb0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((yb0Var.R * floatValue2) + (this.b * f12));
                yb0Var.T = i11;
                yb0Var.e((yb0Var.S * floatValue2) + (this.c * f12), i11);
                break;
        }
    }
}
