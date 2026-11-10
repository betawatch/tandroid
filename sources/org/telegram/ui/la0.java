package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class la0 implements org.telegram.ui.Components.nr0 {
    public final /* synthetic */ sa0 a;

    public la0(sa0 sa0Var) {
        this.a = sa0Var;
    }

    @Override // org.telegram.ui.Components.nr0
    public final void V() {
        sa0 sa0Var = this.a;
        ma0 ma0Var = sa0Var.L0;
        int m0 = ma0Var == null ? 0 : ma0Var.m0(8);
        sa0Var.M0.setText(org.telegram.messenger.id.G(m0, "LocationStories", new Object[0]));
        ka0 ka0Var = sa0Var.P;
        boolean z9 = m0 > 0;
        if (ka0Var.Z != z9) {
            ka0Var.Z = z9;
            ka0Var.f();
            sa0Var.Q.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.nr0
    public final boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Components.nr0
    public final org.telegram.ui.Components.pj0 f() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Components.nr0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.nr0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z9, boolean z10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nr0
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.nr0
    public final void I() {
    }
}
