package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class a90 extends org.telegram.ui.sn {
    public boolean ed;
    public final /* synthetic */ boolean fd;
    public final /* synthetic */ long gd;
    public final /* synthetic */ b90 hd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a90(b90 b90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.hd = b90Var;
        this.fd = z10;
        this.gd = j10;
        this.ed = false;
    }

    public static void ed(a90 a90Var, long j10, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.g6 g6Var;
        if (AndroidUtilities.isContextSafe(a90Var.getParentActivity())) {
            Activity parentActivity = a90Var.getParentActivity();
            int i10 = a90Var.currentAccount;
            long j11 = -j10;
            TLRPC.User currentUser = a90Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            g6Var = ((org.telegram.ui.ActionBar.h3) a90Var.hd).resourcesProvider;
            a11.c(parentActivity, i10, j11, currentUser, null, z10, z11, g6Var);
        }
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.ed || !this.fd) {
            return;
        }
        this.ed = true;
        MessagesController messagesController = getMessagesController();
        long j10 = this.gd;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.canManageMyTag(chat)) {
            qc J = xc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.i0(this, j10, chat, 23));
            J.r = false;
            J.k(true);
        } else {
            qc Q = xc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.r = false;
            Q.k(true);
        }
    }
}
