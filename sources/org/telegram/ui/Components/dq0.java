package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class dq0 extends gg.c0 {
    public final /* synthetic */ eq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq0(eq0 eq0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, true, true);
        this.n = eq0Var;
    }

    @Override // gg.c0, s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) c1Var.a;
        iq0 iq0Var = this.n.K;
        TLRPC.User user = null;
        if (iq0Var.h0 || iq0Var.i0) {
            int i15 = org.telegram.ui.ActionBar.j6.ng;
            int i16 = org.telegram.ui.ActionBar.j6.fg;
            m4Var.b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            m4Var.H = i16;
            m4Var.v.b(org.telegram.ui.ActionBar.j6.B5, i16, org.telegram.ui.ActionBar.j6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.g3) iq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            i14 = ((org.telegram.ui.ActionBar.g3) iq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                i13 = ((org.telegram.ui.ActionBar.g3) iq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    i12 = ((org.telegram.ui.ActionBar.g3) iq0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        boolean z10 = j3 == m4Var.getDialogId();
        m4Var.setTag(Long.valueOf(j3));
        m4Var.a(j3, user != null ? UserObject.getFirstName(user) : chat != null ? chat.title : "");
        boolean z11 = iq0Var.U.h(j3) >= 0;
        if (m4Var.w) {
            m4Var.v.a(z11, z10);
        }
    }
}
