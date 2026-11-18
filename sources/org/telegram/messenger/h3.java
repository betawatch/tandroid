package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class h3 {
    public final mp a;
    public final ConnectionsManager b;

    public h3(int i7) {
        this.a = mp.u1(i7);
        this.b = ConnectionsManager.getInstance(i7);
    }

    public final void a(long j3, x10 x10Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.a.l1(j3);
        this.b.sendRequest(tL_premium_getBoostsStatus, new d3(x10Var, 0));
    }

    public final void b(long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, x10 x10Var) {
        g3 g3Var = new g3();
        mp mpVar = this.a;
        mpVar.B1(j3);
        g3Var.j = j3;
        g3Var.k = mpVar.O0(Long.valueOf(-j3));
        e3 e3Var = new e3(g3Var, tL_premium_boostsStatus, x10Var, 0);
        g1 g1Var = new g1(1, g3Var, x10Var);
        ConnectionsManager.getInstance(j10.t0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new bi.m1(g1Var, mp.u1(j10.t0), e3Var, 27));
    }
}
