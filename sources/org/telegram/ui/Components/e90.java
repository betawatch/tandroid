package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class e90 extends org.telegram.ui.fo {
    public boolean Qc;
    public final /* synthetic */ boolean Rc;
    public final /* synthetic */ long Sc;
    public final /* synthetic */ f90 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e90(f90 f90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Tc = f90Var;
        this.Rc = z10;
        this.Sc = j10;
        this.Qc = false;
    }

    public static void bd(e90 e90Var, long j10, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (AndroidUtilities.isContextSafe(e90Var.getParentActivity())) {
            Activity parentActivity = e90Var.getParentActivity();
            int i10 = e90Var.currentAccount;
            long j11 = -j10;
            TLRPC.User currentUser = e90Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            c6Var = ((org.telegram.ui.ActionBar.e3) e90Var.Tc).resourcesProvider;
            a11.c(parentActivity, i10, j11, currentUser, null, z10, z11, c6Var);
        }
    }

    @Override // org.telegram.ui.fo, org.telegram.ui.ActionBar.m2
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
            sc J = zc.a0(this).J(R.raw.contact_check, LocaleController.getString(R.string.JoinedGroup), LocaleController.getString(R.string.JoinedGroupAddTag), new a3.i0(this, j10, chat, 20));
            J.r = false;
            J.k(true);
        } else {
            sc Q = zc.a0(this).Q(R.raw.contact_check, 36, LocaleController.getString(R.string.JoinedGroup));
            Q.r = false;
            Q.k(true);
        }
    }
}
