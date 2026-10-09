package org.telegram.ui.Components;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jf implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ iw0 a;
    public final /* synthetic */ zp0 b;

    public jf(iw0 iw0Var, zp0 zp0Var) {
        this.a = iw0Var;
        this.b = zp0Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        iw0 iw0Var = this.a;
        iw0Var.post(new org.telegram.messenger.video.f(this, iw0Var, this.b, 13));
    }
}
