package org.telegram.ui;

import android.animation.ValueAnimator;
import java.util.HashSet;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c50 extends f2.n {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final /* synthetic */ o50 L;

    public c50(o50 o50Var) {
        this.L = o50Var;
    }

    @Override // f2.n, f2.w0
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.M.invalidate();
    }

    @Override // f2.n, f2.w0
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
            ofFloat.addUpdateListener(new f3(this, 17));
            this.G.addListener(new org.telegram.ui.Components.y11(this, 28));
            this.G.setDuration(350L);
            this.G.setInterpolator(org.telegram.ui.Components.gr.f);
            this.G.start();
            o50 o50Var = this.L;
            o50Var.M.invalidate();
            o50Var.W1.invalidate();
        }
        super.m();
    }
}
