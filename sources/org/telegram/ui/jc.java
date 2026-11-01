package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ org.telegram.messenger.vs c;

    public /* synthetic */ jc(org.telegram.messenger.vs vsVar, int i10) {
        this.a = i10;
        this.c = vsVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                zc zcVar = (zc) this.c;
                zcVar.n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zcVar.m0.invalidate();
                if (!this.b && zcVar.n0 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 1:
                rn0 rn0Var = (rn0) this.c;
                rn0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rn0Var.X.invalidate();
                if (!this.b && rn0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                k91 k91Var = (k91) this.c;
                k91Var.j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k91Var.i2.invalidate();
                if (!this.b && k91Var.j2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            default:
                vh.o8 o8Var = (vh.o8) this.c;
                o8Var.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh.y7 y7Var = o8Var.C2;
                if (y7Var != null) {
                    y7Var.invalidate();
                }
                if (!this.b && o8Var.D2 > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
        }
    }
}
