package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ zj(FrameLayout frameLayout, int i10, float f7, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                nk nkVar = (nk) this.d;
                ck ckVar = nkVar.r;
                ck ckVar2 = nkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.b;
                float f7 = this.c;
                if (i10 != 1) {
                    ckVar2.setTranslationX(f7 * floatValue);
                    ckVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    ckVar2.invalidate();
                    ckVar.setAlpha(floatValue);
                    float f10 = (floatValue * 0.05f) + 0.95f;
                    ckVar.setScaleX(f10);
                    ckVar.setScaleY(f10);
                    ckVar2.invalidate();
                    break;
                } else {
                    ckVar.setTranslationX(f7 * floatValue);
                    ckVar.setAlpha(1.0f - floatValue);
                    ckVar.invalidate();
                    ckVar2.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    ckVar2.setScaleX(f11);
                    ckVar2.setScaleY(f11);
                    break;
                }
            default:
                hc0 hc0Var = (hc0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f12 = 1.0f - floatValue2;
                int i11 = (int) ((hc0Var.R * floatValue2) + (this.b * f12));
                hc0Var.T = i11;
                hc0Var.f((hc0Var.S * floatValue2) + (this.c * f12), i11);
                break;
        }
    }
}
