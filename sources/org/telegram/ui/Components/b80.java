package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b80 extends org.telegram.ui.tn {
    public boolean Mc;
    public final /* synthetic */ boolean Nc;
    public final /* synthetic */ long Oc;
    public final /* synthetic */ c80 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b80(c80 c80Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Pc = c80Var;
        this.Nc = z10;
        this.Oc = j10;
        this.Mc = false;
    }

    public static void Xc(b80 b80Var, long j10, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (AndroidUtilities.isContextSafe(b80Var.getParentActivity())) {
            Activity parentActivity = b80Var.getParentActivity();
            int i10 = b80Var.currentAccount;
            long j11 = -j10;
            TLRPC.User currentUser = b80Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            c6Var = ((org.telegram.ui.ActionBar.f3) b80Var.Pc).resourcesProvider;
            uz0.c(parentActivity, i10, j11, currentUser, null, z10, z11, c6Var);
        }
    }

    @Override // org.telegram.ui.tn, org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Mc || !this.Nc) {
            return;
        }
        this.Mc = true;
        MessagesController messagesController = getMessagesController();
        long j10 = this.Oc;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.canManageMyTag(chat)) {
            mc J = tc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new g5.v(this, j10, chat, 23));
            J.r = false;
            J.k(true);
        } else {
            mc Q = tc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.r = false;
            Q.k(true);
        }
    }
}
