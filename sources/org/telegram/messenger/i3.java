package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i3 {
    public final vp a;
    public final ConnectionsManager b;

    public i3(int i10) {
        this.a = vp.r1(i10);
        this.b = ConnectionsManager.getInstance(i10);
    }

    public final void a(long j10, q20 q20Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.a.i1(j10);
        this.b.sendRequest(tL_premium_getBoostsStatus, new f3(q20Var, 0));
    }

    public final void b(long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, q20 q20Var) {
        h3 h3Var = new h3();
        vp vpVar = this.a;
        vpVar.y1(j10);
        h3Var.j = j10;
        h3Var.k = vpVar.L0(Long.valueOf(-j10));
        g3 g3Var = new g3(h3Var, tL_premium_boostsStatus, q20Var, 0);
        j1 j1Var = new j1(1, h3Var, q20Var);
        ConnectionsManager.getInstance(d20.s0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new ag.p0(j1Var, vp.r1(d20.s0), g3Var, 6));
    }
}
