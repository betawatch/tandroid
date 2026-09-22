package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class o51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0 {
    public final /* synthetic */ j71 a;

    public /* synthetic */ o51(j71 j71Var) {
        this.a = j71Var;
    }

    @Override // org.telegram.ui.Components.al0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        j71 j71Var = this.a;
        int i11 = j71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        j71Var.B(false, true, true);
    }
}
