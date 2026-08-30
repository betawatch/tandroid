package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class q50 extends f2.l {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final /* synthetic */ c60 L;

    public q50(c60 c60Var) {
        this.L = c60Var;
    }

    @Override // f2.l, f2.t0
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.N.invalidate();
    }

    @Override // f2.l, f2.t0
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 17));
            this.G.addListener(new org.telegram.ui.Components.f91(this, 21));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.nr.f);
            this.G.start();
            c60 c60Var = this.L;
            c60Var.N.invalidate();
            c60Var.X1.invalidate();
        }
        super.m();
    }
}
