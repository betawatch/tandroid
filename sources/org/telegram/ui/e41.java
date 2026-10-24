package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class e41 implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ol0 {
    public final /* synthetic */ b61 a;

    public /* synthetic */ e41(b61 b61Var) {
        this.a = b61Var;
    }

    @Override // org.telegram.ui.Components.ol0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        b61 b61Var = this.a;
        int i11 = b61Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        b61Var.B(false, true, true);
    }
}
