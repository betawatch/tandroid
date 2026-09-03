package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi b;

    public /* synthetic */ ug(mi miVar, int i10) {
        this.a = i10;
        this.b = miVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.b2();
                break;
            case 1:
                this.b.A0.invalidate();
                break;
            case 2:
                mi.m(this.b, valueAnimator);
                break;
            case 3:
                mi miVar = this.b;
                miVar.getClass();
                miVar.K1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                this.b.b2();
                break;
        }
    }
}
