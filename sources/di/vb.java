package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.e00;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.xs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                hi.k8 k8Var = (hi.k8) obj;
                hi.p8 p8Var = k8Var.a0;
                if (z10) {
                    int i12 = hi.p8.Y1;
                    mp.u1(p8Var.a).Z2(Long.valueOf(j3), new hi.c8(k8Var, j3, i10), ks.e3);
                    break;
                } else {
                    int i13 = hi.p8.Y1;
                    mp.u1(p8Var.a).b3(0, j3, true);
                    break;
                }
            case 2:
                li.k0 k0Var = (li.k0) obj;
                k0Var.i = null;
                k0Var.g.l(j3);
                ArrayList arrayList = k0Var.j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (org.telegram.messenger.n5.o(((TL_communities.CommunityPeerRequest) k0Var.j.get(size)).peer) == j3) {
                            k0Var.j.remove(size);
                        }
                    }
                }
                k0Var.a();
                li.j0 j0Var = k0Var.h;
                if (j0Var != null) {
                    j0Var.F();
                }
                mp u12 = mp.u1(k0Var.d);
                long j10 = k0Var.e;
                li.i0 i0Var = new li.i0(k0Var, 2);
                TL_communities.TL_communities_togglePeerLinkRequestApproval tL_communities_togglePeerLinkRequestApproval = new TL_communities.TL_communities_togglePeerLinkRequestApproval();
                tL_communities_togglePeerLinkRequestApproval.community = u12.j1(j10);
                tL_communities_togglePeerLinkRequestApproval.peer = u12.l1(j3);
                tL_communities_togglePeerLinkRequestApproval.reject = !z10;
                u12.getConnectionsManager().sendRequestTyped(tL_communities_togglePeerLinkRequestApproval, new d3.b(i11), new org.telegram.messenger.o9(u12, j10, i0Var, 2));
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
                e00 e00Var = (e00) obj;
                e00Var.getUserConfig().k().edit().remove("topics_end_reached_" + j3).apply();
                e00Var.a.l(j3);
                e00Var.b.l(j3);
                e00Var.d.delete(j3);
                e00Var.s.l(j3);
                TLRPC.Chat O0 = e00Var.getMessagesController().O0(Long.valueOf(j3));
                if (O0 != null && (O0.forum || O0.monoforum)) {
                    e00Var.n(0, j3, z10);
                }
                e00Var.y(j3, true);
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
