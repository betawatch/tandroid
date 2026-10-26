package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ec0 implements org.telegram.ui.Components.mu0 {
    public final /* synthetic */ pc0 a;

    public ec0(pc0 pc0Var) {
        this.a = pc0Var;
    }

    @Override // org.telegram.ui.Components.mu0
    public final void S() {
        pc0 pc0Var = this.a;
        fc0 fc0Var = pc0Var.J0;
        int j02 = fc0Var == null ? 0 : fc0Var.j0(8);
        pc0Var.K0.setText(LocaleController.formatPluralString("LocationStories", j02, new Object[0]));
        dc0 dc0Var = pc0Var.T;
        boolean z10 = j02 > 0;
        if (dc0Var.i0 != z10) {
            dc0Var.i0 = z10;
            dc0Var.l();
            pc0Var.U.w0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.mu0
    public final boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.mu0
    public final org.telegram.ui.Components.mm0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.mu0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.mu0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.mu0
    public final boolean q() {
        return true;
    }

    @Override // org.telegram.ui.Components.mu0
    public final void G() {
    }
}
