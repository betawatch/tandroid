package gi;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ r0(t0 t0Var, int i10) {
        this.a = i10;
        this.b = t0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                t0 t0Var = this.b;
                t0Var.q.dismiss();
                t0Var.q = null;
                t0Var.r = 0;
                if (tL_error == null) {
                    s0 s0Var = t0Var.h;
                    if (s0Var != null) {
                        s0Var.close();
                        break;
                    }
                } else {
                    t0Var.c.d0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                t0 t0Var2 = this.b;
                t0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = t0Var2.j;
                    if (arrayList == null) {
                        t0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    t0Var2.k = str;
                    t0Var2.l = peerLinkRequests.total_count;
                    t0Var2.n = str == null;
                    t0Var2.a();
                    s0 s0Var2 = t0Var2.h;
                    if (s0Var2 != null) {
                        s0Var2.l();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                t0 t0Var3 = this.b;
                if (tL_error2 == null) {
                    t0Var3.getClass();
                    break;
                } else {
                    t0Var3.c.d0(tL_error2, false);
                    break;
                }
        }
    }
}
