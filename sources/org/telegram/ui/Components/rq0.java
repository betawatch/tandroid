package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class rq0 extends gg.c0 {
    public final /* synthetic */ sq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(sq0 sq0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, true, true);
        this.n = sq0Var;
    }

    @Override // gg.c0, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) c1Var.a;
        wq0 wq0Var = this.n.K;
        TLRPC.User user = null;
        if (wq0Var.h0 || wq0Var.i0) {
            int i15 = org.telegram.ui.ActionBar.j6.ng;
            int i16 = org.telegram.ui.ActionBar.j6.fg;
            o4Var.b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            o4Var.H = i16;
            o4Var.v.b(org.telegram.ui.ActionBar.j6.B5, i16, org.telegram.ui.ActionBar.j6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            i14 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                i13 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    i12 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        boolean z10 = j3 == o4Var.getDialogId();
        o4Var.setTag(Long.valueOf(j3));
        o4Var.a(j3, user != null ? UserObject.getFirstName(user) : chat != null ? chat.title : "");
        boolean z11 = wq0Var.U.h(j3) >= 0;
        if (o4Var.w) {
            o4Var.v.a(z11, z10);
        }
    }
}
