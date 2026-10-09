package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.sl0 {
    public final /* synthetic */ k71 a;

    public /* synthetic */ n51(k71 k71Var) {
        this.a = k71Var;
    }

    @Override // org.telegram.ui.Components.sl0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        k71 k71Var = this.a;
        int i11 = k71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        k71Var.B(false, true, true);
    }
}
