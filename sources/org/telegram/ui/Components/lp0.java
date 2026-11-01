package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lp0 extends zf.u {
    public final /* synthetic */ mp0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp0(mp0 mp0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var, true, true);
        this.n = mp0Var;
    }

    @Override // zf.u, s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Chat chat;
        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) c1Var.a;
        pp0 pp0Var = this.n.K;
        TLRPC.User user = null;
        if (pp0Var.Z1 || pp0Var.a2) {
            int i11 = org.telegram.ui.ActionBar.t6.bh;
            int i12 = org.telegram.ui.ActionBar.t6.Tg;
            org.telegram.ui.ActionBar.a7.V(q4Var.b, i11, null);
            q4Var.H = i12;
            q4Var.w.b(org.telegram.ui.ActionBar.t6.B5, i12, org.telegram.ui.ActionBar.t6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.vi.b0(pp0Var.a).i1.get(i10);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        if (j10 != 0) {
            user = org.telegram.messenger.wp.r1(pp0Var.a).Z1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = org.telegram.messenger.wp.r1(pp0Var.a).L0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = org.telegram.messenger.wp.r1(pp0Var.a).L0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j10 = 0;
                }
            }
        }
        boolean z10 = j10 == q4Var.getDialogId();
        q4Var.setTag(Long.valueOf(j10));
        q4Var.a(j10, true, user != null ? org.telegram.messenger.i20.j(user, true) : chat != null ? chat.title : "");
        boolean z11 = pp0Var.M1.h(j10) >= 0;
        if (q4Var.x) {
            q4Var.w.a(z11, z10);
        }
    }
}
