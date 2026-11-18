package jg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class c0 extends bk0 {
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

    @Override // org.telegram.ui.Components.bk0
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
        o4 o4Var = (o4) f1Var.a;
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
        o4Var.setTag(Long.valueOf(j3));
        o4Var.a(j3, true, user != null ? o10.k(user, true) : chat != null ? chat.monoforum ? qg.c.j(i10, chat, false) : chat.title : "");
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10 = this.e;
        o4 o4Var = new o4(this.c, this.h, z10);
        if (this.f && !o4Var.y) {
            o4Var.y = true;
            ks.f(o4Var.h).h(o4Var, ks.k3, new l2(o4Var, 1));
        }
        o4Var.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(86.0f)));
        return new kj0(o4Var);
    }
}
