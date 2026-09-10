package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hf implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ pv0 a;
    public final /* synthetic */ ep0 b;

    public hf(pv0 pv0Var, ep0 ep0Var) {
        this.a = pv0Var;
        this.b = ep0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        pv0 pv0Var = this.a;
        pv0Var.post(new gf(this, pv0Var, this.b, 0));
    }
}
