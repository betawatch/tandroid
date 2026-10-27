package ii;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;

    public /* synthetic */ p0(r0 r0Var, int i10) {
        this.a = i10;
        this.b = r0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                r0 r0Var = this.b;
                r0Var.q.dismiss();
                r0Var.q = null;
                r0Var.r = 0;
                if (tL_error == null) {
                    q0 q0Var = r0Var.h;
                    if (q0Var != null) {
                        q0Var.close();
                        break;
                    }
                } else {
                    r0Var.c.g0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                r0 r0Var2 = this.b;
                r0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = r0Var2.j;
                    if (arrayList == null) {
                        r0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    r0Var2.k = str;
                    r0Var2.l = peerLinkRequests.total_count;
                    r0Var2.n = str == null;
                    r0Var2.a();
                    q0 q0Var2 = r0Var2.h;
                    if (q0Var2 != null) {
                        q0Var2.c();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                r0 r0Var3 = this.b;
                if (tL_error2 == null) {
                    r0Var3.getClass();
                    break;
                } else {
                    r0Var3.c.g0(tL_error2, false);
                    break;
                }
        }
    }
}
