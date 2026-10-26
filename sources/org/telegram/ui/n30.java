package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n30 extends u4 {
    public final /* synthetic */ v50 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n30(v50 v50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = v50Var;
    }

    @Override // org.telegram.ui.u4, org.telegram.ui.Components.ii0
    public final void c() {
        v50 v50Var = this.U;
        AccountInstance accountInstance = v50Var.d;
        o30 o30Var = v50Var.b;
        long dialogId = o30Var.getDialogId();
        if (dialogId > 0) {
            TLRPC.User user = accountInstance.getMessagesController().getUser(Long.valueOf(dialogId));
            o30Var.H(null, ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 0), ImageLocation.getForUserOrChat(accountInstance.getCurrentAccount(), user, 1), false);
        }
    }
}
