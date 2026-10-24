package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class hc0 implements org.telegram.ui.Components.ju0 {
    public final /* synthetic */ sc0 a;

    public hc0(sc0 sc0Var) {
        this.a = sc0Var;
    }

    @Override // org.telegram.ui.Components.ju0
    public final void R() {
        sc0 sc0Var = this.a;
        ic0 ic0Var = sc0Var.K0;
        int d02 = ic0Var == null ? 0 : ic0Var.d0(8);
        sc0Var.L0.setText(LocaleController.formatPluralString("LocationStories", d02, new Object[0]));
        gc0 gc0Var = sc0Var.T;
        boolean z10 = d02 > 0;
        if (gc0Var.i0 != z10) {
            gc0Var.i0 = z10;
            gc0Var.l();
            sc0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
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
    public final void C() {
    }
}
