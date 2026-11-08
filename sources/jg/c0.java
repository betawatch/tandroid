package jg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class c0 extends oj0 {
    public final Context c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final f6 h;

    public c0(int i7, Context context, f6 f6Var, boolean z9, boolean z10) {
        this.e = z9;
        this.c = context;
        this.d = i7;
        this.f = z10;
        this.h = f6Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return ui.b0(this.d).i1.size();
    }

    @Override // v4.g0
    public void t(v4.d1 d1Var, int i7) {
        TLRPC.Chat chat;
        o4 o4Var = (o4) d1Var.a;
        int i10 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) ui.b0(i10).i1.get(i7);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        TLRPC.User user = null;
        if (j3 != 0) {
            user = qp.s1(i10).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = qp.s1(i10).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = qp.s1(i10).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j3 = 0;
                    chat = null;
                }
            }
        }
        o4Var.setTag(Long.valueOf(j3));
        o4Var.a(j3, true, user != null ? t10.j(user, true) : chat != null ? chat.monoforum ? qg.d.i(i10, chat, false) : chat.title : "");
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        boolean z9 = this.e;
        o4 o4Var = new o4(this.c, this.h, z9);
        if (this.f && !o4Var.y) {
            o4Var.y = true;
            qs.f(o4Var.h).h(o4Var, qs.i3, new l2(o4Var, 1));
        }
        o4Var.setLayoutParams(new v4.o0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(86.0f)));
        return new xi0(o4Var);
    }
}
