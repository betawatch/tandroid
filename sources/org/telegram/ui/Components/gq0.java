package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gq0 extends uf.t {
    public final /* synthetic */ hq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq0(hq0 hq0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, context, g6Var, true, true);
        this.n = hq0Var;
    }

    @Override // uf.t, f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) m1Var.a;
        lq0 lq0Var = this.n.H;
        TLRPC.User user = null;
        if (lq0Var.e0 || lq0Var.f0) {
            int i15 = org.telegram.ui.ActionBar.k6.ng;
            int i16 = org.telegram.ui.ActionBar.k6.fg;
            n4Var.b.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
            n4Var.E = i16;
            n4Var.v.b(org.telegram.ui.ActionBar.k6.B5, i16, org.telegram.ui.ActionBar.k6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.h3) lq0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z4 = j10 == n4Var.getDialogId();
        n4Var.setTag(Long.valueOf(j10));
        n4Var.a(j10, user != null ? UserObject.getFirstName(user) : chat != null ? chat.title : "");
        boolean z10 = lq0Var.R.h(j10) >= 0;
        if (n4Var.w) {
            n4Var.v.a(z10, z4);
        }
    }
}
