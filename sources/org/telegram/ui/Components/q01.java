package org.telegram.ui.Components;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q01 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r01 b;

    public /* synthetic */ q01(r01 r01Var, int i10) {
        this.a = i10;
        this.b = r01Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                r01 r01Var = this.b;
                r01Var.getClass();
                r01Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var.invalidate();
                break;
            case 1:
                r01 r01Var2 = this.b;
                r01Var2.getClass();
                r01Var2.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var2.invalidate();
                break;
            case 2:
                r01 r01Var3 = this.b;
                r01Var3.getClass();
                r01Var3.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var3.invalidate();
                break;
            case 3:
                r01 r01Var4 = this.b;
                r01Var4.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var4.s = floatValue;
                r01Var4.w = (int) ((r01Var4.h * floatValue) + 0);
                r01Var4.invalidate();
                break;
            default:
                r01 r01Var5 = this.b;
                r01Var5.getClass();
                r01Var5.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r01Var5.x = r01Var5.r + ((int) Math.ceil((r01Var5.n - r1) * r5));
                r01Var5.invalidate();
                break;
        }
    }
}
