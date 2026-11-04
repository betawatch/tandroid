package ci;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c00;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.us;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cc(Object obj, long j10, boolean z10, int i3) {
        this.a = i3;
        this.d = obj;
        this.c = j10;
        this.b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = 0;
        int i11 = 1;
        boolean z10 = this.b;
        long j10 = this.c;
        Object obj = this.d;
        switch (i3) {
            case 0:
                tc tcVar = (tc) obj;
                tcVar.x1 = j10;
                tcVar.w1 = j10;
                if (z10) {
                    ei.u0 u0Var = tcVar.y1;
                    u0Var.c = j10;
                    tcVar.z1.set(u0Var);
                }
                tcVar.M0();
                tcVar.B1.a(true, true);
                sc scVar = tcVar.v1;
                if (scVar != null) {
                    scVar.setMyPrivacy(tcVar.w1);
                    break;
                }
                break;
            case 1:
                gi.o8 o8Var = (gi.o8) obj;
                gi.t8 t8Var = o8Var.a0;
                if (z10) {
                    int i12 = gi.t8.V1;
                    hp.s1(t8Var.a).T2(Long.valueOf(j10), new gi.e8(o8Var, j10, i10), hs.e3);
                    break;
                } else {
                    int i13 = gi.t8.V1;
                    hp.s1(t8Var.a).V2(0, j10, true);
                    break;
                }
            case 2:
                ji.i0 i0Var = (ji.i0) obj;
                i0Var.i = null;
                i0Var.g.l(j10);
                ArrayList arrayList = i0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (org.telegram.messenger.m5.o(((TL_communities.CommunityPeerRequest) i0Var.j.get(size)).peer) == j10) {
                            i0Var.j.remove(size);
                        }
                    }
                }
                i0Var.a();
                ji.h0 h0Var = i0Var.h;
                if (h0Var != null) {
                    h0Var.H0();
                }
                hp s12 = hp.s1(i0Var.d);
                long j11 = i0Var.e;
                ji.g0 g0Var = new ji.g0(i0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = s12.h1(j11);
                tL_communities_togglePeerLinkRequestApproval.peer = s12.j1(j10);
                tL_communities_togglePeerLinkRequestApproval.reject = !z10;
                s12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new c3.b(i11), new org.telegram.messenger.k9(s12, j11, g0Var, 2));
                break;
            case 3:
                HashSet hashSet = ((us) obj).y;
                if (z10) {
                    hashSet.add(Long.valueOf(j10));
                    break;
                } else {
                    hashSet.remove(Long.valueOf(j10));
                    break;
                }
            default:
                c00 c00Var = (c00) obj;
                c00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j10).apply();
                c00Var.a.l(j10);
                c00Var.b.l(j10);
                c00Var.d.delete(j10);
                c00Var.h.l(j10);
                TLRPC.Chat M0 = c00Var.getMessagesController().M0(Long.valueOf(j10));
                if (M0 != null && (M0.forum || M0.monoforum)) {
                    c00Var.n(0, j10, z10);
                }
                c00Var.y(j10, true);
                break;
        }
    }

    public /* synthetic */ cc(cs csVar, boolean z10, long j10, int i3) {
        this.a = i3;
        this.d = csVar;
        this.b = z10;
        this.c = j10;
    }
}
