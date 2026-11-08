package bi;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class n0 {
    public static volatile n0[] m = new n0[4];
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
        for (int i7 = 0; i7 < 4; i7++) {
            n[i7] = new Object();
        }
    }

    public n0(int i7) {
        this.a = i7;
    }

    public static n0 g(int i7) {
        n0 n0Var;
        n0 n0Var2 = m[i7];
        if (n0Var2 != null) {
            return n0Var2;
        }
        synchronized (n[i7]) {
            try {
                n0Var = m[i7];
                if (n0Var == null) {
                    n0[] n0VarArr = m;
                    n0 n0Var3 = new n0(i7);
                    n0VarArr[i7] = n0Var3;
                    n0Var = n0Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n0Var;
    }

    public final boolean a(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = h(j3, false);
        return (h == null || (tL_starsRevenueStatus = h.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) ? false : true;
    }

    public final boolean b(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats j10 = j(j3, false);
        return (j10 == null || (tL_starsRevenueStatus = j10.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) ? false : true;
    }

    public final TL_stars.StarsAmount c(long j3) {
        TLRPC.TL_payments_starsRevenueStats h = h(j3, false);
        return h == null ? TL_stars.StarsAmount.ofStars(0L) : h.status.current_balance;
    }

    public final k0 d(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.g;
        k0 k0Var = (k0) hashMap.get(valueOf);
        if (k0Var != null) {
            return k0Var;
        }
        Long valueOf2 = Long.valueOf(j3);
        k0 k0Var2 = new k0(this.a, j3);
        hashMap.put(valueOf2, k0Var2);
        return k0Var2;
    }

    public final l0 e(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.h;
        l0 l0Var = (l0) hashMap.get(valueOf);
        if (l0Var != null) {
            return l0Var;
        }
        Long valueOf2 = Long.valueOf(j3);
        l0 l0Var2 = new l0(this.a, j3);
        hashMap.put(valueOf2, l0Var2);
        return l0Var2;
    }

    public final void f(Context context, long j3, long j10, c20 c20Var) {
        k0 k0Var = (k0) this.g.get(Long.valueOf(j3));
        if (k0Var != null) {
            ArrayList arrayList = k0Var.e;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i7)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i7)).bot_id == j10) {
                    c20Var.a((TL_payments.connectedBotStarRef) arrayList.get(i7));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, context, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i10 = this.a;
        getconnectedstarrefbot.peer = qp.s1(i10).j1(j3);
        getconnectedstarrefbot.bot = qp.s1(i10).o1(j10);
        int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(getconnectedstarrefbot, new f0(this, u1Var, j10, c20Var, 0));
        u1Var.i0 = true;
        u1Var.setOnCancelListener(new g0(this, sendRequest, 0));
        u1Var.r(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j3, boolean z9) {
        Long l10 = (Long) this.b.get(Long.valueOf(j3));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.c.get(Long.valueOf(j3));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z9) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
        int i7 = this.a;
        tL_payments_getStarsRevenueStats.peer = qp.s1(i7).j1(j3);
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new a0(this, j3, 0));
        return tL_payments_starsRevenueStats;
    }

    public final long i(long j3) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats j10 = j(j3, false);
        if (j10 == null || (tL_starsRevenueStatus = j10.status) == null || (starsAmount = tL_starsRevenueStatus.current_balance) == null) {
            return 0L;
        }
        return starsAmount.amount;
    }

    public final TLRPC.TL_payments_starsRevenueStats j(long j3, boolean z9) {
        Long l10 = (Long) this.d.get(Long.valueOf(j3));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.e.get(Long.valueOf(j3));
        if (l10 != null && System.currentTimeMillis() - l10.longValue() <= 300000 && !z9) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.k6.I.q();
        int i7 = this.a;
        tL_payments_getStarsRevenueStats.peer = qp.s1(i7).j1(j3);
        TLRPC.ChatFull N0 = qp.s1(i7).N0(-j3);
        ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getStarsRevenueStats, new a0(this, j3, 1), null, null, 0, N0 != null ? N0.stats_dc : ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final m0 k(long j3) {
        Long valueOf = Long.valueOf(j3);
        HashMap hashMap = this.f;
        m0 m0Var = (m0) hashMap.get(valueOf);
        if (m0Var != null) {
            return m0Var;
        }
        Long valueOf2 = Long.valueOf(j3);
        m0 m0Var2 = new m0();
        hashMap.put(valueOf2, m0Var2);
        return m0Var2;
    }

    public final void l(long j3) {
        m0 k10 = k(j3);
        boolean[] zArr = k10.d;
        for (int i7 = 0; i7 < 3; i7++) {
            if (!zArr[i7]) {
                k10.a[i7].clear();
                k10.c[i7] = null;
                zArr[i7] = false;
                k10.e[i7] = false;
                p(i7, j3);
            }
        }
    }

    public final boolean m(long j3) {
        return j(j3, false) != null;
    }

    public final void n() {
        if (this.i || this.j != null) {
            return;
        }
        this.i = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_bots.getAdminedBots(), new e0(this, 1));
    }

    public final void o() {
        if (this.k || this.l != null) {
            return;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new e0(this, 0));
    }

    public final void p(int i7, long j3) {
        m0 k10 = k(j3);
        boolean[] zArr = k10.d;
        if (zArr[i7] || k10.e[i7]) {
            return;
        }
        zArr[i7] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        int i10 = this.a;
        tL_payments_getStarsTransactions.peer = qp.s1(i10).j1(j3);
        tL_payments_getStarsTransactions.inbound = i7 == 1;
        tL_payments_getStarsTransactions.outbound = i7 == 2;
        String str = k10.c[i7];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new b0(i7, 0, j3, this, k10));
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long o4 = org.telegram.messenger.m5.o(tL_updateStarsRevenueStatus.peer);
        if (o4 >= 0) {
            TLRPC.TL_payments_starsRevenueStats h = h(o4, true);
            if (h != null) {
                h.status = tL_updateStarsRevenueStatus.status;
                qs.f(this.a).k(qs.C3, Long.valueOf(o4));
            }
            l(o4);
            return;
        }
        org.telegram.ui.zd zdVar = org.telegram.ui.zd.t1;
        if (zdVar == null || zdVar.p0 != org.telegram.messenger.m5.o(tL_updateStarsRevenueStatus.peer)) {
            return;
        }
        org.telegram.ui.zd zdVar2 = org.telegram.ui.zd.t1;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
        zdVar2.L(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
        org.telegram.ui.zd.t1.J();
    }

    public final void r(long j3) {
        Long l10 = (Long) this.b.get(Long.valueOf(j3));
        h(j3, l10 == null || System.currentTimeMillis() - l10.longValue() > 30000);
    }
}
