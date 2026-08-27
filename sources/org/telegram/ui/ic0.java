package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ic0 implements org.telegram.ui.Components.ss0 {
    public final /* synthetic */ tc0 a;

    public ic0(tc0 tc0Var) {
        this.a = tc0Var;
    }

    @Override // org.telegram.ui.Components.ss0
    public final void R() {
        tc0 tc0Var = this.a;
        jc0 jc0Var = tc0Var.G0;
        int c02 = jc0Var == null ? 0 : jc0Var.c0(8);
        tc0Var.H0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        hc0 hc0Var = tc0Var.P;
        boolean z10 = c02 > 0;
        if (hc0Var.e0 != z10) {
            hc0Var.e0 = z10;
            hc0Var.l();
            tc0Var.Q.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.ss0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.ss0
    public final org.telegram.ui.Components.zk0 f() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Components.ss0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.ss0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ss0
    public final boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.ss0
    public final void F() {
    }
}
