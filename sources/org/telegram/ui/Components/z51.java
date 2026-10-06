package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class z51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public z51(org.telegram.ui.dv dvVar, int i10, int i11) {
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
                d61 d61Var = (d61) this.d;
                d61Var.N = true;
                d61Var.n.scrollBy(0, floatValue - this.b);
                d61Var.N = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.dv) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public z51(d61 d61Var, int i10) {
        this.a = 0;
        this.d = d61Var;
        this.c = i10;
        this.b = 0;
    }
}
