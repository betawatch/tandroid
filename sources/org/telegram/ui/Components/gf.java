package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
