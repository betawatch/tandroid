package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ko0 extends kg.z {
    public final /* synthetic */ lo0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko0(lo0 lo0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var, true, true);
        this.n = lo0Var;
    }

    @Override // kg.z, u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        TLRPC.Chat chat;
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) d1Var.a;
        oo0 oo0Var = this.n.L;
        TLRPC.User user = null;
        if (oo0Var.a2 || oo0Var.b2) {
            int i10 = org.telegram.ui.ActionBar.k6.bh;
            int i11 = org.telegram.ui.ActionBar.k6.Tg;
            org.telegram.ui.ActionBar.r6.V(o4Var.b, i10, null);
            o4Var.I = i11;
            o4Var.w.b(org.telegram.ui.ActionBar.k6.B5, i11, org.telegram.ui.ActionBar.k6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.li.b0(oo0Var.a).j1.get(i3);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            user = org.telegram.messenger.hp.s1(oo0Var.a).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = org.telegram.messenger.hp.s1(oo0Var.a).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = org.telegram.messenger.hp.s1(oo0Var.a).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z10 = j10 == o4Var.getDialogId();
        o4Var.setTag(Long.valueOf(j10));
        o4Var.a(j10, true, user != null ? org.telegram.messenger.l10.j(user, true) : chat != null ? chat.title : "");
        boolean z11 = oo0Var.N1.h(j10) >= 0;
        if (o4Var.x) {
            o4Var.w.a(z11, z10);
        }
    }
}
