package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.dt;
import org.telegram.messenger.k00;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kd(Object obj, long j3, boolean z9, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = j3;
        this.b = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        int i11 = 1;
        boolean z9 = this.b;
        long j3 = this.c;
        Object obj = this.d;
        switch (i7) {
            case 0:
                ce ceVar = (ce) obj;
                ceVar.w1 = j3;
                ceVar.v1 = j3;
                if (z9) {
                    di.s0 s0Var = ceVar.x1;
                    s0Var.c = j3;
                    ceVar.y1.set(s0Var);
                }
                ceVar.M0();
                ceVar.A1.a(true, true);
                be beVar = ceVar.u1;
                if (beVar != null) {
                    beVar.setMyPrivacy(ceVar.v1);
                    break;
                }
                break;
            case 1:
                fi.n8 n8Var = (fi.n8) obj;
                fi.s8 s8Var = n8Var.W;
                if (z9) {
                    int i12 = fi.s8.U1;
                    qp.s1(s8Var.a).T2(Long.valueOf(j3), new fi.f8(n8Var, j3, i10), qs.e3);
                    break;
                } else {
                    int i13 = fi.s8.U1;
                    qp.s1(s8Var.a).V2(0, j3, true);
                    break;
                }
            case 2:
                ii.l0 l0Var = (ii.l0) obj;
                l0Var.i = null;
                l0Var.g.l(j3);
                ArrayList arrayList = l0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (org.telegram.messenger.m5.o(((TL_communities.CommunityPeerRequest) l0Var.j.get(size)).peer) == j3) {
                            l0Var.j.remove(size);
                        }
                    }
                }
                l0Var.a();
                ii.k0 k0Var = l0Var.h;
                if (k0Var != null) {
                    k0Var.u();
                }
                qp s12 = qp.s1(l0Var.d);
                long j10 = l0Var.e;
                ii.j0 j0Var = new ii.j0(l0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = s12.h1(j10);
                tL_communities_togglePeerLinkRequestApproval.peer = s12.j1(j3);
                tL_communities_togglePeerLinkRequestApproval.reject = !z9;
                s12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new d3.b(i11), new org.telegram.messenger.q9(s12, j10, j0Var, 2));
                break;
            case 3:
                HashSet hashSet = ((dt) obj).y;
                if (z9) {
                    hashSet.add(Long.valueOf(j3));
                    break;
                } else {
                    hashSet.remove(Long.valueOf(j3));
                    break;
                }
            default:
                k00 k00Var = (k00) obj;
                k00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j3).apply();
                k00Var.a.l(j3);
                k00Var.b.l(j3);
                k00Var.d.delete(j3);
                k00Var.h.l(j3);
                TLRPC.Chat M0 = k00Var.getMessagesController().M0(Long.valueOf(j3));
                if (M0 != null && (M0.forum || M0.monoforum)) {
                    k00Var.n(0, j3, z9);
                }
                k00Var.y(j3, true);
                break;
        }
    }

    public /* synthetic */ kd(ls lsVar, boolean z9, long j3, int i7) {
        this.a = i7;
        this.d = lsVar;
        this.b = z9;
        this.c = j3;
    }
}
