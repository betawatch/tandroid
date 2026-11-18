package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ye implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ rt0 a;
    public final /* synthetic */ nn0 b;

    public ye(rt0 rt0Var, nn0 nn0Var) {
        this.a = rt0Var;
        this.b = nn0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        rt0 rt0Var = this.a;
        rt0Var.post(new k7(this, rt0Var, this.b, 2));
    }
}
