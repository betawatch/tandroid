package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public b51(org.telegram.ui.cv cvVar, int i10, int i11) {
        this.a = 1;
        this.d = cvVar;
        this.b = i10;
        this.c = i11;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.c);
                f51 f51Var = (f51) this.d;
                f51Var.K = true;
                f51Var.n.scrollBy(0, floatValue - this.b);
                f51Var.K = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.cv) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
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
