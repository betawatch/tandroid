package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class z80 extends org.telegram.ui.sn {
    public boolean Rc;
    public final /* synthetic */ boolean Sc;
    public final /* synthetic */ long Tc;
    public final /* synthetic */ a90 Uc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(a90 a90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Uc = a90Var;
        this.Sc = z10;
        this.Tc = j10;
        this.Rc = false;
    }

    public static void bd(z80 z80Var, long j10, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.d6 d6Var;
        if (AndroidUtilities.isContextSafe(z80Var.getParentActivity())) {
            Activity parentActivity = z80Var.getParentActivity();
            int i10 = z80Var.currentAccount;
            long j11 = -j10;
            TLRPC.User currentUser = z80Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            d6Var = ((org.telegram.ui.ActionBar.f3) z80Var.Uc).resourcesProvider;
            v01.c(parentActivity, i10, j11, currentUser, null, z10, z11, d6Var);
        }
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Rc || !this.Sc) {
            return;
        }
        this.Rc = true;
        MessagesController messagesController = getMessagesController();
        long j10 = this.Tc;
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
