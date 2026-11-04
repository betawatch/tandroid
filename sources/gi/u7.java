package gi;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u7 extends sj0 {
    public final /* synthetic */ v7 c;

    public u7(v7 v7Var) {
        this.c = v7Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 2;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.k1.size() + 2;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 0;
        }
        return i3 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        v7 v7Var = this.c;
        int i10 = v7Var.j1;
        if (d1Var.f == 2) {
            s8 s8Var = (s8) d1Var.a;
            s8Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) v7Var.k1.get(i3 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                s8Var.setUser(h10.i(i10).f());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                s8Var.setUser(hp.s1(i10).a2(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                s8Var.a(0, hp.s1(i10).M0(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                s8Var.a(0, hp.s1(i10).M0(Long.valueOf(inputPeer.channel_id)));
            }
            s8Var.f.setVisibility(8);
            s8Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = v7Var.l1;
            if (inputPeer2 != null || i3 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? h10.i(v7Var.j1).e() : org.telegram.messenger.m5.n(inputPeer2)) != (z11 ? h10.i(v7Var.j1).e() : org.telegram.messenger.m5.n(inputPeer))) {
                    z10 = false;
                    s8Var.c(z10, false);
                    s8Var.setDivider(i3 != b() - 1);
                }
            }
            z10 = true;
            s8Var.c(z10, false);
            s8Var.setDivider(i3 != b() - 1);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        v7 v7Var = this.c;
        if (i3 == 0 || i3 == 1) {
            View view2 = new View(v7Var.getContext());
            view2.setLayoutParams(new u4.p0(-1, i3 == 0 ? (org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(306.0f) : org.telegram.messenger.g0.L(54.0f)));
            view = view2;
        } else {
            view = new s8(v7Var.getContext(), v7Var.J0);
        }
        return new bj0(view);
    }
}
