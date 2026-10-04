package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class y51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public y51(org.telegram.ui.dv dvVar, int i10, int i11) {
        this.a = 1;
        this.d = dvVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                c61 c61Var = (c61) this.d;
                c61Var.N = true;
                c61Var.n.scrollBy(0, floatValue - this.b);
                c61Var.N = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.dv) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public y51(c61 c61Var, int i10) {
        this.a = 0;
        this.d = c61Var;
        this.c = i10;
        this.b = 0;
    }
}
