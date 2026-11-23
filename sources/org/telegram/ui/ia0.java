package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ia0 implements org.telegram.ui.Components.wr0 {
    public final /* synthetic */ pa0 a;

    public ia0(pa0 pa0Var) {
        this.a = pa0Var;
    }

    @Override // org.telegram.ui.Components.wr0
    public final void W() {
        pa0 pa0Var = this.a;
        ja0 ja0Var = pa0Var.R0;
        int m0 = ja0Var == null ? 0 : ja0Var.m0(8);
        pa0Var.S0.setText(org.telegram.messenger.gd.G(m0, "LocationStories", new Object[0]));
        ha0 ha0Var = pa0Var.Q;
        boolean z10 = m0 > 0;
        if (ha0Var.a0 != z10) {
            ha0Var.a0 = z10;
            ha0Var.f();
            pa0Var.R.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.wr0
    public final boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Components.wr0
    public final org.telegram.ui.Components.ek0 e() {
        return this.a.R;
    }

    @Override // org.telegram.ui.Components.wr0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.wr0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.wr0
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.wr0
    public final void I() {
    }
}
