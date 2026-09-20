package org.telegram.ui;

import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class b40 extends q4 {
    public final /* synthetic */ i60 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = i60Var;
    }

    @Override // org.telegram.ui.q4, org.telegram.ui.Components.th0
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
