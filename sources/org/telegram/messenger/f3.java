package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class f3 {
    public final qp a;
    public final ConnectionsManager b;

    public f3(int i7) {
        this.a = qp.s1(i7);
        this.b = ConnectionsManager.getInstance(i7);
    }

    public final void a(long j3, c20 c20Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.a.j1(j3);
        this.b.sendRequest(tL_premium_getBoostsStatus, new c3(c20Var, 0));
    }

    public final void b(long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, c20 c20Var) {
        e3 e3Var = new e3();
        qp qpVar = this.a;
        qpVar.z1(j3);
        e3Var.j = j3;
        e3Var.k = qpVar.M0(Long.valueOf(-j3));
        d3 d3Var = new d3(e3Var, tL_premium_boostsStatus, c20Var, 0);
        g1 g1Var = new g1(1, e3Var, c20Var);
        ConnectionsManager.getInstance(p10.s0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new bi.f2(g1Var, qp.s1(p10.s0), d3Var, 24));
    }
}
