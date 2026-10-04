package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class h51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0 {
    public final /* synthetic */ c71 a;

    public /* synthetic */ h51(c71 c71Var) {
        this.a = c71Var;
    }

    @Override // org.telegram.ui.Components.al0
    public void e() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        c71 c71Var = this.a;
        int i11 = c71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        c71Var.B(false, true, true);
    }
}
