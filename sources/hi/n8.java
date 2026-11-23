package hi;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class n8 extends dk0 {
    public final /* synthetic */ o8 c;

    public n8(o8 o8Var) {
        this.c = o8Var;
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
        o8 o8Var = this.c;
        int i10 = o8Var.m1;
        if (f1Var.f == 2) {
            j9 j9Var = (j9) f1Var.a;
            j9Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) o8Var.n1.get(i7 - 2);
            boolean z11 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z11) {
                j9Var.setUser(i10.i(i10).f());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                j9Var.setUser(mp.u1(i10).c2(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                j9Var.a(0, mp.u1(i10).O0(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                j9Var.a(0, mp.u1(i10).O0(Long.valueOf(inputPeer.channel_id)));
            }
            j9Var.f.setVisibility(8);
            j9Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = o8Var.o1;
            if (inputPeer2 != null || i7 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? i10.i(o8Var.m1).e() : org.telegram.messenger.n5.n(inputPeer2)) != (z11 ? i10.i(o8Var.m1).e() : org.telegram.messenger.n5.n(inputPeer))) {
                    z10 = false;
                    j9Var.c(z10, false);
                    j9Var.setDivider(i7 != b() - 1);
                }
            }
            z10 = true;
            j9Var.c(z10, false);
            j9Var.setDivider(i7 != b() - 1);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        o8 o8Var = this.c;
        if (i7 == 0 || i7 == 1) {
            View view2 = new View(o8Var.getContext());
            view2.setLayoutParams(new v4.q0(-1, i7 == 0 ? (org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(306.0f) : org.telegram.messenger.g0.L(54.0f)));
            view = view2;
        } else {
            view = new j9(o8Var.getContext(), o8Var.J0);
        }
        return new mj0(view);
    }
}
