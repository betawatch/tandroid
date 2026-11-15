package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.at;
import org.telegram.messenger.h00;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class sb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sb(Object obj, long j3, boolean z10, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = j3;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        int i10 = 0;
        int i11 = 1;
        boolean z10 = this.b;
        long j3 = this.c;
        Object obj = this.d;
        switch (i7) {
            case 0:
                jc jcVar = (jc) obj;
                jcVar.A1 = j3;
                jcVar.z1 = j3;
                if (z10) {
                    fi.s0 s0Var = jcVar.B1;
                    s0Var.c = j3;
                    jcVar.C1.set(s0Var);
                }
                jcVar.M0();
                jcVar.E1.a(true, true);
                ic icVar = jcVar.y1;
                if (icVar != null) {
                    icVar.setMyPrivacy(jcVar.z1);
                    break;
                }
                break;
            case 1:
                hi.l8 l8Var = (hi.l8) obj;
                hi.q8 q8Var = l8Var.a0;
                if (z10) {
                    int i12 = hi.q8.Y1;
                    np.s1(q8Var.a).T2(Long.valueOf(j3), new hi.d8(l8Var, j3, i10), ns.e3);
                    break;
                } else {
                    int i13 = hi.q8.Y1;
                    np.s1(q8Var.a).V2(0, j3, true);
                    break;
                }
            case 2:
                li.k0 k0Var = (li.k0) obj;
                k0Var.i = null;
                k0Var.g.l(j3);
                ArrayList arrayList = k0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (org.telegram.messenger.m5.o(((TL_communities.CommunityPeerRequest) k0Var.j.get(size)).peer) == j3) {
                            k0Var.j.remove(size);
                        }
                    }
                }
                k0Var.a();
                li.j0 j0Var = k0Var.h;
                if (j0Var != null) {
                    j0Var.I();
                }
                np s12 = np.s1(k0Var.d);
                long j10 = k0Var.e;
                li.i0 i0Var = new li.i0(k0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = s12.h1(j10);
                tL_communities_togglePeerLinkRequestApproval.peer = s12.j1(j3);
                tL_communities_togglePeerLinkRequestApproval.reject = !z10;
                s12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new d3.b(i11), new org.telegram.messenger.p9(s12, j10, i0Var, 2));
                break;
            case 3:
                HashSet hashSet = ((at) obj).y;
                if (z10) {
                    hashSet.add(Long.valueOf(j3));
                    break;
                } else {
                    hashSet.remove(Long.valueOf(j3));
                    break;
                }
            default:
                h00 h00Var = (h00) obj;
                h00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j3).apply();
                h00Var.a.l(j3);
                h00Var.b.l(j3);
                h00Var.d.delete(j3);
                h00Var.h.l(j3);
                TLRPC.Chat M0 = h00Var.getMessagesController().M0(Long.valueOf(j3));
                if (M0 != null && (M0.forum || M0.monoforum)) {
                    h00Var.n(0, j3, z10);
                }
                h00Var.y(j3, true);
                break;
        }
    }

    public /* synthetic */ sb(is isVar, boolean z10, long j3, int i7) {
        this.a = i7;
        this.d = isVar;
        this.b = z10;
        this.c = j3;
    }
}
