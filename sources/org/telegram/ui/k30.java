package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class k30 extends r4 {
    public final /* synthetic */ s50 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k30(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.Q = s50Var;
    }

    @Override // org.telegram.ui.r4, org.telegram.ui.Components.xg0
    public final void c() {
        s50 s50Var = this.Q;
        AccountInstance accountInstance = s50Var.d;
        l30 l30Var = s50Var.b;
        long dialogId = l30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            l30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
