package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
