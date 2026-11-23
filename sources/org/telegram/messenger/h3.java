package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class h3 {
    public final np a;
    public final ConnectionsManager b;

    public h3(int i7) {
        this.a = np.u1(i7);
        this.b = ConnectionsManager.getInstance(i7);
    }

    public final void a(long j3, y10 y10Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.a.l1(j3);
        this.b.sendRequest(tL_premium_getBoostsStatus, new d3(y10Var, 0));
    }

    public final void b(long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, y10 y10Var) {
        g3 g3Var = new g3();
        np npVar = this.a;
        npVar.B1(j3);
        g3Var.j = j3;
        g3Var.k = npVar.O0(Long.valueOf(-j3));
        e3 e3Var = new e3(g3Var, tL_premium_boostsStatus, y10Var, 0);
        g1 g1Var = new g1(1, g3Var, y10Var);
        ConnectionsManager.getInstance(k10.t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new bi.q1(g1Var, np.u1(k10.t0), e3Var, 27));
    }
}
