package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yp0 extends rf.u {
    public final /* synthetic */ zp0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp0(zp0 zp0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, context, c6Var, true, true);
        this.n = zp0Var;
    }

    @Override // rf.u, f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) n1Var.a;
        dq0 dq0Var = this.n.G;
        TLRPC.User user = null;
        if (dq0Var.d0 || dq0Var.e0) {
            int i15 = org.telegram.ui.ActionBar.g6.ng;
            int i16 = org.telegram.ui.ActionBar.g6.fg;
            l4Var.b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            l4Var.D = i16;
            l4Var.v.b(org.telegram.ui.ActionBar.g6.B5, i16, org.telegram.ui.ActionBar.g6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z10 = j10 == l4Var.getDialogId();
        l4Var.setTag(Long.valueOf(j10));
        l4Var.a(j10, user != null ? UserObject.getFirstName(user) : chat != null ? chat.title : "");
        boolean z11 = dq0Var.Q.h(j10) >= 0;
        if (l4Var.w) {
            l4Var.v.a(z11, z10);
        }
    }
}
