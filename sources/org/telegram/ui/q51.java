package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class q51 implements org.telegram.ui.ActionBar.c2, org.telegram.ui.Components.xk0 {
    public final /* synthetic */ l71 a;

    public /* synthetic */ q51(l71 l71Var) {
        this.a = l71Var;
    }

    @Override // org.telegram.ui.Components.xk0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        l71 l71Var = this.a;
        int i11 = l71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        l71Var.B(false, true, true);
    }
}
