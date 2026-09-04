package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class z41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public z41(org.telegram.ui.ev evVar, int i10, int i11) {
        this.a = 1;
        this.d = evVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                d51 d51Var = (d51) this.d;
                d51Var.N = true;
                d51Var.n.scrollBy(0, floatValue - this.b);
                d51Var.N = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.ev) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public z41(d51 d51Var, int i10) {
        this.a = 0;
        this.d = d51Var;
        this.c = i10;
        this.b = 0;
    }
}
