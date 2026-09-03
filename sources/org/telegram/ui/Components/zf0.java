package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bg0 b;

    public /* synthetic */ zf0(bg0 bg0Var, int i10) {
        this.a = i10;
        this.b = bg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                bg0 bg0Var = this.b;
                bg0Var.getClass();
                bg0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg0Var.invalidate();
                break;
            default:
                bg0 bg0Var2 = this.b;
                bg0Var2.getClass();
                bg0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg0Var2.invalidate();
                break;
        }
    }
}
