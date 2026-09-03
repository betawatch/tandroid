package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class qc0 implements org.telegram.ui.Components.jt0 {
    public final /* synthetic */ bd0 a;

    public qc0(bd0 bd0Var) {
        this.a = bd0Var;
    }

    @Override // org.telegram.ui.Components.jt0
    public final void R() {
        bd0 bd0Var = this.a;
        rc0 rc0Var = bd0Var.H0;
        int c02 = rc0Var == null ? 0 : rc0Var.c0(8);
        bd0Var.I0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        pc0 pc0Var = bd0Var.Q;
        boolean z4 = c02 > 0;
        if (pc0Var.f0 != z4) {
            pc0Var.f0 = z4;
            pc0Var.l();
            bd0Var.R.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.jt0
    public final org.telegram.ui.Components.sl0 f() {
        return this.a.R;
    }

    @Override // org.telegram.ui.Components.jt0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z4, boolean z10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jt0
    public final boolean q() {
        return true;
    }

    @Override // org.telegram.ui.Components.jt0
    public final void E() {
    }
}
