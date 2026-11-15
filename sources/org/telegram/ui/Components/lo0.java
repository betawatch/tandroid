package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class lo0 extends jg.c0 {
    public final /* synthetic */ mo0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(mo0 mo0Var, Context context, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var, true, true);
        this.n = mo0Var;
    }

    @Override // jg.c0, v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.Chat chat;
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) e1Var.a;
        po0 po0Var = this.n.L;
        TLRPC.User user = null;
        if (po0Var.d2 || po0Var.e2) {
            int i10 = org.telegram.ui.ActionBar.j6.eh;
            int i11 = org.telegram.ui.ActionBar.j6.Wg;
            org.telegram.ui.ActionBar.q6.U(o4Var.b, i10, null);
            o4Var.I = i11;
            o4Var.w.b(org.telegram.ui.ActionBar.j6.B5, i11, org.telegram.ui.ActionBar.j6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.si.b0(po0Var.a).j1.get(i7);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            user = org.telegram.messenger.np.s1(po0Var.a).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = org.telegram.messenger.np.s1(po0Var.a).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = org.telegram.messenger.np.s1(po0Var.a).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        boolean z10 = j3 == o4Var.getDialogId();
        o4Var.setTag(Long.valueOf(j3));
        o4Var.a(j3, true, user != null ? org.telegram.messenger.q10.j(user, true) : chat != null ? chat.title : "");
        boolean z11 = po0Var.Q1.h(j3) >= 0;
        if (o4Var.x) {
            o4Var.w.a(z11, z10);
        }
    }
}
