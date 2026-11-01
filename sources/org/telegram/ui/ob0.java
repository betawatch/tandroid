package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ob0 implements org.telegram.ui.Components.ns0 {
    public final /* synthetic */ xb0 a;

    public ob0(xb0 xb0Var) {
        this.a = xb0Var;
    }

    @Override // org.telegram.ui.Components.ns0
    public final void W() {
        xb0 xb0Var = this.a;
        pb0 pb0Var = xb0Var.S0;
        int l02 = pb0Var == null ? 0 : pb0Var.l0(8);
        xb0Var.T0.setText(org.telegram.messenger.dd.G(l02, "LocationStories", new Object[0]));
        nb0 nb0Var = xb0Var.R;
        boolean z10 = l02 > 0;
        if (nb0Var.i0 != z10) {
            nb0Var.i0 = z10;
            nb0Var.f();
            xb0Var.S.w0(0, org.telegram.messenger.i0.L(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.ns0
    public final boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Components.ns0
    public final org.telegram.ui.Components.uk0 f() {
        return this.a.S;
    }

    @Override // org.telegram.ui.Components.ns0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.ns0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ns0
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.ns0
    public final void J() {
    }
}
