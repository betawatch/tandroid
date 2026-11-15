package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ t(z zVar, int i7) {
        this.a = i7;
        this.b = zVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z10;
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z zVar = this.b;
                zVar.b0 = floatValue;
                zVar.c0.setAlpha(floatValue);
                zVar.a.invalidate();
                break;
            default:
                z zVar2 = this.b;
                v vVar = zVar2.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z10 = false;
                } else {
                    floatValue2 -= 1.0f;
                    z10 = true;
                }
                if (z10 && !zVar2.L0) {
                    zVar2.y0.setAlpha(1.0f);
                    zVar2.L0 = true;
                    vVar.d.clearImage();
                }
                float f10 = floatValue2 * 180.0f;
                zVar2.y0.setRotationY(f10);
                vVar.d.setRotationY(f10);
                break;
        }
    }
}
