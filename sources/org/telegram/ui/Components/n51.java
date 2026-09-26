package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class n51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public n51(org.telegram.ui.zu zuVar, int i10, int i11) {
        this.a = 1;
        this.d = zuVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                r51 r51Var = (r51) this.d;
                r51Var.N = true;
                r51Var.n.scrollBy(0, floatValue - this.b);
                r51Var.N = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.zu) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public n51(r51 r51Var, int i10) {
        this.a = 0;
        this.d = r51Var;
        this.c = i10;
        this.b = 0;
    }
}
