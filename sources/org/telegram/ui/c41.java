package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c41 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.kl0 {
    public final /* synthetic */ z51 a;

    public /* synthetic */ c41(z51 z51Var) {
        this.a = z51Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public void b() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        z51 z51Var = this.a;
        int i11 = z51Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        z51Var.B(false, true, true);
    }
}
