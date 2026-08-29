package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i41 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.nk0 {
    public final /* synthetic */ d61 a;

    public /* synthetic */ i41(d61 d61Var) {
        this.a = d61Var;
    }

    @Override // org.telegram.ui.Components.nk0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        d61 d61Var = this.a;
        int i11 = d61Var.R;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        d61Var.B(false, true, true);
    }
}
