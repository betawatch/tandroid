package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
