package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.d00;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vb(Object obj, long j3, boolean z10, int i7) {
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
                mc mcVar = (mc) obj;
                mcVar.A1 = j3;
                mcVar.z1 = j3;
                if (z10) {
                    fi.r0 r0Var = mcVar.B1;
                    r0Var.c = j3;
                    mcVar.C1.set(r0Var);
                }
                mcVar.N0();
                mcVar.E1.a(true, true);
                lc lcVar = mcVar.y1;
                if (lcVar != null) {
                    lcVar.setMyPrivacy(mcVar.z1);
                    break;
                }
                break;
            case 1:
                hi.f9 f9Var = (hi.f9) obj;
                hi.k9 k9Var = f9Var.a0;
                if (z10) {
                    int i12 = hi.k9.Y1;
                    mp.u1(k9Var.a).Z2(Long.valueOf(j3), new hi.x8(f9Var, j3, i10), ks.e3);
                    break;
                } else {
                    int i13 = hi.k9.Y1;
                    mp.u1(k9Var.a).b3(0, j3, true);
                    break;
                }
            case 2:
                li.j0 j0Var = (li.j0) obj;
                j0Var.i = null;
                j0Var.g.l(j3);
                ArrayList arrayList = j0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (org.telegram.messenger.n5.o(((TL_communities.CommunityPeerRequest) j0Var.j.get(size)).peer) == j3) {
                            j0Var.j.remove(size);
                        }
                    }
                }
                j0Var.a();
                li.i0 i0Var = j0Var.h;
                if (i0Var != null) {
                    i0Var.o();
                }
                mp u12 = mp.u1(j0Var.d);
                long j10 = j0Var.e;
                li.h0 h0Var = new li.h0(j0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = u12.j1(j10);
                tL_communities_togglePeerLinkRequestApproval.peer = u12.l1(j3);
                tL_communities_togglePeerLinkRequestApproval.reject = !z10;
                u12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new d3.b(i11), new org.telegram.messenger.o9(u12, j10, h0Var, 2));
                break;
            case 3:
                HashSet hashSet = ((xs) obj).y;
                if (z10) {
                    hashSet.add(Long.valueOf(j3));
                    break;
                } else {
                    hashSet.remove(Long.valueOf(j3));
                    break;
                }
            default:
                d00 d00Var = (d00) obj;
                d00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j3).apply();
                d00Var.a.l(j3);
                d00Var.b.l(j3);
                d00Var.d.delete(j3);
                d00Var.s.l(j3);
                TLRPC.Chat O0 = d00Var.getMessagesController().O0(Long.valueOf(j3));
                if (O0 != null && (O0.forum || O0.monoforum)) {
                    d00Var.n(0, j3, z10);
                }
                d00Var.y(j3, true);
                break;
        }
    }

    public /* synthetic */ vb(fs fsVar, boolean z10, long j3, int i7) {
        this.a = i7;
        this.d = fsVar;
        this.b = z10;
        this.c = j3;
    }
}
