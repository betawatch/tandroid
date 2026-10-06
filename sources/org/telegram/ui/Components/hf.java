package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class hf implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ cw0 a;
    public final /* synthetic */ op0 b;

    public hf(cw0 cw0Var, op0 op0Var) {
        this.a = cw0Var;
        this.b = op0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        cw0 cw0Var = this.a;
        cw0Var.post(new org.telegram.messenger.video.o(this, cw0Var, this.b, 11));
    }
}
