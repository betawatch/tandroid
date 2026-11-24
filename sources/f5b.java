// default package

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class f5b extends n39 {
    public final /* synthetic */ g5b c;

    public f5b(g5b g5bVar) {
        this.c = g5bVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 2;
    }

    @Override // w39
    public final int b() {
        return this.c.m1.size() + 2;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        return i == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        boolean z;
        g5b g5bVar = this.c;
        int i2 = g5bVar.l1;
        if (s49Var.f == 2) {
            x5b x5bVar = (x5b) s49Var.a;
            x5bVar.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) g5bVar.m1.get(i - 2);
            boolean z2 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z2) {
                x5bVar.setUser(y6c.h(i2).f());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                x5bVar.setUser(na7.q1(i2).V1(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                x5bVar.a(0, na7.q1(i2).K0(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                x5bVar.a(0, na7.q1(i2).K0(Long.valueOf(inputPeer.channel_id)));
            }
            x5bVar.f.setVisibility(8);
            x5bVar.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = g5bVar.n1;
            if (inputPeer2 != null || i != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? y6c.h(g5bVar.l1).e() : cf3.m(inputPeer2)) != (z2 ? y6c.h(g5bVar.l1).e() : cf3.m(inputPeer))) {
                    z = false;
                    x5bVar.c(z, false);
                    x5bVar.setDivider(i != b() - 1);
                }
            }
            z = true;
            x5bVar.c(z, false);
            x5bVar.setDivider(i != b() - 1);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        g5b g5bVar = this.c;
        if (i == 0 || i == 1) {
            view = new View(g5bVar.getContext());
            view.setLayoutParams(new e49(-1, i == 0 ? (gl.q.y + gl.m) - gl.L(306.0f) : gl.L(54.0f)));
        } else {
            view = new x5b(g5bVar.getContext(), g5bVar.J0);
        }
        return new y29(view);
    }
}
