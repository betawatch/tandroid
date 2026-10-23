package hi;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ q0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                s0 s0Var = this.b;
                s0Var.q.dismiss();
                s0Var.q = null;
                s0Var.r = 0;
                if (tL_error == null) {
                    r0 r0Var = s0Var.h;
                    if (r0Var != null) {
                        r0Var.close();
                        break;
                    }
                } else {
                    s0Var.c.f0(tL_error, false);
                    break;
                }
                break;
            case 1:
                TL_communities.PeerLinkRequests peerLinkRequests = (TL_communities.PeerLinkRequests) obj;
                s0 s0Var2 = this.b;
                s0Var2.m = false;
                if (peerLinkRequests != null) {
                    ArrayList arrayList = s0Var2.j;
                    if (arrayList == null) {
                        s0Var2.j = new ArrayList(peerLinkRequests.requests);
                    } else {
                        arrayList.addAll(peerLinkRequests.requests);
                    }
                    String str = peerLinkRequests.next_offset;
                    s0Var2.k = str;
                    s0Var2.l = peerLinkRequests.total_count;
                    s0Var2.n = str == null;
                    s0Var2.a();
                    r0 r0Var2 = s0Var2.h;
                    if (r0Var2 != null) {
                        r0Var2.q();
                        break;
                    }
                }
                break;
            default:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                s0 s0Var3 = this.b;
                if (tL_error2 == null) {
                    s0Var3.getClass();
                    break;
                } else {
                    s0Var3.c.f0(tL_error2, false);
                    break;
                }
        }
    }
}
