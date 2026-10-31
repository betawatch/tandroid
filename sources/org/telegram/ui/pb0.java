package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pb0 implements org.telegram.ui.Components.ms0 {
    public final /* synthetic */ yb0 a;

    public pb0(yb0 yb0Var) {
        this.a = yb0Var;
    }

    @Override // org.telegram.ui.Components.ms0
    public final void V() {
        yb0 yb0Var = this.a;
        qb0 qb0Var = yb0Var.S0;
        int k02 = qb0Var == null ? 0 : qb0Var.k0(8);
        yb0Var.T0.setText(org.telegram.messenger.cd.G(k02, "LocationStories", new Object[0]));
        ob0 ob0Var = yb0Var.R;
        boolean z10 = k02 > 0;
        if (ob0Var.i0 != z10) {
            ob0Var.i0 = z10;
            ob0Var.f();
            yb0Var.S.w0(0, org.telegram.messenger.i0.L(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.ms0
    public final boolean X() {
        return false;
    }

    @Override // org.telegram.ui.Components.ms0
    public final org.telegram.ui.Components.tk0 f() {
        return this.a.S;
    }

    @Override // org.telegram.ui.Components.ms0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.ms0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ms0
    public final boolean s() {
        return true;
    }

    @Override // org.telegram.ui.Components.ms0
    public final void I() {
    }
}
