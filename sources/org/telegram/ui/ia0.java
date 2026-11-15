package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ia0 implements org.telegram.ui.Components.nr0 {
    public final /* synthetic */ pa0 a;

    public ia0(pa0 pa0Var) {
        this.a = pa0Var;
    }

    @Override // org.telegram.ui.Components.nr0
    public final void W() {
        pa0 pa0Var = this.a;
        ja0 ja0Var = pa0Var.M0;
        int m0 = ja0Var == null ? 0 : ja0Var.m0(8);
        pa0Var.N0.setText(org.telegram.messenger.hd.G(m0, "LocationStories", new Object[0]));
        ha0 ha0Var = pa0Var.Q;
        boolean z10 = m0 > 0;
        if (ha0Var.a0 != z10) {
            ha0Var.a0 = z10;
            ha0Var.f();
            pa0Var.R.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.nr0
    public final boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Components.nr0
    public final org.telegram.ui.Components.uj0 f() {
        return this.a.R;
    }

    @Override // org.telegram.ui.Components.nr0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.nr0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nr0
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.nr0
    public final void J() {
    }
}
