package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class gq0 extends tf.t {
    public final /* synthetic */ hq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq0(hq0 hq0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, true, true);
        this.n = hq0Var;
    }

    @Override // tf.t, f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) l1Var.a;
        lq0 lq0Var = this.n.H;
        TLRPC.User user = null;
        if (lq0Var.e0 || lq0Var.f0) {
            int i15 = org.telegram.ui.ActionBar.j6.ng;
            int i16 = org.telegram.ui.ActionBar.j6.fg;
            m4Var.b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            m4Var.E = i16;
            m4Var.v.b(org.telegram.ui.ActionBar.j6.B5, i16, org.telegram.ui.ActionBar.j6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z4 = j10 == m4Var.getDialogId();
        m4Var.setTag(Long.valueOf(j10));
        m4Var.a(j10, user != null ? UserObject.getFirstName(user) : chat != null ? chat.title : "");
        boolean z10 = lq0Var.R.h(j10) >= 0;
        if (m4Var.w) {
            m4Var.v.a(z10, z4);
        }
    }
}
