package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class yq0 extends hg.b0 {
    public final /* synthetic */ zq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq0(zq0 zq0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, true, true);
        this.n = zq0Var;
    }

    @Override // hg.b0, s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) b1Var.a;
        dr0 dr0Var = this.n.K;
        TLRPC.User user = null;
        if (dr0Var.h0 || dr0Var.i0) {
            int i15 = org.telegram.ui.ActionBar.h6.ng;
            int i16 = org.telegram.ui.ActionBar.h6.fg;
            m4Var.b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
            m4Var.H = i16;
            m4Var.v.b(org.telegram.ui.ActionBar.h6.B5, i16, org.telegram.ui.ActionBar.h6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.f3) dr0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.f3) dr0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.f3) dr0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.f3) dr0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z10 = j10 == m4Var.getDialogId();
        m4Var.setTag(Long.valueOf(j10));
        m4Var.a(j10, user != null ? UserObject.getFirstName(user) : chat != null ? chat.title : "");
        boolean z11 = dr0Var.U.h(j10) >= 0;
        if (m4Var.w) {
            m4Var.v.a(z11, z10);
        }
    }
}
