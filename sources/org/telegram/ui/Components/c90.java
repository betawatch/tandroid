package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c90 extends org.telegram.ui.wn {
    public boolean od;
    public final /* synthetic */ boolean pd;
    public final /* synthetic */ long qd;
    public final /* synthetic */ d90 rd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c90(d90 d90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.rd = d90Var;
        this.pd = z10;
        this.qd = j10;
        this.od = false;
    }

    public static void od(c90 c90Var, long j10, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.u6 u6Var;
        if (AndroidUtilities.isContextSafe(c90Var.getParentActivity())) {
            Activity parentActivity = c90Var.getParentActivity();
            int i10 = c90Var.currentAccount;
            long j11 = -j10;
            TLRPC.User currentUser = c90Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            u6Var = ((org.telegram.ui.ActionBar.k3) c90Var.rd).resourcesProvider;
            j11.c(parentActivity, i10, j11, currentUser, null, z10, z11, u6Var);
        }
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.od || !this.pd) {
            return;
        }
        this.od = true;
        MessagesController messagesController = getMessagesController();
        long j10 = this.qd;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.canManageMyTag(chat)) {
            qc J = wc.b0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.i0(this, j10, chat, 23));
            J.s = false;
            J.k(true);
        } else {
            qc R = wc.b0(this).R(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            R.s = false;
            R.k(true);
        }
    }
}
