package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.al0 {
    public final /* synthetic */ a71 a;

    public /* synthetic */ f51(a71 a71Var) {
        this.a = a71Var;
    }

    @Override // org.telegram.ui.Components.al0
    public void e() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        a71 a71Var = this.a;
        int i11 = a71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        a71Var.B(false, true, true);
    }
}
