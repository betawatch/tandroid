package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
