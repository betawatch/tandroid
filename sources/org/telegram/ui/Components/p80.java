package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p80 extends org.telegram.ui.eo {
    public boolean Qc;
    public final /* synthetic */ boolean Rc;
    public final /* synthetic */ long Sc;
    public final /* synthetic */ q80 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p80(q80 q80Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Tc = q80Var;
        this.Rc = z10;
        this.Sc = j3;
        this.Qc = false;
    }

    public static void Xc(p80 p80Var, long j3, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.f6 f6Var;
        if (AndroidUtilities.isContextSafe(p80Var.getParentActivity())) {
            Activity parentActivity = p80Var.getParentActivity();
            int i10 = p80Var.currentAccount;
            long j10 = -j3;
            TLRPC.User currentUser = p80Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            f6Var = ((org.telegram.ui.ActionBar.h3) p80Var.Tc).resourcesProvider;
            n01.c(parentActivity, i10, j10, currentUser, null, z10, z11, f6Var);
        }
    }

    @Override // org.telegram.ui.eo, org.telegram.ui.ActionBar.p2
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
            pc J = wc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.h0(this, j3, chat, 15));
            J.r = false;
            J.k(true);
        } else {
            pc Q = wc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.r = false;
            Q.k(true);
        }
    }
}
