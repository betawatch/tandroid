package hi;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.kj0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class t7 extends bk0 {
    public final /* synthetic */ u7 c;

    public t7(u7 u7Var) {
        this.c = u7Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f == 2;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.n1.size() + 2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return i7 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        u7 u7Var = this.c;
        int i10 = u7Var.m1;
        if (f1Var.f == 2) {
            p8 p8Var = (p8) f1Var.a;
            p8Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) u7Var.n1.get(i7 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                p8Var.setUser(j10.i(i10).f());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                p8Var.setUser(mp.u1(i10).c2(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                p8Var.a(0, mp.u1(i10).O0(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                p8Var.a(0, mp.u1(i10).O0(Long.valueOf(inputPeer.channel_id)));
            }
            p8Var.f.setVisibility(8);
            p8Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = u7Var.o1;
            if (inputPeer2 != null || i7 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? j10.i(u7Var.m1).e() : org.telegram.messenger.n5.n(inputPeer2)) != (z11 ? j10.i(u7Var.m1).e() : org.telegram.messenger.n5.n(inputPeer))) {
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

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        u7 u7Var = this.c;
        if (i7 == 0 || i7 == 1) {
            View view2 = new View(u7Var.getContext());
            view2.setLayoutParams(new v4.q0(-1, i7 == 0 ? (org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(306.0f) : org.telegram.messenger.g0.L(54.0f)));
            view = view2;
        } else {
            view = new p8(u7Var.getContext(), u7Var.J0);
        }
        return new kj0(view);
    }
}
