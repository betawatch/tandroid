package ji;

import java.util.ArrayList;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ g0(i0 i0Var, int i3) {
        this.a = i3;
        this.b = i0Var;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                i0 i0Var = this.b;
                i0Var.q.dismiss();
                i0Var.q = null;
                i0Var.r = 0;
                if (tL_error == null) {
                    h0 h0Var = i0Var.h;
                    if (h0Var != null) {
                        h0Var.close();
                        break;
                    }
                } else {
                    i0Var.c.f0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                i0 i0Var2 = this.b;
                i0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = i0Var2.j;
                    if (arrayList == null) {
                        i0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    i0Var2.k = str;
                    i0Var2.l = peerLinkRequests.total_count;
                    i0Var2.n = str == null;
                    i0Var2.a();
                    h0 h0Var2 = i0Var2.h;
                    if (h0Var2 != null) {
                        h0Var2.H0();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                i0 i0Var3 = this.b;
                if (tL_error2 == null) {
                    i0Var3.getClass();
                    break;
                } else {
                    i0Var3.c.f0(tL_error2, false);
                    break;
                }
        }
    }
}
