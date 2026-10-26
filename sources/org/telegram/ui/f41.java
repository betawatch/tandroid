package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f41 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.ol0 {
    public final /* synthetic */ c61 a;

    public /* synthetic */ f41(c61 c61Var) {
        this.a = c61Var;
    }

    @Override // org.telegram.ui.Components.ol0
    public void d() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        c61 c61Var = this.a;
        int i11 = c61Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        c61Var.B(false, true, true);
    }
}
