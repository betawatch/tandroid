package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public a51(org.telegram.ui.bv bvVar, int i10, int i11) {
        this.a = 1;
        this.d = bvVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                e51 e51Var = (e51) this.d;
                e51Var.K = true;
                e51Var.n.scrollBy(0, floatValue - this.b);
                e51Var.K = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.bv) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public a51(e51 e51Var, int i10) {
        this.a = 0;
        this.d = e51Var;
        this.c = i10;
        this.b = 0;
    }
}
