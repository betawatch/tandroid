package hi;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class t7 extends tj0 {
    public final /* synthetic */ u7 c;

    public t7(u7 u7Var) {
        this.c = u7Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 2;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.n1.size() + 2;
    }

    @Override // v4.h0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return i7 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        u7 u7Var = this.c;
        int i10 = u7Var.m1;
        if (e1Var.f == 2) {
            p8 p8Var = (p8) e1Var.a;
            p8Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) u7Var.n1.get(i7 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                p8Var.setUser(m10.i(i10).f());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                p8Var.setUser(np.s1(i10).a2(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                p8Var.a(0, np.s1(i10).M0(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                p8Var.a(0, np.s1(i10).M0(Long.valueOf(inputPeer.channel_id)));
            }
            p8Var.f.setVisibility(8);
            p8Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = u7Var.o1;
            if (inputPeer2 != null || i7 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? m10.i(u7Var.m1).e() : org.telegram.messenger.m5.n(inputPeer2)) != (z11 ? m10.i(u7Var.m1).e() : org.telegram.messenger.m5.n(inputPeer))) {
                    z10 = false;
                    p8Var.c(z10, false);
                    p8Var.setDivider(i7 != b() - 1);
                }
            }
            z10 = true;
            p8Var.c(z10, false);
            p8Var.setDivider(i7 != b() - 1);
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        u7 u7Var = this.c;
        if (i7 == 0 || i7 == 1) {
            View view2 = new View(u7Var.getContext());
            view2.setLayoutParams(new v4.p0(-1, i7 == 0 ? (org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(306.0f) : org.telegram.messenger.g0.L(54.0f)));
            view = view2;
        } else {
            view = new p8(u7Var.getContext(), u7Var.J0);
        }
        return new cj0(view);
    }
}
