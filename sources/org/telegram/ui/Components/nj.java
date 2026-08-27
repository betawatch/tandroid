package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ nj(FrameLayout frameLayout, int i10, float f10, int i11) {
        this.a = i11;
        this.d = frameLayout;
        this.b = i10;
        this.c = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bk bkVar = (bk) this.d;
                qj qjVar = bkVar.r;
                qj qjVar2 = bkVar.s;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i10 = this.b;
                float f10 = this.c;
                if (i10 != 1) {
                    qjVar2.setTranslationX(f10 * floatValue);
                    qjVar2.setAlpha(Math.max(0.0f, 1.0f - floatValue));
                    qjVar2.invalidate();
                    qjVar.setAlpha(floatValue);
                    float f11 = (floatValue * 0.05f) + 0.95f;
                    qjVar.setScaleX(f11);
                    qjVar.setScaleY(f11);
                    qjVar2.invalidate();
                    break;
                } else {
                    qjVar.setTranslationX(f10 * floatValue);
                    qjVar.setAlpha(1.0f - floatValue);
                    qjVar.invalidate();
                    qjVar2.setAlpha(floatValue);
                    float f12 = (floatValue * 0.05f) + 0.95f;
                    qjVar2.setScaleX(f12);
                    qjVar2.setScaleY(f12);
                    break;
                }
            default:
                ab0 ab0Var = (ab0) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f13 = 1.0f - floatValue2;
                int i11 = (int) ((ab0Var.N * floatValue2) + (this.b * f13));
                ab0Var.P = i11;
                ab0Var.e((ab0Var.O * floatValue2) + (this.c * f13), i11);
                break;
        }
    }
}
