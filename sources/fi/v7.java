package fi;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class v7 extends oj0 {
    public final /* synthetic */ w7 c;

    public v7(w7 w7Var) {
        this.c = w7Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f == 2;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.j1.size() + 2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        return i7 == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        w7 w7Var = this.c;
        int i10 = w7Var.i1;
        if (d1Var.f == 2) {
            r8 r8Var = (r8) d1Var.a;
            r8Var.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) w7Var.j1.get(i7 - 2);
            boolean z10 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z10) {
                r8Var.setUser(p10.i(i10).f());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                r8Var.setUser(qp.s1(i10).a2(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                r8Var.a(0, qp.s1(i10).M0(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                r8Var.a(0, qp.s1(i10).M0(Long.valueOf(inputPeer.channel_id)));
            }
            r8Var.f.setVisibility(8);
            r8Var.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = w7Var.k1;
            if (inputPeer2 != null || i7 != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? p10.i(w7Var.i1).e() : org.telegram.messenger.m5.n(inputPeer2)) != (z10 ? p10.i(w7Var.i1).e() : org.telegram.messenger.m5.n(inputPeer))) {
                    z9 = false;
                    r8Var.c(z9, false);
                    r8Var.setDivider(i7 != b() - 1);
                }
            }
            z9 = true;
            r8Var.c(z9, false);
            r8Var.setDivider(i7 != b() - 1);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        w7 w7Var = this.c;
        if (i7 == 0 || i7 == 1) {
            View view2 = new View(w7Var.getContext());
            view2.setLayoutParams(new v4.o0(-1, i7 == 0 ? (org.telegram.messenger.g0.q.y + org.telegram.messenger.g0.m) - org.telegram.messenger.g0.L(306.0f) : org.telegram.messenger.g0.L(54.0f)));
            view = view2;
        } else {
            view = new r8(w7Var.getContext(), w7Var.I0);
        }
        return new xi0(view);
    }
}
