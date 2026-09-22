package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.nk0 {
    public final /* synthetic */ h71 a;

    public /* synthetic */ l51(h71 h71Var) {
        this.a = h71Var;
    }

    @Override // org.telegram.ui.Components.nk0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        h71 h71Var = this.a;
        int i11 = h71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        h71Var.B(false, true, true);
    }
}
