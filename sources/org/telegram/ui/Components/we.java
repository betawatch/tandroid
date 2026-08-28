package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class we implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ mu0 a;
    public final /* synthetic */ do0 b;

    public we(mu0 mu0Var, do0 do0Var) {
        this.a = mu0Var;
        this.b = do0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        mu0 mu0Var = this.a;
        mu0Var.post(new org.telegram.messenger.video.e(this, mu0Var, this.b, 13));
    }
}
