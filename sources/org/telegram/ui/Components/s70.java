package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s70 extends org.telegram.ui.rn {
    public boolean Mc;
    public final /* synthetic */ boolean Nc;
    public final /* synthetic */ long Oc;
    public final /* synthetic */ t70 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s70(t70 t70Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Pc = t70Var;
        this.Nc = z10;
        this.Oc = j10;
        this.Mc = false;
    }

    public static void Xc(s70 s70Var, long j10, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (AndroidUtilities.isContextSafe(s70Var.getParentActivity())) {
            Activity parentActivity = s70Var.getParentActivity();
            int i10 = s70Var.currentAccount;
            long j11 = -j10;
            TLRPC.User currentUser = s70Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            c6Var = ((org.telegram.ui.ActionBar.e3) s70Var.Pc).resourcesProvider;
            kz0.c(parentActivity, i10, j11, currentUser, null, z10, z11, c6Var);
        }
    }

    @Override // org.telegram.ui.rn, org.telegram.ui.ActionBar.n2
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
            ec J = mc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new e5.u(this, j10, chat, 24));
            J.r = false;
            J.k(true);
        } else {
            ec Q = mc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.r = false;
            Q.k(true);
        }
    }
}
