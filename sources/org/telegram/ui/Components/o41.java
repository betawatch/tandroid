package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o41 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public o41(org.telegram.ui.tu tuVar, int i10, int i11) {
        this.a = 1;
        this.d = tuVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                s41 s41Var = (s41) this.d;
                s41Var.J = true;
                s41Var.n.scrollBy(0, floatValue - this.b);
                s41Var.J = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.tu) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public o41(s41 s41Var, int i10) {
        this.a = 0;
        this.d = s41Var;
        this.c = i10;
        this.b = 0;
    }
}
