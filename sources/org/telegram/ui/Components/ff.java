package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
