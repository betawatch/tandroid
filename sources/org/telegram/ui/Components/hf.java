package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class hf implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ bw0 a;
    public final /* synthetic */ np0 b;

    public hf(bw0 bw0Var, np0 np0Var) {
        this.a = bw0Var;
        this.b = np0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        bw0 bw0Var = this.a;
        bw0Var.post(new org.telegram.messenger.video.o(this, bw0Var, this.b, 11));
    }
}
