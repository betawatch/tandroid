package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e51 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.yk0 {
    public final /* synthetic */ a71 a;

    public /* synthetic */ e51(a71 a71Var) {
        this.a = a71Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        a71 a71Var = this.a;
        int i11 = a71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        a71Var.B(false, true, true);
    }
}
