package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class np0 extends pf.t {
    public final /* synthetic */ op0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np0(op0 op0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, context, c6Var, true, true);
        this.n = op0Var;
    }

    @Override // pf.t, f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        TLRPC.Chat chat;
        int i12;
        int i13;
        int i14;
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) o1Var.a;
        sp0 sp0Var = this.n.G;
        TLRPC.User user = null;
        if (sp0Var.d0 || sp0Var.e0) {
            int i15 = org.telegram.ui.ActionBar.g6.ng;
            int i16 = org.telegram.ui.ActionBar.g6.fg;
            k4Var.b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i15, false));
            k4Var.D = i16;
            k4Var.v.b(org.telegram.ui.ActionBar.g6.B5, i16, org.telegram.ui.ActionBar.g6.C5);
        }
        i11 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
        TLRPC.TL_topPeer tL_topPeer = MediaDataController.getInstance(i11).hints.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            i14 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                i13 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
                chat = MessagesController.getInstance(i13).getChat(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    i12 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
                    chat = MessagesController.getInstance(i12).getChat(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z10 = j10 == k4Var.getDialogId();
        k4Var.setTag(Long.valueOf(j10));
        k4Var.a(j10, user != null ? UserObject.getFirstName(user) : chat != null ? chat.title : "");
        boolean z11 = sp0Var.Q.h(j10) >= 0;
        if (k4Var.w) {
            k4Var.v.a(z11, z10);
        }
    }
}
