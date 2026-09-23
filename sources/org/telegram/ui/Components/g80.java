package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class g80 extends org.telegram.ui.xn {
    public boolean Pc;
    public final /* synthetic */ boolean Qc;
    public final /* synthetic */ long Rc;
    public final /* synthetic */ h80 Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g80(h80 h80Var, Bundle bundle, boolean z10, long j3) {
        super(bundle);
        this.Sc = h80Var;
        this.Qc = z10;
        this.Rc = j3;
        this.Pc = false;
    }

    public static void Xc(g80 g80Var, long j3, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.d6 d6Var;
        if (AndroidUtilities.isContextSafe(g80Var.getParentActivity())) {
            Activity parentActivity = g80Var.getParentActivity();
            int i10 = g80Var.currentAccount;
            long j10 = -j3;
            TLRPC.User currentUser = g80Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            d6Var = ((org.telegram.ui.ActionBar.f3) g80Var.Sc).resourcesProvider;
            a01.c(parentActivity, i10, j10, currentUser, null, z10, z11, d6Var);
        }
    }

    @Override // org.telegram.ui.xn, org.telegram.ui.ActionBar.n2
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
