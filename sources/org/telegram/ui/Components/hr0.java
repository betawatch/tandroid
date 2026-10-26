package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hr0 extends ig.b0 {
    public final /* synthetic */ ir0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr0(ir0 ir0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, context, u6Var, true, true);
        this.n = ir0Var;
    }

    @Override // ig.b0, s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Cells.r4 r4Var = (org.telegram.ui.Cells.r4) e1Var.a;
        mr0 mr0Var = this.n.K;
        TLRPC.User user = null;
        if (mr0Var.i0 || mr0Var.j0) {
            int i15 = org.telegram.ui.ActionBar.y6.ng;
            int i16 = org.telegram.ui.ActionBar.y6.fg;
            org.telegram.ui.ActionBar.f7.V(r4Var.b, i15, null);
            r4Var.H = i16;
            r4Var.v.b(org.telegram.ui.ActionBar.y6.B5, i16, org.telegram.ui.ActionBar.y6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z10 = j10 == r4Var.getDialogId();
        r4Var.setTag(Long.valueOf(j10));
        r4Var.a(j10, true, user != null ? UserObject.getFirstName(user) : chat != null ? chat.title : "");
        boolean z11 = mr0Var.V.h(j10) >= 0;
        if (r4Var.w) {
            r4Var.v.a(z11, z10);
        }
    }
}
