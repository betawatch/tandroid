package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class d61 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public d61(org.telegram.ui.iv ivVar, int i10, int i11) {
        this.a = 1;
        this.d = ivVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                h61 h61Var = (h61) this.d;
                h61Var.N = true;
                h61Var.n.scrollBy(0, floatValue - this.b);
                h61Var.N = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.iv) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public d61(h61 h61Var, int i10) {
        this.a = 0;
        this.d = h61Var;
        this.c = i10;
        this.b = 0;
    }
}
