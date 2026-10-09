package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h90 extends org.telegram.ui.zn {
    public boolean Qc;
    public final /* synthetic */ boolean Rc;
    public final /* synthetic */ long Sc;
    public final /* synthetic */ i90 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h90(i90 i90Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Tc = i90Var;
        this.Rc = z10;
        this.Sc = j3;
        this.Qc = false;
    }

    public static void bd(h90 h90Var, long j3, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.e6 e6Var;
        if (AndroidUtilities.isContextSafe(h90Var.getParentActivity())) {
            Activity parentActivity = h90Var.getParentActivity();
            int i10 = h90Var.currentAccount;
            long j10 = -j3;
            TLRPC.User currentUser = h90Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            e6Var = ((org.telegram.ui.ActionBar.f3) h90Var.Tc).resourcesProvider;
            d11.c(parentActivity, i10, j10, currentUser, null, z10, z11, e6Var);
        }
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Qc || !this.Rc) {
            return;
        }
        this.Qc = true;
        MessagesController messagesController = getMessagesController();
        long j3 = this.Sc;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
        if (ChatObject.canManageMyTag(chat)) {
            tc J = ad.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.h0(this, j3, chat, 21));
            J.r = false;
            J.k(true);
        } else {
            tc Q = ad.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.r = false;
            Q.k(true);
        }
    }
}
