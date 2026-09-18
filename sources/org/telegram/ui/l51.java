package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.yk0 {
    public final /* synthetic */ g71 a;

    public /* synthetic */ l51(g71 g71Var) {
        this.a = g71Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        g71 g71Var = this.a;
        int i11 = g71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        g71Var.B(false, true, true);
    }
}
