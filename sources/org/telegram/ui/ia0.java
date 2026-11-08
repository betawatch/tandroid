package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class ia0 implements org.telegram.ui.Components.mr0 {
    public final /* synthetic */ pa0 a;

    public ia0(pa0 pa0Var) {
        this.a = pa0Var;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void V() {
        pa0 pa0Var = this.a;
        ja0 ja0Var = pa0Var.L0;
        int m0 = ja0Var == null ? 0 : ja0Var.m0(8);
        pa0Var.M0.setText(org.telegram.messenger.id.G(m0, "LocationStories", new Object[0]));
        ha0 ha0Var = pa0Var.P;
        boolean z9 = m0 > 0;
        if (ha0Var.Z != z9) {
            ha0Var.Z = z9;
            ha0Var.f();
            pa0Var.Q.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.mr0
    public final boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Components.mr0
    public final org.telegram.ui.Components.pj0 f() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Components.mr0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.mr0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z9, boolean z10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.mr0
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void I() {
    }
}
