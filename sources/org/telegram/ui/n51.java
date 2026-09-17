package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nk0 {
    public final /* synthetic */ j71 a;

    public /* synthetic */ n51(j71 j71Var) {
        this.a = j71Var;
    }

    @Override // org.telegram.ui.Components.nk0
    public void b() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        j71 j71Var = this.a;
        int i11 = j71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        j71Var.B(false, true, true);
    }
}
