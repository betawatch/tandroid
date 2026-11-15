package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class f3 {
    public final np a;
    public final ConnectionsManager b;

    public f3(int i7) {
        this.a = np.s1(i7);
        this.b = ConnectionsManager.getInstance(i7);
    }

    public final void a(long j3, z10 z10Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.a.j1(j3);
        this.b.sendRequest(tL_premium_getBoostsStatus, new c3(z10Var, 0));
    }

    public final void b(long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, z10 z10Var) {
        e3 e3Var = new e3();
        np npVar = this.a;
        npVar.z1(j3);
        e3Var.j = j3;
        e3Var.k = npVar.M0(Long.valueOf(-j3));
        d3 d3Var = new d3(e3Var, tL_premium_boostsStatus, z10Var, 0);
        g1 g1Var = new g1(1, e3Var, z10Var);
        ConnectionsManager.getInstance(m10.t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new bi.j6(g1Var, np.s1(m10.t0), d3Var, 25));
    }
}
