package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class o51 implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.xk0 {
    public final /* synthetic */ j71 a;

    public /* synthetic */ o51(j71 j71Var) {
        this.a = j71Var;
    }

    @Override // org.telegram.ui.Components.xk0
    public void a() {
        this.a.m();
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        j71 j71Var = this.a;
        int i11 = j71Var.V;
        ConnectionsManager.getInstance(i11).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        MediaDataController.getInstance(i11).clearRecentEmojiStatuses();
        j71Var.B(false, true, true);
    }
}
