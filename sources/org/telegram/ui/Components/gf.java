package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class gf implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ qv0 a;
    public final /* synthetic */ hp0 b;

    public gf(qv0 qv0Var, hp0 hp0Var) {
        this.a = qv0Var;
        this.b = hp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        qv0 qv0Var = this.a;
        qv0Var.post(new org.telegram.messenger.video.o(this, qv0Var, this.b, 11));
    }
}
