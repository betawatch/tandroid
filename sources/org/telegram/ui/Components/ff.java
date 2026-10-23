package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ff implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ bw0 a;
    public final /* synthetic */ rp0 b;

    public ff(bw0 bw0Var, rp0 rp0Var) {
        this.a = bw0Var;
        this.b = rp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        bw0 bw0Var = this.a;
        bw0Var.post(new ig.e2(this, bw0Var, this.b, 28));
    }
}
