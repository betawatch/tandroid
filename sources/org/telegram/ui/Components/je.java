package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class je implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ mu0 a;
    public final /* synthetic */ co0 b;

    public je(mu0 mu0Var, co0 co0Var) {
        this.a = mu0Var;
        this.b = co0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        mu0 mu0Var = this.a;
        mu0Var.post(new li.s(this, mu0Var, this.b, 27));
    }
}
