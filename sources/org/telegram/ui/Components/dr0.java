package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class dr0 extends hg.b0 {
    public final /* synthetic */ er0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr0(er0 er0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, context, c6Var, true, true);
        this.n = er0Var;
    }

    @Override // hg.b0, s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) b1Var.a;
        ir0 ir0Var = this.n.K;
        TLRPC.User user = null;
        if (ir0Var.h0 || ir0Var.i0) {
            int i15 = org.telegram.ui.ActionBar.g6.ng;
            int i16 = org.telegram.ui.ActionBar.g6.fg;
            n4Var.b.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i15, false));
            n4Var.H = i16;
            n4Var.v.b(org.telegram.ui.ActionBar.g6.B5, i16, org.telegram.ui.ActionBar.g6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.e3) ir0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.e3) ir0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.e3) ir0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.e3) ir0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z10 = j10 == n4Var.getDialogId();
        n4Var.setTag(Long.valueOf(j10));
        n4Var.a(j10, user != null ? UserObject.getFirstName(user) : chat != null ? chat.title : "");
        boolean z11 = ir0Var.U.h(j10) >= 0;
        if (n4Var.w) {
            n4Var.v.a(z11, z10);
        }
    }
}
