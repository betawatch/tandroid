package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class cq0 extends gg.c0 {
    public final /* synthetic */ dq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq0(dq0 dq0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, true, true);
        this.n = dq0Var;
    }

    @Override // gg.c0, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) c1Var.a;
        hq0 hq0Var = this.n.K;
        TLRPC.User user = null;
        if (hq0Var.h0 || hq0Var.i0) {
            int i15 = org.telegram.ui.ActionBar.h6.ng;
            int i16 = org.telegram.ui.ActionBar.h6.fg;
            n4Var.b.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i15, false));
            n4Var.H = i16;
            n4Var.v.b(org.telegram.ui.ActionBar.h6.B5, i16, org.telegram.ui.ActionBar.h6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            i14 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                i13 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    i12 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
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
        boolean z11 = hq0Var.U.h(j3) >= 0;
        if (n4Var.w) {
            n4Var.v.a(z11, z10);
        }
    }
}
