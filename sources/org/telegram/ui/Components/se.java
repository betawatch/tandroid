package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class se implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ pu0 a;
    public final /* synthetic */ eo0 b;

    public se(pu0 pu0Var, eo0 eo0Var) {
        this.a = pu0Var;
        this.b = eo0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        pu0 pu0Var = this.a;
        pu0Var.post(new org.telegram.ui.ActionBar.i3(this, pu0Var, this.b, 7));
    }
}
