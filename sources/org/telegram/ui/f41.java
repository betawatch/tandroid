package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f41 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ek0 {
    public final /* synthetic */ a61 a;

    public /* synthetic */ f41(a61 a61Var) {
        this.a = a61Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public void b() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        a61 a61Var = this.a;
        int i11 = a61Var.R;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        a61Var.B(false, true, true);
    }
}
