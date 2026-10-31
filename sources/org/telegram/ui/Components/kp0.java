package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kp0 extends zf.u {
    public final /* synthetic */ lp0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp0(lp0 lp0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var, true, true);
        this.n = lp0Var;
    }

    @Override // zf.u, s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) c1Var.a;
        op0 op0Var = this.n.K;
        TLRPC.User user = null;
        if (op0Var.Z1 || op0Var.a2) {
            int i11 = org.telegram.ui.ActionBar.t6.bh;
            int i12 = org.telegram.ui.ActionBar.t6.Tg;
            org.telegram.ui.ActionBar.a7.V(q4Var.b, i11, null);
            q4Var.H = i12;
            q4Var.w.b(org.telegram.ui.ActionBar.t6.B5, i12, org.telegram.ui.ActionBar.t6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ui.b0(op0Var.a).i1.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            user = org.telegram.messenger.vp.r1(op0Var.a).Z1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = org.telegram.messenger.vp.r1(op0Var.a).L0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = org.telegram.messenger.vp.r1(op0Var.a).L0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z10 = j10 == q4Var.getDialogId();
        q4Var.setTag(Long.valueOf(j10));
        q4Var.a(j10, true, user != null ? org.telegram.messenger.h20.j(user, true) : chat != null ? chat.title : "");
        boolean z11 = op0Var.M1.h(j10) >= 0;
        if (q4Var.x) {
            q4Var.w.a(z11, z10);
        }
    }
}
