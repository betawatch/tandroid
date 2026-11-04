package kg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class z extends sj0 {
    public final Context c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final e6 h;

    public z(int i3, Context context, e6 e6Var, boolean z10, boolean z11) {
        this.e = z10;
        this.c = context;
        this.d = i3;
        this.f = z11;
        this.h = e6Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        return li.b0(this.d).j1.size();
    }

    @Override // u4.h0
    public void t(u4.d1 d1Var, int i3) {
        TLRPC.Chat chat;
        o4 o4Var = (o4) d1Var.a;
        int i10 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) li.b0(i10).j1.get(i3);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        TLRPC.User user = null;
        if (j10 != 0) {
            user = hp.s1(i10).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = hp.s1(i10).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = hp.s1(i10).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j10 = 0;
                    chat = null;
                }
            }
        }
        o4Var.setTag(Long.valueOf(j10));
        o4Var.a(j10, true, user != null ? l10.j(user, true) : chat != null ? chat.monoforum ? rg.c.i(i10, chat, false) : chat.title : "");
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        boolean z10 = this.e;
        o4 o4Var = new o4(this.c, this.h, z10);
        if (this.f && !o4Var.y) {
            o4Var.y = true;
            hs.f(o4Var.h).h(o4Var, hs.i3, new l2(o4Var, 1));
        }
        o4Var.setLayoutParams(new u4.p0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(86.0f)));
        return new bj0(o4Var);
    }
}
