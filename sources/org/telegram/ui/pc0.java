package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pc0 implements org.telegram.ui.Components.jt0 {
    public final /* synthetic */ ad0 a;

    public pc0(ad0 ad0Var) {
        this.a = ad0Var;
    }

    @Override // org.telegram.ui.Components.jt0
    public final void R() {
        ad0 ad0Var = this.a;
        qc0 qc0Var = ad0Var.H0;
        int c02 = qc0Var == null ? 0 : qc0Var.c0(8);
        ad0Var.I0.setText(LocaleController.formatPluralString("LocationStories", c02, new Object[0]));
        oc0 oc0Var = ad0Var.Q;
        boolean z4 = c02 > 0;
        if (oc0Var.f0 != z4) {
            oc0Var.f0 = z4;
            oc0Var.l();
            ad0Var.R.v0(0, AndroidUtilities.dp(200.0f), null);
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
