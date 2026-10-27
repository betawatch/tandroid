package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i41 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.pl0 {
    public final /* synthetic */ f61 a;

    public /* synthetic */ i41(f61 f61Var) {
        this.a = f61Var;
    }

    @Override // org.telegram.ui.Components.pl0
    public void d() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        f61 f61Var = this.a;
        int i11 = f61Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        f61Var.B(false, true, true);
    }
}
