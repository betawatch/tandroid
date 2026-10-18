package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class z80 extends org.telegram.ui.sn {
    public boolean Qc;
    public final /* synthetic */ boolean Rc;
    public final /* synthetic */ long Sc;
    public final /* synthetic */ a90 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(a90 a90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Tc = a90Var;
        this.Rc = z10;
        this.Sc = j10;
        this.Qc = false;
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
            d6Var = ((org.telegram.ui.ActionBar.f3) z80Var.Tc).resourcesProvider;
            v01.c(parentActivity, i10, j11, currentUser, null, z10, z11, d6Var);
        }
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Qc || !this.Rc) {
            return;
        }
        this.Qc = true;
        MessagesController messagesController = getMessagesController();
        long j10 = this.Sc;
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
