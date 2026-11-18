package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ja0 implements org.telegram.ui.Components.vr0 {
    public final /* synthetic */ qa0 a;

    public ja0(qa0 qa0Var) {
        this.a = qa0Var;
    }

    @Override // org.telegram.ui.Components.vr0
    public final void W() {
        qa0 qa0Var = this.a;
        ka0 ka0Var = qa0Var.R0;
        int m0 = ka0Var == null ? 0 : ka0Var.m0(8);
        qa0Var.S0.setText(org.telegram.messenger.gd.G(m0, "LocationStories", new Object[0]));
        ia0 ia0Var = qa0Var.Q;
        boolean z10 = m0 > 0;
        if (ia0Var.a0 != z10) {
            ia0Var.a0 = z10;
            ia0Var.f();
            qa0Var.R.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.vr0
    public final boolean Y() {
        return false;
    }

    @Override // org.telegram.ui.Components.vr0
    public final org.telegram.ui.Components.ck0 f() {
        return this.a.R;
    }

    @Override // org.telegram.ui.Components.vr0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.vr0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.vr0
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.vr0
    public final void J() {
    }
}
