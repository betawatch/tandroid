package hi;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class s7 extends dk0 {
    public final /* synthetic */ t7 c;

    public s7(t7 t7Var) {
        this.c = t7Var;
    }

    @Override // org.telegram.ui.Components.dk0
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
        t7 t7Var = this.c;
        int i10 = t7Var.m1;
        if (f1Var.f == 2) {
            o8 o8Var = (o8) f1Var.a;
            o8Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) t7Var.n1.get(i7 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                o8Var.setUser(k10.i(i10).f());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                o8Var.setUser(np.u1(i10).c2(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                o8Var.a(0, np.u1(i10).O0(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                o8Var.a(0, np.u1(i10).O0(Long.valueOf(inputPeer.channel_id)));
            }
            o8Var.f.setVisibility(8);
            o8Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = t7Var.o1;
            if (inputPeer2 != null || i7 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? k10.i(t7Var.m1).e() : org.telegram.messenger.n5.n(inputPeer2)) != (z11 ? k10.i(t7Var.m1).e() : org.telegram.messenger.n5.n(inputPeer))) {
                    z10 = false;
                    o8Var.c(z10, false);
                    o8Var.setDivider(i7 != b() - 1);
                }
            }
            z10 = true;
            o8Var.c(z10, false);
            o8Var.setDivider(i7 != b() - 1);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        t7 t7Var = this.c;
        if (i7 == 0 || i7 == 1) {
            View view2 = new View(t7Var.getContext());
            view2.setLayoutParams(new v4.q0(-1, i7 == 0 ? (org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(306.0f) : org.telegram.messenger.g0.L(54.0f)));
            view = view2;
        } else {
            view = new o8(t7Var.getContext(), t7Var.J0);
        }
        return new mj0(view);
    }
}
