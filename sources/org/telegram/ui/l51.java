package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.yk0 {
    public final /* synthetic */ g71 a;

    public /* synthetic */ l51(g71 g71Var) {
        this.a = g71Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        g71 g71Var = this.a;
        int i11 = g71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        g71Var.B(false, true, true);
    }
}
