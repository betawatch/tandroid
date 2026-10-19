package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class cc0 implements org.telegram.ui.Components.fu0 {
    public final /* synthetic */ nc0 a;

    public cc0(nc0 nc0Var) {
        this.a = nc0Var;
    }

    @Override // org.telegram.ui.Components.fu0
    public final void R() {
        nc0 nc0Var = this.a;
        dc0 dc0Var = nc0Var.K0;
        int c02 = dc0Var == null ? 0 : dc0Var.c0(8);
        nc0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        bc0 bc0Var = nc0Var.T;
        boolean z10 = c02 > 0;
        if (bc0Var.i0 != z10) {
            bc0Var.i0 = z10;
            bc0Var.l();
            nc0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.fu0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.fu0
    public final org.telegram.ui.Components.im0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.fu0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.fu0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.fu0
    public final boolean q() {
        return true;
    }

    @Override // org.telegram.ui.Components.fu0
    public final void C() {
    }
}
