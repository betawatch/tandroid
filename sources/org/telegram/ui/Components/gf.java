package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
