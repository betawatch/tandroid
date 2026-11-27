// default package

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class d9b extends c79 {
    public final /* synthetic */ e9b c;

    public d9b(e9b e9bVar) {
        this.c = e9bVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 2;
    }

    @Override // j79
    public final int b() {
        return this.c.m1.size() + 2;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        return i == 1 ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        boolean z;
        e9b e9bVar = this.c;
        int i2 = e9bVar.l1;
        if (f89Var.f == 2) {
            v9b v9bVar = (v9b) f89Var.a;
            v9bVar.d(true, true);
            TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) e9bVar.m1.get(i - 2);
            boolean z2 = inputPeer instanceof TLRPC.TL_inputPeerSelf;
            if (z2) {
                v9bVar.setUser(yac.h(i2).f());
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                v9bVar.setUser(uc7.s1(i2).X1(Long.valueOf(inputPeer.user_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                v9bVar.a(0, uc7.s1(i2).M0(Long.valueOf(inputPeer.chat_id)));
            } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                v9bVar.a(0, uc7.s1(i2).M0(Long.valueOf(inputPeer.channel_id)));
            }
            v9bVar.f.setVisibility(8);
            v9bVar.h.setVisibility(0);
            TLRPC.InputPeer inputPeer2 = e9bVar.n1;
            if (inputPeer2 != null || i != 2) {
                if ((inputPeer2 instanceof TLRPC.TL_inputPeerSelf ? yac.h(e9bVar.l1).e() : wf3.m(inputPeer2)) != (z2 ? yac.h(e9bVar.l1).e() : wf3.m(inputPeer))) {
                    z = false;
                    v9bVar.c(z, false);
                    v9bVar.setDivider(i != b() - 1);
                }
            }
            z = true;
            v9bVar.c(z, false);
            v9bVar.setDivider(i != b() - 1);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        e9b e9bVar = this.c;
        if (i == 0 || i == 1) {
            view = new View(e9bVar.getContext());
            view.setLayoutParams(new r79(-1, i == 0 ? (hl.q.y + hl.m) - hl.L(306.0f) : hl.L(54.0f)));
        } else {
            view = new v9b(e9bVar.getContext(), e9bVar.J0);
        }
        return new n69(view);
    }
}
