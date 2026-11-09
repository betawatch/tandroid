package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jo0 extends jg.c0 {
    public final /* synthetic */ ko0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo0(ko0 ko0Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var, true, true);
        this.n = ko0Var;
    }

    @Override // jg.c0, v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Chat chat;
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) d1Var.a;
        no0 no0Var = this.n.K;
        TLRPC.User user = null;
        if (no0Var.Z1 || no0Var.a2) {
            int i10 = org.telegram.ui.ActionBar.l6.bh;
            int i11 = org.telegram.ui.ActionBar.l6.Tg;
            org.telegram.ui.ActionBar.s6.U(o4Var.b, i10, null);
            o4Var.H = i11;
            o4Var.w.b(org.telegram.ui.ActionBar.l6.B5, i11, org.telegram.ui.ActionBar.l6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ui.b0(no0Var.a).i1.get(i7);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            user = org.telegram.messenger.qp.s1(no0Var.a).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = org.telegram.messenger.qp.s1(no0Var.a).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = org.telegram.messenger.qp.s1(no0Var.a).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        boolean z9 = j3 == o4Var.getDialogId();
        o4Var.setTag(Long.valueOf(j3));
        o4Var.a(j3, true, user != null ? org.telegram.messenger.t10.j(user, true) : chat != null ? chat.title : "");
        boolean z10 = no0Var.M1.h(j3) >= 0;
        if (o4Var.x) {
            o4Var.w.a(z10, z9);
        }
    }
}
