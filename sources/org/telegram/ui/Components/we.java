package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class we implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ fv0 a;
    public final /* synthetic */ xo0 b;

    public we(fv0 fv0Var, xo0 xo0Var) {
        this.a = fv0Var;
        this.b = xo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        fv0 fv0Var = this.a;
        fv0Var.post(new lh.p6(this, fv0Var, this.b, 25));
    }
}
