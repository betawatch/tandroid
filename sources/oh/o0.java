package oh;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ o0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                q0 q0Var = this.b;
                q0Var.q.dismiss();
                q0Var.q = null;
                q0Var.r = 0;
                if (tL_error == null) {
                    p0 p0Var = q0Var.h;
                    if (p0Var != null) {
                        p0Var.close();
                        break;
                    }
                } else {
                    q0Var.c.d0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                q0 q0Var2 = this.b;
                q0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = q0Var2.j;
                    if (arrayList == null) {
                        q0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    q0Var2.k = str;
                    q0Var2.l = peerLinkRequests.total_count;
                    q0Var2.n = str == null;
                    q0Var2.a();
                    p0 p0Var2 = q0Var2.h;
                    if (p0Var2 != null) {
                        p0Var2.i();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                q0 q0Var3 = this.b;
                if (tL_error2 == null) {
                    q0Var3.getClass();
                    break;
                } else {
                    q0Var3.c.d0(tL_error2, false);
                    break;
                }
        }
    }
}
