package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class o80 extends org.telegram.ui.zn {
    public boolean Pc;
    public final /* synthetic */ boolean Qc;
    public final /* synthetic */ long Rc;
    public final /* synthetic */ p80 Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(p80 p80Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Sc = p80Var;
        this.Qc = z10;
        this.Rc = j3;
        this.Pc = false;
    }

    public static void Xc(o80 o80Var, long j3, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (AndroidUtilities.isContextSafe(o80Var.getParentActivity())) {
            Activity parentActivity = o80Var.getParentActivity();
            int i10 = o80Var.currentAccount;
            long j10 = -j3;
            TLRPC.User currentUser = o80Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            e6Var = ((org.telegram.ui.ActionBar.f3) o80Var.Sc).resourcesProvider;
            n01.c(parentActivity, i10, j10, currentUser, null, z10, z11, e6Var);
        }
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Pc || !this.Qc) {
            return;
        }
        this.Pc = true;
        MessagesController messagesController = getMessagesController();
        long j3 = this.Rc;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        if (ChatObject.canManageMyTag(chat)) {
            qc J = xc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.h0(this, j3, chat, 21));
            J.r = false;
            J.k(true);
        } else {
            qc Q = xc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.r = false;
            Q.k(true);
        }
    }
}
