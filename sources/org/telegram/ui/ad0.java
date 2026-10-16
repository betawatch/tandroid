package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ad0 implements org.telegram.ui.Components.ju0 {
    public final /* synthetic */ ld0 a;

    public ad0(ld0 ld0Var) {
        this.a = ld0Var;
    }

    @Override // org.telegram.ui.Components.ju0
    public final void R() {
        ld0 ld0Var = this.a;
        bd0 bd0Var = ld0Var.K0;
        int c02 = bd0Var == null ? 0 : bd0Var.c0(8);
        ld0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        zc0 zc0Var = ld0Var.T;
        boolean z10 = c02 > 0;
        if (zc0Var.i0 != z10) {
            zc0Var.i0 = z10;
            zc0Var.l();
            ld0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
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
