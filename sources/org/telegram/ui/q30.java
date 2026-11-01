package org.telegram.ui;

import android.view.TextureView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q30 implements ns0 {
    public final /* synthetic */ a50 a;

    public q30(a50 a50Var) {
        this.a = a50Var;
    }

    @Override // org.telegram.ui.ns0
    public final void H0(org.telegram.messenger.kj kjVar) {
        a50 a50Var = this.a;
        a50Var.H1.I0(true);
        a50Var.T3.f.K0(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), 0, 0);
        a50Var.b.invalidate();
    }

    @Override // org.telegram.ui.ns0
    public final void I(org.telegram.messenger.kj kjVar) {
        this.a.b.invalidate();
    }

    @Override // org.telegram.ui.ns0
    public final /* synthetic */ TextureView k0() {
        return null;
    }
}
