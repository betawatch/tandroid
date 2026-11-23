package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class vo0 extends jg.c0 {
    public final /* synthetic */ wo0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(wo0 wo0Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var, true, true);
        this.n = wo0Var;
    }

    @Override // jg.c0, v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat;
        org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) f1Var.a;
        zo0 zo0Var = this.n.L;
        TLRPC.User user = null;
        if (zo0Var.d2 || zo0Var.e2) {
            int i10 = org.telegram.ui.ActionBar.n6.eh;
            int i11 = org.telegram.ui.ActionBar.n6.Wg;
            org.telegram.ui.ActionBar.u6.U(p4Var.b, i10, null);
            p4Var.I = i11;
            p4Var.w.b(org.telegram.ui.ActionBar.n6.B5, i11, org.telegram.ui.ActionBar.n6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ri.d0(zo0Var.a).j1.get(i7);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            user = org.telegram.messenger.mp.u1(zo0Var.a).c2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = org.telegram.messenger.mp.u1(zo0Var.a).O0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = org.telegram.messenger.mp.u1(zo0Var.a).O0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        boolean z10 = j3 == p4Var.getDialogId();
        p4Var.setTag(Long.valueOf(j3));
        p4Var.a(j3, true, user != null ? org.telegram.messenger.n10.k(user, true) : chat != null ? chat.title : "");
        boolean z11 = zo0Var.Q1.h(j3) >= 0;
        if (p4Var.x) {
            p4Var.w.a(z11, z10);
        }
    }
}
