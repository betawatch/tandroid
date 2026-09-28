package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class gf implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ sv0 a;
    public final /* synthetic */ jp0 b;

    public gf(sv0 sv0Var, jp0 jp0Var) {
        this.a = sv0Var;
        this.b = jp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        sv0 sv0Var = this.a;
        sv0Var.post(new org.telegram.messenger.video.o(this, sv0Var, this.b, 11));
    }
}
