package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ m(r rVar, int i3) {
        this.a = i3;
        this.b = rVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r rVar = this.b;
                rVar.b0 = floatValue;
                rVar.c0.setAlpha(floatValue);
                rVar.a.invalidate();
                break;
            default:
                r rVar2 = this.b;
                n nVar = rVar2.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !rVar2.L0) {
                    rVar2.y0.setAlpha(1.0f);
                    rVar2.L0 = true;
                    nVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                rVar2.y0.setRotationY(f10);
                nVar.d.setRotationY(f10);
                break;
        }
    }
}
