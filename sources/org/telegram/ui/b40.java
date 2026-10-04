package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class b40 extends r4 {
    public final /* synthetic */ h60 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(h60 h60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = h60Var;
    }

    @Override // org.telegram.ui.r4, org.telegram.ui.Components.wh0
    public final void c() {
        h60 h60Var = this.U;
        AccountInstance accountInstance = h60Var.d;
        c40 c40Var = h60Var.b;
        long dialogId = c40Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            c40Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
