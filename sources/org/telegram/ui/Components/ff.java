package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ ew0 a;
    public final /* synthetic */ vp0 b;

    public ff(ew0 ew0Var, vp0 vp0Var) {
        this.a = ew0Var;
        this.b = vp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ew0 ew0Var = this.a;
        ew0Var.post(new ig.d2(this, ew0Var, this.b, 28));
    }
}
