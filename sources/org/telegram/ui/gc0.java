package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gc0 implements org.telegram.ui.Components.bt0 {
    public final /* synthetic */ rc0 a;

    public gc0(rc0 rc0Var) {
        this.a = rc0Var;
    }

    @Override // org.telegram.ui.Components.bt0
    public final void R() {
        rc0 rc0Var = this.a;
        hc0 hc0Var = rc0Var.G0;
        int c02 = hc0Var == null ? 0 : hc0Var.c0(8);
        rc0Var.H0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        fc0 fc0Var = rc0Var.P;
        boolean z10 = c02 > 0;
        if (fc0Var.e0 != z10) {
            fc0Var.e0 = z10;
            fc0Var.l();
            rc0Var.Q.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.bt0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.bt0
    public final org.telegram.ui.Components.jl0 f() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Components.bt0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.bt0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bt0
    public final boolean q() {
        return true;
    }

    @Override // org.telegram.ui.Components.bt0
    public final void E() {
    }
}
