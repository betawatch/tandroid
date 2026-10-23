package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
