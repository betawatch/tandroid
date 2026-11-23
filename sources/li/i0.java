package li;

import java.util.ArrayList;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ i0(k0 k0Var, int i7) {
        this.a = i7;
        this.b = k0Var;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                k0 k0Var = this.b;
                k0Var.q.dismiss();
                k0Var.q = null;
                k0Var.r = 0;
                if (tL_error == null) {
                    j0 j0Var = k0Var.h;
                    if (j0Var != null) {
                        j0Var.close();
                        break;
                    }
                } else {
                    k0Var.c.g0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                k0 k0Var2 = this.b;
                k0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = k0Var2.j;
                    if (arrayList == null) {
                        k0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    k0Var2.k = str;
                    k0Var2.l = peerLinkRequests.total_count;
                    k0Var2.n = str == null;
                    k0Var2.a();
                    j0 j0Var2 = k0Var2.h;
                    if (j0Var2 != null) {
                        j0Var2.F();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                k0 k0Var3 = this.b;
                if (tL_error2 == null) {
                    k0Var3.getClass();
                    break;
                } else {
                    k0Var3.c.g0(tL_error2, false);
                    break;
                }
        }
    }
}
