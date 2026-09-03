package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ch0 b;

    public /* synthetic */ zg0(ch0 ch0Var, int i10) {
        this.a = i10;
        this.b = ch0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                ch0 ch0Var = this.b;
                ch0Var.getClass();
                ch0Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch0Var.c(true);
                break;
            default:
                ch0 ch0Var2 = this.b;
                ch0Var2.getClass();
                ch0Var2.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch0Var2.c(true);
                break;
        }
    }
}
