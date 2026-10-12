package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class cd0 implements org.telegram.ui.Components.ju0 {
    public final /* synthetic */ nd0 a;

    public cd0(nd0 nd0Var) {
        this.a = nd0Var;
    }

    @Override // org.telegram.ui.Components.ju0
    public final void R() {
        nd0 nd0Var = this.a;
        dd0 dd0Var = nd0Var.K0;
        int c02 = dd0Var == null ? 0 : dd0Var.c0(8);
        nd0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        bd0 bd0Var = nd0Var.T;
        boolean z10 = c02 > 0;
        if (bd0Var.i0 != z10) {
            bd0Var.i0 = z10;
            bd0Var.l();
            nd0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.ju0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.ju0
    public final org.telegram.ui.Components.mm0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.ju0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.ju0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ju0
    public final boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.ju0
    public final void F() {
    }
}
