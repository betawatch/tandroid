package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fg0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hg0 b;

    public /* synthetic */ fg0(hg0 hg0Var, int i10) {
        this.a = i10;
        this.b = hg0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                hg0 hg0Var = this.b;
                hg0Var.getClass();
                hg0Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var.invalidate();
                break;
            default:
                hg0 hg0Var2 = this.b;
                hg0Var2.getClass();
                hg0Var2.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg0Var2.invalidate();
                break;
        }
    }
}
