package ii;

import java.util.ArrayList;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ j0(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                l0 l0Var = this.b;
                l0Var.q.dismiss();
                l0Var.q = null;
                l0Var.r = 0;
                if (tL_error == null) {
                    k0 k0Var = l0Var.h;
                    if (k0Var != null) {
                        k0Var.close();
                        break;
                    }
                } else {
                    l0Var.c.f0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                l0 l0Var2 = this.b;
                l0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = l0Var2.j;
                    if (arrayList == null) {
                        l0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    l0Var2.k = str;
                    l0Var2.l = peerLinkRequests.total_count;
                    l0Var2.n = str == null;
                    l0Var2.a();
                    k0 k0Var2 = l0Var2.h;
                    if (k0Var2 != null) {
                        k0Var2.u();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                l0 l0Var3 = this.b;
                if (tL_error2 == null) {
                    l0Var3.getClass();
                    break;
                } else {
                    l0Var3.c.f0(tL_error2, false);
                    break;
                }
        }
    }
}
