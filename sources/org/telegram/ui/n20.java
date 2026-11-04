package org.telegram.ui;

import android.view.TextureView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n20 implements tq0 {
    public final /* synthetic */ x30 a;

    public n20(x30 x30Var) {
        this.a = x30Var;
    }

    @Override // org.telegram.ui.tq0
    public final void G(org.telegram.messenger.zi ziVar) {
        this.a.b.invalidate();
    }

    @Override // org.telegram.ui.tq0
    public final void I0(org.telegram.messenger.zi ziVar) {
        x30 x30Var = this.a;
        x30Var.I1.I0(true);
        x30Var.U3.f.K0(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0, 0);
        x30Var.b.invalidate();
    }

    @Override // org.telegram.ui.tq0
    public final /* synthetic */ TextureView i0() {
        return null;
    }
}
