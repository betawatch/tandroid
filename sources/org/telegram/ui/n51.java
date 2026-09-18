package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n51 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.ok0 {
    public final /* synthetic */ i71 a;

    public /* synthetic */ n51(i71 i71Var) {
        this.a = i71Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        i71 i71Var = this.a;
        int i11 = i71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        i71Var.B(false, true, true);
    }
}
