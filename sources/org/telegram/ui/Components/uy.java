package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy b;

    public /* synthetic */ uy(zy zyVar, int i3) {
        this.a = i3;
        this.b = zyVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zy zyVar = this.b;
                zyVar.y = floatValue;
                zyVar.invalidate();
                break;
            default:
                zy zyVar2 = this.b;
                zyVar2.getClass();
                zyVar2.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zyVar2.invalidate();
                break;
        }
    }
}
