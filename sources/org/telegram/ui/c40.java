package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c40 extends r4 {
    public final /* synthetic */ j60 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(j60 j60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = j60Var;
    }

    @Override // org.telegram.ui.r4, org.telegram.ui.Components.th0
    public final void c() {
        j60 j60Var = this.U;
        AccountInstance accountInstance = j60Var.d;
        d40 d40Var = j60Var.b;
        long dialogId = d40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            d40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
