package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b90 extends org.telegram.ui.un {
    public boolean kd;
    public final /* synthetic */ boolean ld;
    public final /* synthetic */ long md;
    public final /* synthetic */ c90 nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b90(c90 c90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.nd = c90Var;
        this.ld = z10;
        this.md = j10;
        this.kd = false;
    }

    public static void kd(b90 b90Var, long j10, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.u6 u6Var;
        if (AndroidUtilities.isContextSafe(b90Var.getParentActivity())) {
            Activity parentActivity = b90Var.getParentActivity();
            int i10 = b90Var.currentAccount;
            long j11 = -j10;
            TLRPC.User currentUser = b90Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            u6Var = ((org.telegram.ui.ActionBar.k3) b90Var.nd).resourcesProvider;
            i11.c(parentActivity, i10, j11, currentUser, null, z10, z11, u6Var);
        }
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.kd || !this.ld) {
            return;
        }
        this.kd = true;
        MessagesController messagesController = getMessagesController();
        long j10 = this.md;
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
