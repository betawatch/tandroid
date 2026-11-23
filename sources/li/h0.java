package li;

import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ h0(j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                j0 j0Var = this.b;
                j0Var.q.dismiss();
                j0Var.q = null;
                j0Var.r = 0;
                if (tL_error == null) {
                    i0 i0Var = j0Var.h;
                    if (i0Var != null) {
                        i0Var.close();
                        break;
                    }
                } else {
                    j0Var.c.g0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                j0 j0Var2 = this.b;
                j0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = j0Var2.j;
                    if (arrayList == null) {
                        j0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    j0Var2.k = str;
                    j0Var2.l = peerLinkRequests.total_count;
                    j0Var2.n = str == null;
                    j0Var2.a();
                    i0 i0Var2 = j0Var2.h;
                    if (i0Var2 != null) {
                        i0Var2.o();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                j0 j0Var3 = this.b;
                if (tL_error2 == null) {
                    j0Var3.getClass();
                    break;
                } else {
                    j0Var3.c.g0(tL_error2, false);
                    break;
                }
        }
    }
}
