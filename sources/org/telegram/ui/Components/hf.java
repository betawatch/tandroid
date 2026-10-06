package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
