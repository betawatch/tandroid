package ci;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i0 {
    public static volatile i0[] m = new i0[4];
    public static final Object[] n = new Object[4];
    public final int a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public boolean i;
    public ArrayList j;
    public boolean k;
    public ArrayList l;

    static {
        for (int i3 = 0; i3 < 4; i3++) {
            n[i3] = new Object();
        }
    }

    public i0(int i3) {
        this.a = i3;
    }

    public static i0 g(int i3) {
        i0 i0Var;
        i0 i0Var2 = m[i3];
        if (i0Var2 != null) {
            return i0Var2;
        }
        synchronized (n[i3]) {
            try {
                i0Var = m[i3];
                if (i0Var == null) {
                    i0[] i0VarArr = m;
                    i0 i0Var3 = new i0(i3);
                    i0VarArr[i3] = i0Var3;
                    i0Var = i0Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i0Var;
    }

    public final boolean a(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = h(j10, false);
        return (h == null || (tL_starsRevenueStatus = h.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) ? false : true;
    }

    public final boolean b(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats j11 = j(j10, false);
        return (j11 == null || (tL_starsRevenueStatus = j11.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) ? false : true;
    }

    public final TL_stars.StarsAmount c(long j10) {
        TLRPC.TL_payments_starsRevenueStats h = h(j10, false);
        return h == null ? TL_stars.StarsAmount.ofStars(0L) : h.status.current_balance;
    }

    public final f0 d(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.g;
        f0 f0Var = (f0) hashMap.get(valueOf);
        if (f0Var != null) {
            return f0Var;
        }
        Long valueOf2 = Long.valueOf(j10);
        f0 f0Var2 = new f0(this.a, j10);
        hashMap.put(valueOf2, f0Var2);
        return f0Var2;
    }

    public final g0 e(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.h;
        g0 g0Var = (g0) hashMap.get(valueOf);
        if (g0Var != null) {
            return g0Var;
        }
        Long valueOf2 = Long.valueOf(j10);
        g0 g0Var2 = new g0(this.a, j10);
        hashMap.put(valueOf2, g0Var2);
        return g0Var2;
    }

    public final void f(Context context, long j10, long j11, u10 u10Var) {
        f0 f0Var = (f0) this.g.get(Long.valueOf(j10));
        if (f0Var != null) {
            ArrayList arrayList = f0Var.e;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i3)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i3)).bot_id == j11) {
                    u10Var.a((TL_payments.connectedBotStarRef) arrayList.get(i3));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, context, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i10 = this.a;
        getconnectedstarrefbot.peer = hp.s1(i10).j1(j10);
        getconnectedstarrefbot.bot = hp.s1(i10).o1(j11);
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbot, new a0(this, s1Var, j11, u10Var, 0));
        s1Var.j0 = true;
        s1Var.setOnCancelListener(new b0(this, sendRequest, 0));
        s1Var.r(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j10, boolean z10) {
        Long l10 = (Long) this.b.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.c.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
        int i3 = this.a;
        tL_payments_getStarsRevenueStats.peer = hp.s1(i3).j1(j10);
        ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsRevenueStats, new w(this, j10, 0));
        return tL_payments_starsRevenueStats;
    }

    public final long i(long j10) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats j11 = j(j10, false);
        if (j11 == null || (tL_starsRevenueStatus = j11.status) == null || (starsAmount = tL_starsRevenueStatus.current_balance) == null) {
            return 0L;
        }
        return starsAmount.amount;
    }

    public final TLRPC.TL_payments_starsRevenueStats j(long j10, boolean z10) {
        Long l10 = (Long) this.d.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.e.get(Long.valueOf(j10));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
        int i3 = this.a;
        tL_payments_getStarsRevenueStats.peer = hp.s1(i3).j1(j10);
        TLRPC.ChatFull N0 = hp.s1(i3).N0(-j10);
        ConnectionsManager.getInstance(i3).sendRequest(tL_payments_getStarsRevenueStats, new w(this, j10, 1), null, null, 0, N0 != null ? N0.stats_dc : ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final h0 k(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f;
        h0 h0Var = (h0) hashMap.get(valueOf);
        if (h0Var != null) {
            return h0Var;
        }
        Long valueOf2 = Long.valueOf(j10);
        h0 h0Var2 = new h0();
        hashMap.put(valueOf2, h0Var2);
        return h0Var2;
    }

    public final void l(long j10) {
        h0 k10 = k(j10);
        boolean[] zArr = k10.d;
        for (int i3 = 0; i3 < 3; i3++) {
            if (!zArr[i3]) {
                k10.a[i3].clear();
                k10.c[i3] = null;
                zArr[i3] = false;
                k10.e[i3] = false;
                p(i3, j10);
            }
        }
    }

    public final boolean m(long j10) {
        return j(j10, false) != null;
    }

    public final void n() {
        if (this.i || this.j != null) {
            return;
        }
        this.i = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_bots.getAdminedBots(), new z(this, 1));
    }

    public final void o() {
        if (this.k || this.l != null) {
            return;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new z(this, 0));
    }

    public final void p(int i3, long j10) {
        h0 k10 = k(j10);
        boolean[] zArr = k10.d;
        if (zArr[i3] || k10.e[i3]) {
            return;
        }
        zArr[i3] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        int i10 = this.a;
        tL_payments_getStarsTransactions.peer = hp.s1(i10).j1(j10);
        tL_payments_getStarsTransactions.inbound = i3 == 1;
        tL_payments_getStarsTransactions.outbound = i3 == 2;
        String str = k10.c[i3];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new x(i3, 0, j10, this, k10));
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long o10 = org.telegram.messenger.m5.o(tL_updateStarsRevenueStatus.peer);
        if (o10 >= 0) {
            TLRPC.TL_payments_starsRevenueStats h = h(o10, true);
            if (h != null) {
                h.status = tL_updateStarsRevenueStatus.status;
                hs.f(this.a).k(hs.C3, Long.valueOf(o10));
            }
            l(o10);
            return;
        }
        xd xdVar = xd.u1;
        if (xdVar == null || xdVar.q0 != org.telegram.messenger.m5.o(tL_updateStarsRevenueStatus.peer)) {
            return;
        }
        xd xdVar2 = xd.u1;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
        xdVar2.L(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
        xd.u1.J();
    }

    public final void r(long j10) {
        Long l10 = (Long) this.b.get(Long.valueOf(j10));
        h(j10, l10 == null || System.currentTimeMillis() - l10.longValue() > 30000);
    }
}
