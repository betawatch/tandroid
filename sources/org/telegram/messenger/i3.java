package org.telegram.messenger;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class i3 {
    public final wp a;
    public final ConnectionsManager b;

    public i3(int i10) {
        this.a = wp.r1(i10);
        this.b = ConnectionsManager.getInstance(i10);
    }

    public final void a(long j10, r20 r20Var) {
        TL_stories.TL_premium_getBoostsStatus tL_premium_getBoostsStatus = new TL_stories.TL_premium_getBoostsStatus();
        tL_premium_getBoostsStatus.peer = this.a.i1(j10);
        this.b.sendRequest(tL_premium_getBoostsStatus, new f3(r20Var, 0));
    }

    public final void b(long j10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, r20 r20Var) {
        h3 h3Var = new h3();
        wp wpVar = this.a;
        wpVar.y1(j10);
        h3Var.j = j10;
        h3Var.k = wpVar.L0(Long.valueOf(-j10));
        g3 g3Var = new g3(h3Var, tL_premium_boostsStatus, r20Var, 0);
        j1 j1Var = new j1(1, h3Var, r20Var);
        ConnectionsManager.getInstance(e20.s0).sendRequest(new TL_stories.TL_premium_getMyBoosts(), new ag.p0(j1Var, wp.r1(e20.s0), g3Var, 6));
    }
}
