package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class i80 extends org.telegram.ui.xn {
    public boolean Nc;
    public final /* synthetic */ boolean Oc;
    public final /* synthetic */ long Pc;
    public final /* synthetic */ j80 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i80(j80 j80Var, Bundle bundle, boolean z4, long j10) {
        super(bundle);
        this.Qc = j80Var;
        this.Oc = z4;
        this.Pc = j10;
        this.Nc = false;
    }

    public static void Xc(i80 i80Var, long j10, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.g6 g6Var;
        if (AndroidUtilities.isContextSafe(i80Var.getParentActivity())) {
            Activity parentActivity = i80Var.getParentActivity();
            int i10 = i80Var.currentAccount;
            long j11 = -j10;
            TLRPC.User currentUser = i80Var.getUserConfig().getCurrentUser();
            boolean z4 = chat.admin_rights != null;
            boolean z10 = chat.creator;
            g6Var = ((org.telegram.ui.ActionBar.h3) i80Var.Qc).resourcesProvider;
            g01.c(parentActivity, i10, j11, currentUser, null, z4, z10, g6Var);
        }
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Nc || !this.Oc) {
            return;
        }
        this.Nc = true;
        MessagesController messagesController = getMessagesController();
        long j10 = this.Pc;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
        if (ChatObject.canManageMyTag(chat)) {
            ic J = qc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new i5.v(this, j10, chat, 22));
            J.r = false;
            J.k(true);
        } else {
            ic Q = qc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.r = false;
            Q.k(true);
        }
    }
}
