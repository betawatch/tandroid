package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ sv0 a;
    public final /* synthetic */ jp0 b;

    public ff(sv0 sv0Var, jp0 jp0Var) {
        this.a = sv0Var;
        this.b = jp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        sv0 sv0Var = this.a;
        sv0Var.post(new org.telegram.messenger.video.o(this, sv0Var, this.b, 11));
    }
}
