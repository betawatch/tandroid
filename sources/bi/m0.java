package bi;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ke;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m0 {
    public static volatile m0[] m = new m0[4];
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
        for (int i10 = 0; i10 < 4; i10++) {
            n[i10] = new Object();
        }
    }

    public m0(int i10) {
        this.a = i10;
    }

    public static m0 g(int i10) {
        m0 m0Var;
        m0 m0Var2 = m[i10];
        if (m0Var2 != null) {
            return m0Var2;
        }
        synchronized (n[i10]) {
            try {
                m0Var = m[i10];
                if (m0Var == null) {
                    m0[] m0VarArr = m;
                    m0 m0Var3 = new m0(i10);
                    m0VarArr[i10] = m0Var3;
                    m0Var = m0Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m0Var;
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

    public final j0 d(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.g;
        j0 j0Var = (j0) hashMap.get(valueOf);
        if (j0Var != null) {
            return j0Var;
        }
        Long valueOf2 = Long.valueOf(j10);
        j0 j0Var2 = new j0(this.a, j10);
        hashMap.put(valueOf2, j0Var2);
        return j0Var2;
    }

    public final k0 e(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.h;
        k0 k0Var = (k0) hashMap.get(valueOf);
        if (k0Var != null) {
            return k0Var;
        }
        Long valueOf2 = Long.valueOf(j10);
        k0 k0Var2 = new k0(this.a, j10);
        hashMap.put(valueOf2, k0Var2);
        return k0Var2;
    }

    public final void f(Context context, long j10, long j11, Utilities.Callback callback) {
        j0 j0Var = (j0) this.g.get(Long.valueOf(j10));
        if (j0Var != null) {
            ArrayList arrayList = j0Var.e;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!((TL_payments.connectedBotStarRef) arrayList.get(i10)).revoked && ((TL_payments.connectedBotStarRef) arrayList.get(i10)).bot_id == j11) {
                    callback.run((TL_payments.connectedBotStarRef) arrayList.get(i10));
                    return;
                }
            }
        }
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(context, 3, null);
        TL_payments.getConnectedStarRefBot getconnectedstarrefbot = new TL_payments.getConnectedStarRefBot();
        int i11 = this.a;
        getconnectedstarrefbot.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        getconnectedstarrefbot.bot = MessagesController.getInstance(i11).getInputUser(j11);
        int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getconnectedstarrefbot, new e0(this, e2Var, j11, callback, 0));
        e2Var.i0 = true;
        e2Var.setOnCancelListener(new f0(this, sendRequest, 0));
        e2Var.r(200L);
    }

    public final TLRPC.TL_payments_starsRevenueStats h(long j10, boolean z10) {
        Long l4 = (Long) this.b.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.c.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.y6.I.q();
        int i10 = this.a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new z(this, j10, 0));
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
        Long l4 = (Long) this.d.get(Long.valueOf(j10));
        TLRPC.TL_payments_starsRevenueStats tL_payments_starsRevenueStats = (TLRPC.TL_payments_starsRevenueStats) this.e.get(Long.valueOf(j10));
        if (l4 != null && System.currentTimeMillis() - l4.longValue() <= 300000 && !z10) {
            return tL_payments_starsRevenueStats;
        }
        TLRPC.TL_payments_getStarsRevenueStats tL_payments_getStarsRevenueStats = new TLRPC.TL_payments_getStarsRevenueStats();
        tL_payments_getStarsRevenueStats.ton = true;
        tL_payments_getStarsRevenueStats.dark = org.telegram.ui.ActionBar.y6.I.q();
        int i10 = this.a;
        tL_payments_getStarsRevenueStats.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i10).getChatFull(-j10);
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsRevenueStats, new z(this, j10, 1), null, null, 0, chatFull != null ? chatFull.stats_dc : ConnectionsManager.DEFAULT_DATACENTER_ID, 1, true);
        return tL_payments_starsRevenueStats;
    }

    public final l0 k(long j10) {
        Long valueOf = Long.valueOf(j10);
        HashMap hashMap = this.f;
        l0 l0Var = (l0) hashMap.get(valueOf);
        if (l0Var != null) {
            return l0Var;
        }
        Long valueOf2 = Long.valueOf(j10);
        l0 l0Var2 = new l0();
        hashMap.put(valueOf2, l0Var2);
        return l0Var2;
    }

    public final void l(long j10) {
        l0 k10 = k(j10);
        boolean[] zArr = k10.d;
        for (int i10 = 0; i10 < 3; i10++) {
            if (!zArr[i10]) {
                k10.a[i10].clear();
                k10.c[i10] = null;
                zArr[i10] = false;
                k10.e[i10] = false;
                p(i10, j10);
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
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_bots.getAdminedBots(), new b0(this, 0));
    }

    public final void o() {
        if (this.k || this.l != null) {
            return;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new b0(this, 1));
    }

    public final void p(int i10, long j10) {
        l0 k10 = k(j10);
        boolean[] zArr = k10.d;
        if (zArr[i10] || k10.e[i10]) {
            return;
        }
        zArr[i10] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        int i11 = this.a;
        tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
        tL_payments_getStarsTransactions.inbound = i10 == 1;
        tL_payments_getStarsTransactions.outbound = i10 == 2;
        String str = k10.c[i10];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new d0(this, k10, i10, j10, 0));
    }

    public final void q(TL_update.TL_updateStarsRevenueStatus tL_updateStarsRevenueStatus) {
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer);
        if (peerDialogId >= 0) {
            TLRPC.TL_payments_starsRevenueStats h = h(peerDialogId, true);
            if (h != null) {
                h.status = tL_updateStarsRevenueStatus.status;
                NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(peerDialogId));
            }
            l(peerDialogId);
            return;
        }
        ke keVar = ke.t1;
        if (keVar == null || keVar.p0 != DialogObject.getPeerDialogId(tL_updateStarsRevenueStatus.peer)) {
            return;
        }
        ke keVar2 = ke.t1;
        TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = tL_updateStarsRevenueStatus.status;
        keVar2.L(tL_starsRevenueStatus.current_balance instanceof TL_stars.TL_starsTonAmount, tL_starsRevenueStatus);
        ke.t1.J();
    }

    public final void r(long j10) {
        Long l4 = (Long) this.b.get(Long.valueOf(j10));
        h(j10, l4 == null || System.currentTimeMillis() - l4.longValue() > 30000);
    }
}
