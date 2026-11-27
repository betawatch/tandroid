// default package

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class ol3 extends c79 {
    public final Context c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final vnb h;

    public ol3(int i, vnb vnbVar, Context context, boolean z, boolean z2) {
        this.e = z;
        this.c = context;
        this.d = i;
        this.f = z2;
        this.h = vnbVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override // j79
    public final int b() {
        return ls6.d0(this.d).j1.size();
    }

    @Override // j79
    public void t(f89 f89Var, int i) {
        TLRPC.Chat chat;
        fg5 fg5Var = (fg5) f89Var.a;
        int i2 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) ls6.d0(i2).j1.get(i);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j = peer.user_id;
        TLRPC.User user = null;
        if (j != 0) {
            user = uc7.s1(i2).X1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j2 = peer.channel_id;
            if (j2 != 0) {
                j = -j2;
                chat = uc7.s1(i2).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j3 = peer.chat_id;
                if (j3 != 0) {
                    j = -j3;
                    chat = uc7.s1(i2).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j = 0;
                    chat = null;
                }
            }
        }
        fg5Var.setTag(Long.valueOf(j));
        fg5Var.a(j, true, user != null ? lbc.k(user, true) : chat != null ? chat.monoforum ? ro4.j(i2, chat, false) : chat.title : "");
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        fg5 fg5Var = new fg5(this.h, this.c, this.e);
        if (this.f && !fg5Var.y) {
            fg5Var.y = true;
            jn7.f(fg5Var.h).h(fg5Var, jn7.k3, new zj3(fg5Var, (byte) 17));
        }
        fg5Var.setLayoutParams(new r79(hl.L(80.0f), hl.L(86.0f)));
        return new n69(fg5Var);
    }
}
