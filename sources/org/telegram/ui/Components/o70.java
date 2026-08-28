package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o70 extends org.telegram.ui.qn {
    public boolean Mc;
    public final /* synthetic */ boolean Nc;
    public final /* synthetic */ long Oc;
    public final /* synthetic */ p70 Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(p70 p70Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Pc = p70Var;
        this.Nc = z10;
        this.Oc = j10;
        this.Mc = false;
    }

    public static void Xc(o70 o70Var, long j10, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.b6 b6Var;
        if (AndroidUtilities.isContextSafe(o70Var.getParentActivity())) {
            Activity parentActivity = o70Var.getParentActivity();
            int i9 = o70Var.currentAccount;
            long j11 = -j10;
            TLRPC.User currentUser = o70Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            b6Var = ((org.telegram.ui.ActionBar.f3) o70Var.Pc).resourcesProvider;
            iz0.c(parentActivity, i9, j11, currentUser, null, z10, z11, b6Var);
        }
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.o2
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
            gc J = oc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new e5.w(this, j10, chat, 24));
            J.r = false;
            J.k(true);
        } else {
            gc Q = oc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.r = false;
            Q.k(true);
        }
    }
}
