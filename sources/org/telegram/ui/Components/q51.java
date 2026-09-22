package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q51 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public q51(org.telegram.ui.ev evVar, int i10, int i11) {
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
                u51 u51Var = (u51) this.d;
                u51Var.N = true;
                u51Var.n.scrollBy(0, floatValue - this.b);
                u51Var.N = false;
                this.b = floatValue;
                break;
            default:
                ((org.telegram.ui.ev) this.d).c.d.setColorFilter(new PorterDuffColorFilter(i0.a.d(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.b, this.c), PorterDuff.Mode.SRC_IN));
                break;
        }
    }

    public q51(u51 u51Var, int i10) {
        this.a = 0;
        this.d = u51Var;
        this.c = i10;
        this.b = 0;
    }
}
