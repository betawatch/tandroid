package org.telegram.ui.Components;

import android.app.Activity;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class f90 extends org.telegram.ui.fo {
    public boolean Qc;
    public final /* synthetic */ boolean Rc;
    public final /* synthetic */ long Sc;
    public final /* synthetic */ g90 Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f90(g90 g90Var, Bundle bundle, boolean z10, long j10) {
        super(bundle);
        this.Tc = g90Var;
        this.Rc = z10;
        this.Sc = j10;
        this.Qc = false;
    }

    public static void bd(f90 f90Var, long j10, TLRPC.Chat chat) {
        org.telegram.ui.ActionBar.c6 c6Var;
        if (AndroidUtilities.isContextSafe(f90Var.getParentActivity())) {
            Activity parentActivity = f90Var.getParentActivity();
            int i10 = f90Var.currentAccount;
            long j11 = -j10;
            TLRPC.User currentUser = f90Var.getUserConfig().getCurrentUser();
            boolean z10 = chat.admin_rights != null;
            boolean z11 = chat.creator;
            c6Var = ((org.telegram.ui.ActionBar.e3) f90Var.Tc).resourcesProvider;
            z01.c(parentActivity, i10, j11, currentUser, null, z10, z11, c6Var);
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
