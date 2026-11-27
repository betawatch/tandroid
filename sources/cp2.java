// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class cp2 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fp2 b;

    public /* synthetic */ cp2(fp2 fp2Var, byte b) {
        this.a = b;
        this.b = fp2Var;
    }

    @Override // icc
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        fp2 fp2Var = this.b;
        switch (b) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                fp2Var.q.dismiss();
                fp2Var.q = null;
                fp2Var.r = 0;
                if (tL_error == null) {
                    ep2 ep2Var = fp2Var.h;
                    if (ep2Var != null) {
                        ep2Var.close();
                        break;
                    }
                } else {
                    fp2Var.c.g0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                fp2Var.m = false;
                if (peerLinkRequests != null) {
                    fp2Var.j.addAll(peerLinkRequests.requests);
                    String str = peerLinkRequests.next_offset;
                    fp2Var.k = str;
                    fp2Var.l = peerLinkRequests.total_count;
                    fp2Var.n = str == null;
                    fp2Var.a();
                    ep2 ep2Var2 = fp2Var.h;
                    if (ep2Var2 != null) {
                        ep2Var2.W();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (tL_error2 != null) {
                    fp2Var.c.g0(tL_error2, false);
                    break;
                }
                break;
        }
    }
}
