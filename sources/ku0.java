// default package

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ku0 {
    public static volatile ku0[] m = new ku0[4];
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
        for (int i = 0; i < 4; i++) {
            n[i] = new Object();
        }
    }

    public ku0(int i) {
        this.a = i;
    }

    public static ku0 g(int i) {
        ku0 ku0Var;
        ku0 ku0Var2 = m[i];
        if (ku0Var2 != null) {
            return ku0Var2;
        }
        synchronized (n[i]) {
            ku0Var = m[i];
            if (ku0Var == null) {
                ku0[] ku0VarArr = m;
                ku0 ku0Var3 = new ku0(i);
                ku0VarArr[i] = ku0Var3;
                ku0Var = ku0Var3;
            }
        }
        return ku0Var;
    }

    public final boolean a(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats h = h(j, false);
        return (h == null || (tL_starsRevenueStatus = h.status) == null || (tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0 && tL_starsRevenueStatus.current_balance.amount <= 0)) ? false : true;
    }

    public final boolean b(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TLRPC.TL_payments_starsRevenueStats j2 = j(j, false);
        return (j2 == null || (tL_starsRevenueStatus = j2.status) == null || (tL_starsRevenueStatus.current_balance.amount <= 0 && tL_starsRevenueStatus.available_balance.amount <= 0 && tL_starsRevenueStatus.overall_revenue.amount <= 0)) ? false : true;
    }

    public final TL_stars.StarsAmount c(long j) {
        TLRPC.TL_payments_starsRevenueStats h = h(j, false);
        return h == null ? TL_stars.StarsAmount.ofStars(0L) : h.status.current_balance;
    }

    public final hu0 d(long j) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.g;
        hu0 hu0Var = (hu0) hashMap.get(valueOf);
        if (hu0Var != null) {
            return hu0Var;
        }
        Long valueOf2 = Long.valueOf(j);
        hu0 hu0Var2 = new hu0(this.a, j);
        hashMap.put(valueOf2, hu0Var2);
        return hu0Var2;
    }

    public final iu0 e(long j) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.h;
        iu0 iu0Var = (iu0) hashMap.get(valueOf);
        if (iu0Var != null) {
            return iu0Var;
        }
        Long valueOf2 = Long.valueOf(j);
        iu0 iu0Var2 = new iu0(this.a, j);
        hashMap.put(valueOf2, iu0Var2);
        return iu0Var2;
    }

    public final void f(Context context, long j, long j2, qac qacVar) {
        hu0 hu0Var = (hu0) this.g.get(Long.valueOf(j));
        byte b = 0;
        if (hu0Var != null) {
            ArrayList arrayList = hu0Var.e;
            for (int i = 0; i < arrayList.size(); i++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i)).bot_id == j2) {
                    qacVar.a((TL_payments.connectedBotStarRef) arrayList.get(i));
                    return;
                }
            }
        }
        he heVar = new he(3, null, context);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i2 = this.a;
        getconnectedstarrefbot.peer = oc7.r1(i2).i1(j);
        getconnectedstarrefbot.bot = oc7.r1(i2).n1(j2);
        int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(getconnectedstarrefbot, new eu0((Object) this, (Object) heVar, j2, (Object) qacVar, (byte) 0));
        heVar.j0 = true;
        heVar.setOnCancelListener(new fu0(this, sendRequest, b));
        heVar.q(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j, boolean z) {
        Long l = (Long) this.b.get(Long.valueOf(j));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.c.get(Long.valueOf(j));
        if (l != null && System.currentTimeMillis() - l.longValue() <= 300000 && !z) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = cmb.I.o();
        int i = this.a;
        tL_payments_getStarsRevenueStats.peer = oc7.r1(i).i1(j);
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new bu0(this, j, (byte) 0));
        return tL_payments_starsRevenueStats;
    }

    public final long i(long j) {
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus;
        TL_stars.StarsAmount starsAmount;
        TLRPC.TL_payments_starsRevenueStats j2 = j(j, false);
        if (j2 == null || (tL_starsRevenueStatus = j2.status) == null || (starsAmount = tL_starsRevenueStatus.current_balance) == null) {
            return 0L;
        }
        return starsAmount.amount;
    }

    public final TLRPC.TL_payments_starsRevenueStats j(long j, boolean z) {
        Long l = (Long) this.d.get(Long.valueOf(j));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.e.get(Long.valueOf(j));
        if (l != null && System.currentTimeMillis() - l.longValue() <= 300000 && !z) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        byte b = 1;
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = cmb.I.o();
        int i = this.a;
        tL_payments_getStarsRevenueStats.peer = oc7.r1(i).i1(j);
        TLRPC.ChatFull M0 = oc7.r1(i).M0(-j);
        ConnectionsManager.getInstance(i).sendRequest(tL_payments_getStarsRevenueStats, new bu0(this, j, b), null, null, 0, M0 != null ? M0.stats_dc : ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final ju0 k(long j) {
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.f;
        ju0 ju0Var = (ju0) hashMap.get(valueOf);
        if (ju0Var != null) {
            return ju0Var;
        }
        Long valueOf2 = Long.valueOf(j);
        ju0 ju0Var2 = new ju0();
        hashMap.put(valueOf2, ju0Var2);
        return ju0Var2;
    }

    public final void l(long j) {
        ju0 k = k(j);
        boolean[] zArr = k.d;
        for (int i = 0; i < 3; i++) {
            if (!zArr[i]) {
                k.a[i].clear();
                k.c[i] = null;
                zArr[i] = false;
                k.e[i] = false;
                p(i, j);
            }
        }
    }

    public final boolean m(long j) {
        return j(j, false) != null;
    }

    public final void n() {
        if (this.i || this.j != null) {
            return;
        }
        this.i = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_bots.getAdminedBots(), new du0(this, (byte) 1));
    }

    public final void o() {
        if (this.k || this.l != null) {
            return;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new du0(this, (byte) 0));
    }

    public final void p(int i, long j) {
        ju0 k = k(j);
        boolean[] zArr = k.d;
        if (zArr[i] || k.e[i]) {
            return;
        }
        zArr[i] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        int i2 = this.a;
        tL_payments_getStarsTransactions.peer = oc7.r1(i2).i1(j);
        tL_payments_getStarsTransactions.inbound = i == 1;
        tL_payments_getStarsTransactions.outbound = i == 2;
        String str = k.c[i];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(i2).sendRequest(tL_payments_getStarsTransactions, new mh((Object) this, (Object) k, i, j, (byte) 1));
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long n2 = pg3.n(tL_updateStarsRevenueStatus.peer);
        if (n2 >= 0) {
            TLRPC.TL_payments_starsRevenueStats h = h(n2, true);
            if (h != null) {
                h.status = tL_updateStarsRevenueStatus.status;
                nm7.f(this.a).k(nm7.E3, Long.valueOf(n2));
            }
            l(n2);
            return;
        }
        ik1 ik1Var = ik1.t1;
        if (ik1Var == null || ik1Var.p0 != pg3.n(tL_updateStarsRevenueStatus.peer)) {
            return;
        }
        ik1 ik1Var2 = ik1.t1;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
        ik1Var2.M(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
        ik1.t1.K();
    }

    public final void r(long j) {
        Long l = (Long) this.b.get(Long.valueOf(j));
        h(j, l == null || System.currentTimeMillis() - l.longValue() > 30000);
    }
}
