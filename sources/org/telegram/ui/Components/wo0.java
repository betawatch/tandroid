package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class wo0 extends jg.c0 {
    public final /* synthetic */ xo0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(xo0 xo0Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var, true, true);
        this.n = xo0Var;
    }

    @Override // jg.c0, v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat;
        org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) f1Var.a;
        ap0 ap0Var = this.n.L;
        TLRPC.User user = null;
        if (ap0Var.d2 || ap0Var.e2) {
            int i10 = org.telegram.ui.ActionBar.m6.eh;
            int i11 = org.telegram.ui.ActionBar.m6.Wg;
            org.telegram.ui.ActionBar.t6.U(p4Var.b, i10, null);
            p4Var.I = i11;
            p4Var.w.b(org.telegram.ui.ActionBar.m6.B5, i11, org.telegram.ui.ActionBar.m6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.si.d0(ap0Var.a).j1.get(i7);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            user = org.telegram.messenger.np.u1(ap0Var.a).c2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = org.telegram.messenger.np.u1(ap0Var.a).O0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = org.telegram.messenger.np.u1(ap0Var.a).O0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        boolean z10 = j3 == p4Var.getDialogId();
        p4Var.setTag(Long.valueOf(j3));
        p4Var.a(j3, true, user != null ? org.telegram.messenger.p10.k(user, true) : chat != null ? chat.title : "");
        boolean z11 = ap0Var.Q1.h(j3) >= 0;
        if (p4Var.x) {
            p4Var.w.a(z11, z10);
        }
    }
}
