package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class gf implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ ev0 a;
    public final /* synthetic */ uo0 b;

    public gf(ev0 ev0Var, uo0 uo0Var) {
        this.a = ev0Var;
        this.b = uo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ev0 ev0Var = this.a;
        ev0Var.post(new org.telegram.ui.ActionBar.p(this, ev0Var, this.b, 8));
    }
}
