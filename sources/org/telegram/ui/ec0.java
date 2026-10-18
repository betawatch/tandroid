package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ec0 implements org.telegram.ui.Components.eu0 {
    public final /* synthetic */ pc0 a;

    public ec0(pc0 pc0Var) {
        this.a = pc0Var;
    }

    @Override // org.telegram.ui.Components.eu0
    public final void R() {
        pc0 pc0Var = this.a;
        fc0 fc0Var = pc0Var.K0;
        int c02 = fc0Var == null ? 0 : fc0Var.c0(8);
        pc0Var.L0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        dc0 dc0Var = pc0Var.T;
        boolean z10 = c02 > 0;
        if (dc0Var.i0 != z10) {
            dc0Var.i0 = z10;
            dc0Var.l();
            pc0Var.U.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.Components.eu0
    public final org.telegram.ui.Components.im0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.eu0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.eu0
    public final boolean q() {
        return true;
    }

    @Override // org.telegram.ui.Components.eu0
    public final void C() {
    }
}
