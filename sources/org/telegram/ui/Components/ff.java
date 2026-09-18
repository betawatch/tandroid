package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ rv0 a;
    public final /* synthetic */ ip0 b;

    public ff(rv0 rv0Var, ip0 ip0Var) {
        this.a = rv0Var;
        this.b = ip0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        rv0 rv0Var = this.a;
        rv0Var.post(new org.telegram.messenger.video.o(this, rv0Var, this.b, 11));
    }
}
