package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g41 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.ck0 {
    public final /* synthetic */ b61 a;

    public /* synthetic */ g41(b61 b61Var) {
        this.a = b61Var;
    }

    @Override // org.telegram.ui.Components.ck0
    public void b() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        b61 b61Var = this.a;
        int i10 = b61Var.R;
        ConnectionsManager.getInstance(i10).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i10).clearRecentEmojiStatuses();
        b61Var.B(false, true, true);
    }
}
