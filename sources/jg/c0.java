package jg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class c0 extends dk0 {
    public final Context c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final i6 h;

    public c0(int i7, Context context, i6 i6Var, boolean z10, boolean z11) {
        this.e = z10;
        this.c = context;
        this.d = i7;
        this.f = z11;
        this.h = i6Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return ri.d0(this.d).j1.size();
    }

    @Override // v4.i0
    public void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat;
        p4 p4Var = (p4) f1Var.a;
        int i10 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) ri.d0(i10).j1.get(i7);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        TLRPC.User user = null;
        if (j3 != 0) {
            user = mp.u1(i10).c2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = mp.u1(i10).O0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = mp.u1(i10).O0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j3 = 0;
                    chat = null;
                }
            }
        }
        p4Var.setTag(Long.valueOf(j3));
        p4Var.a(j3, true, user != null ? n10.k(user, true) : chat != null ? chat.monoforum ? qg.c.j(i10, chat, false) : chat.title : "");
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10 = this.e;
        p4 p4Var = new p4(this.c, this.h, z10);
        if (this.f && !p4Var.y) {
            p4Var.y = true;
            ks.f(p4Var.h).h(p4Var, ks.k3, new m2(p4Var, 1));
        }
        p4Var.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(86.0f)));
        return new mj0(p4Var);
    }
}
