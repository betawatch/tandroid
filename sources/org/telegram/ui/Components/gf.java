package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
