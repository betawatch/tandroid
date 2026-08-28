package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mp0 extends of.z {
    public final /* synthetic */ np0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp0(np0 np0Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, context, b6Var, true, true);
        this.n = np0Var;
    }

    @Override // of.z, f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        TLRPC.Chat chat;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) q1Var.a;
        rp0 rp0Var = this.n.G;
        TLRPC.User user = null;
        if (rp0Var.d0 || rp0Var.e0) {
            int i14 = org.telegram.ui.ActionBar.f6.ng;
            int i15 = org.telegram.ui.ActionBar.f6.fg;
            n4Var.b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i14, false));
            n4Var.D = i15;
            n4Var.v.b(org.telegram.ui.ActionBar.f6.B5, i15, org.telegram.ui.ActionBar.f6.C5);
        }
        i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i10).hints.get(i9);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i13 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
            user = MessagesController.getInstance(i13).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i12 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i11 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z10 = j10 == n4Var.getDialogId();
        n4Var.setTag(Long.valueOf(j10));
        n4Var.a(j10, user != null ? UserObject.getFirstName(user) : chat != null ? chat.title : "");
        boolean z11 = rp0Var.Q.h(j10) >= 0;
        if (n4Var.w) {
            n4Var.v.a(z11, z10);
        }
    }
}
