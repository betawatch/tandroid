package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class b40 extends q4 {
    public final /* synthetic */ i60 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = i60Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.jh0
    public final void c() {
        i60 i60Var = this.U;
        AccountInstance accountInstance = i60Var.d;
        c40 c40Var = i60Var.b;
        long dialogId = c40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            c40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
