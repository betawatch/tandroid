package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gc0 implements org.telegram.ui.Components.nu0 {
    public final /* synthetic */ rc0 a;

    public gc0(rc0 rc0Var) {
        this.a = rc0Var;
    }

    @Override // org.telegram.ui.Components.nu0
    public final void S() {
        rc0 rc0Var = this.a;
        hc0 hc0Var = rc0Var.J0;
        int j02 = hc0Var == null ? 0 : hc0Var.j0(8);
        rc0Var.K0.setText(LocaleController.formatPluralString("LocationStories", j02, new Object[0]));
        fc0 fc0Var = rc0Var.T;
        boolean z10 = j02 > 0;
        if (fc0Var.i0 != z10) {
            fc0Var.i0 = z10;
            fc0Var.l();
            rc0Var.U.w0(0, AndroidUtilities.dp(200.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.nu0
    public final boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.nu0
    public final org.telegram.ui.Components.nm0 f() {
        return this.a.U;
    }

    @Override // org.telegram.ui.Components.nu0
    public final TLRPC.Chat g() {
        return null;
    }

    @Override // org.telegram.ui.Components.nu0
    public final boolean h(TLRPC.ChatParticipant chatParticipant, boolean z10, boolean z11, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.nu0
    public final boolean q() {
        return true;
    }

    @Override // org.telegram.ui.Components.nu0
    public final void G() {
    }
}
