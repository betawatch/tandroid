package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class h3 {
    public final mp a;
    public final ConnectionsManager b;

    public h3(int i7) {
        this.a = mp.u1(i7);
        this.b = ConnectionsManager.getInstance(i7);
    }

    public final void a(long j3, w10 w10Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.a.l1(j3);
        this.b.sendRequest(tL_premium_getBoostsStatus, new d3(w10Var, 0));
    }

    public final void b(long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, w10 w10Var) {
        g3 g3Var = new g3();
        mp mpVar = this.a;
        mpVar.B1(j3);
        g3Var.j = j3;
        g3Var.k = mpVar.O0(Long.valueOf(-j3));
        e3 e3Var = new e3(g3Var, tL_premium_boostsStatus, w10Var, 0);
        g1 g1Var = new g1(1, g3Var, w10Var);
        ConnectionsManager.getInstance(i10.t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new bi.q1(g1Var, mp.u1(i10.t0), e3Var, 27));
    }
}
