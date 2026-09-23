package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class d51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ok0 {
    public final /* synthetic */ z61 a;

    public /* synthetic */ d51(z61 z61Var) {
        this.a = z61Var;
    }

    @Override // org.telegram.ui.Components.ok0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        z61 z61Var = this.a;
        int i11 = z61Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        z61Var.B(false, true, true);
    }
}
