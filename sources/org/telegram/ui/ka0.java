package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ka0 implements org.telegram.ui.Components.or0 {
    public final /* synthetic */ ra0 a;

    public ka0(ra0 ra0Var) {
        this.a = ra0Var;
    }

    @Override // org.telegram.ui.Components.or0
    public final void V() {
        ra0 ra0Var = this.a;
        la0 la0Var = ra0Var.L0;
        int m0 = la0Var == null ? 0 : la0Var.m0(8);
        ra0Var.M0.setText(org.telegram.messenger.id.G(m0, "LocationStories", new Object[0]));
        ja0 ja0Var = ra0Var.P;
        boolean z9 = m0 > 0;
        if (ja0Var.Z != z9) {
            ja0Var.Z = z9;
            ja0Var.f();
            ra0Var.Q.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.or0
    public final boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Components.or0
    public final org.telegram.ui.Components.qj0 f() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Components.or0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.or0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z9, boolean z10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.or0
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.or0
    public final void I() {
    }
}
