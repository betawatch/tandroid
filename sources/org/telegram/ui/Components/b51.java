package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public b51(org.telegram.ui.fv fvVar, int i10, int i11) {
        this.a = 1;
        this.d = fvVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                f51 f51Var = (f51) this.d;
                f51Var.N = true;
                f51Var.n.scrollBy(0, floatValue - this.b);
                f51Var.N = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.fv) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public b51(f51 f51Var, int i10) {
        this.a = 0;
        this.d = f51Var;
        this.c = i10;
        this.b = 0;
    }
}
