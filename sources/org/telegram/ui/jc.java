package org.telegram.ui;

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ org.telegram.messenger.us c;

    public /* synthetic */ jc(org.telegram.messenger.us usVar, int i10) {
        this.a = i10;
        this.c = usVar;
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
                tn0 tn0Var = (tn0) this.c;
                tn0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tn0Var.X.invalidate();
                if (!this.b && tn0Var.Y > 0.5f) {
                    this.b = true;
                    break;
                }
                break;
            case 2:
                m91 m91Var = (m91) this.c;
                m91Var.j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m91Var.i2.invalidate();
                if (!this.b && m91Var.j2 > 0.5f) {
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
