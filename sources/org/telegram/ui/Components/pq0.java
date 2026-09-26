package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pq0 extends gg.c0 {
    public final /* synthetic */ qq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(qq0 qq0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, true, true);
        this.n = qq0Var;
    }

    @Override // gg.c0, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) c1Var.a;
        uq0 uq0Var = this.n.K;
        TLRPC.User user = null;
        if (uq0Var.h0 || uq0Var.i0) {
            int i15 = org.telegram.ui.ActionBar.h6.ng;
            int i16 = org.telegram.ui.ActionBar.h6.fg;
            n4Var.b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
            n4Var.H = i16;
            n4Var.v.b(org.telegram.ui.ActionBar.h6.B5, i16, org.telegram.ui.ActionBar.h6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            i14 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                i13 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    i12 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        boolean z10 = j3 == n4Var.getDialogId();
        n4Var.setTag(Long.valueOf(j3));
        n4Var.a(j3, user != null ? UserObject.getFirstName(user) : chat != null ? chat.title : "");
        boolean z11 = uq0Var.U.h(j3) >= 0;
        if (n4Var.w) {
            n4Var.v.a(z11, z10);
        }
    }
}
