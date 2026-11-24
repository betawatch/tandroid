// default package

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class g7b extends q59 {
    public final /* synthetic */ h7b c;

    public g7b(h7b h7bVar) {
        this.c = h7bVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 2;
    }

    @Override // y59
    public final int b() {
        return this.c.m1.size() + 2;
    }

    @Override // y59
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        return i == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        boolean z;
        h7b h7bVar = this.c;
        int i2 = h7bVar.l1;
        if (u69Var.f == 2) {
            z7b z7bVar = (z7b) u69Var.a;
            z7bVar.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) h7bVar.m1.get(i - 2);
            boolean z2 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z2) {
                z7bVar.setUser(z8c.h(i2).f());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                z7bVar.setUser(oc7.r1(i2).W1(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                z7bVar.a(0, oc7.r1(i2).L0(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                z7bVar.a(0, oc7.r1(i2).L0(Long.valueOf(inputPeer.channel_id)));
            }
            z7bVar.f.setVisibility(8);
            z7bVar.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = h7bVar.n1;
            if (inputPeer2 != null || i != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? z8c.h(h7bVar.l1).e() : pg3.m(inputPeer2)) != (z2 ? z8c.h(h7bVar.l1).e() : pg3.m(inputPeer))) {
                    z = false;
                    z7bVar.c(z, false);
                    z7bVar.setDivider(i != b() - 1);
                }
            }
            z = true;
            z7bVar.c(z, false);
            z7bVar.setDivider(i != b() - 1);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        h7b h7bVar = this.c;
        if (i == 0 || i == 1) {
            view = new View(h7bVar.getContext());
            view.setLayoutParams(new g69(-1, i == 0 ? (gm.q.y + gm.m) - gm.L(306.0f) : gm.L(54.0f)));
        } else {
            view = new z7b(h7bVar.getContext(), h7bVar.J0);
        }
        return new b59(view);
    }
}
