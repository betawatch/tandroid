package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hf implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ ew0 a;
    public final /* synthetic */ vp0 b;

    public hf(ew0 ew0Var, vp0 vp0Var) {
        this.a = ew0Var;
        this.b = vp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ew0 ew0Var = this.a;
        ew0Var.post(new org.telegram.messenger.video.f(this, ew0Var, this.b, 13));
    }
}
