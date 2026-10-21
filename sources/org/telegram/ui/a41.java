package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a41 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ll0 {
    public final /* synthetic */ x51 a;

    public /* synthetic */ a41(x51 x51Var) {
        this.a = x51Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public void b() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        x51 x51Var = this.a;
        int i11 = x51Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        x51Var.B(false, true, true);
    }
}
