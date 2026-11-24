// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jo2 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mo2 b;

    public /* synthetic */ jo2(mo2 mo2Var, byte b) {
        this.a = b;
        this.b = mo2Var;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        mo2 mo2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                mo2Var.q.dismiss();
                mo2Var.q = null;
                mo2Var.r = 0;
                if (tL_error == null) {
                    lo2 lo2Var = mo2Var.h;
                    if (lo2Var != null) {
                        lo2Var.close();
                        break;
                    }
                } else {
                    mo2Var.c.g0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                mo2Var.m = false;
                if (peerLinkRequests != null) {
                    mo2Var.j.addAll(peerLinkRequests.requests);
                    String str = peerLinkRequests.next_offset;
                    mo2Var.k = str;
                    mo2Var.l = peerLinkRequests.total_count;
                    mo2Var.n = str == null;
                    mo2Var.a();
                    lo2 lo2Var2 = mo2Var.h;
                    if (lo2Var2 != null) {
                        lo2Var2.U0();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null) {
                    mo2Var.c.g0(tL_error2, false);
                    break;
                }
                break;
        }
    }
}
