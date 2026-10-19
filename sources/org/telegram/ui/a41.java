package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class a41 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.kl0 {
    public final /* synthetic */ x51 a;

    public /* synthetic */ a41(x51 x51Var) {
        this.a = x51Var;
    }

    @Override // org.telegram.ui.Components.kl0
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
