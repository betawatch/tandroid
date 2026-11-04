package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ea0 implements org.telegram.ui.Components.lr0 {
    public final /* synthetic */ la0 a;

    public ea0(la0 la0Var) {
        this.a = la0Var;
    }

    @Override // org.telegram.ui.Components.lr0
    public final void V() {
        la0 la0Var = this.a;
        fa0 fa0Var = la0Var.M0;
        int m0 = fa0Var == null ? 0 : fa0Var.m0(8);
        la0Var.N0.setText(org.telegram.messenger.bd.G(m0, "LocationStories", new Object[0]));
        da0 da0Var = la0Var.Q;
        boolean z10 = m0 > 0;
        if (da0Var.a0 != z10) {
            da0Var.a0 = z10;
            da0Var.f();
            la0Var.R.w0(0, org.telegram.messenger.g0.L(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.lr0
    public final boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Components.lr0
    public final org.telegram.ui.Components.tj0 f() {
        return this.a.R;
    }

    @Override // org.telegram.ui.Components.lr0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.lr0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.lr0
    public final boolean t() {
        return true;
    }

    @Override // org.telegram.ui.Components.lr0
    public final void I() {
    }
}
