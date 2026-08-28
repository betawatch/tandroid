package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ec0 implements org.telegram.ui.Components.qs0 {
    public final /* synthetic */ pc0 a;

    public ec0(pc0 pc0Var) {
        this.a = pc0Var;
    }

    @Override // org.telegram.ui.Components.qs0
    public final void Q() {
        pc0 pc0Var = this.a;
        fc0 fc0Var = pc0Var.G0;
        int c02 = fc0Var == null ? 0 : fc0Var.c0(8);
        pc0Var.H0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        dc0 dc0Var = pc0Var.P;
        boolean z10 = c02 > 0;
        if (dc0Var.e0 != z10) {
            dc0Var.e0 = z10;
            dc0Var.l();
            pc0Var.Q.v0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.qs0
    public final boolean S() {
        return false;
    }

    @Override // org.telegram.ui.Components.qs0
    public final org.telegram.ui.Components.wk0 f() {
        return this.a.Q;
    }

    @Override // org.telegram.ui.Components.qs0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.qs0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.qs0
    public final boolean q() {
        return true;
    }

    @Override // org.telegram.ui.Components.qs0
    public final void E() {
    }
}
