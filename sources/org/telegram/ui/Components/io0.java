package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class io0 extends jg.c0 {
    public final /* synthetic */ jo0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io0(jo0 jo0Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var, true, true);
        this.n = jo0Var;
    }

    @Override // jg.c0, v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Chat chat;
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) d1Var.a;
        mo0 mo0Var = this.n.K;
        TLRPC.User user = null;
        if (mo0Var.Z1 || mo0Var.a2) {
            int i10 = org.telegram.ui.ActionBar.k6.bh;
            int i11 = org.telegram.ui.ActionBar.k6.Tg;
            org.telegram.ui.ActionBar.r6.V(o4Var.b, i10, null);
            o4Var.H = i11;
            o4Var.w.b(org.telegram.ui.ActionBar.k6.B5, i11, org.telegram.ui.ActionBar.k6.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) org.telegram.messenger.ui.b0(mo0Var.a).i1.get(i7);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        if (j3 != 0) {
            user = org.telegram.messenger.qp.s1(mo0Var.a).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = org.telegram.messenger.qp.s1(mo0Var.a).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = org.telegram.messenger.qp.s1(mo0Var.a).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j3 = 0;
                }
            }
        }
        boolean z9 = j3 == o4Var.getDialogId();
        o4Var.setTag(Long.valueOf(j3));
        o4Var.a(j3, true, user != null ? org.telegram.messenger.t10.j(user, true) : chat != null ? chat.title : "");
        boolean z10 = mo0Var.M1.h(j3) >= 0;
        if (o4Var.x) {
            o4Var.w.a(z10, z9);
        }
    }
}
