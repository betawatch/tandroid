package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.LongSparseArray;
import j$.util.Comparator$-CC;
import j$.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q9 extends c1 {
    public static volatile q9[] h = new q9[4];
    public final androidx.activity.n a;
    public final LongSparseArray b;
    public final ArrayList c;
    public boolean d;
    public final LongSparseArray e;
    public final ue.b f;

    public q9(int i3) {
        super(i3);
        this.a = new androidx.activity.n(8);
        this.b = new LongSparseArray();
        this.c = new ArrayList();
        this.e = new LongSparseArray();
        this.f = new ue.b(false, true);
    }

    public static q9 c(int i3) {
        q9 q9Var;
        q9 q9Var2 = h[i3];
        if (q9Var2 != null) {
            return q9Var2;
        }
        synchronized (q9.class) {
            try {
                q9Var = h[i3];
                if (q9Var == null) {
                    q9[] q9VarArr = h;
                    q9 q9Var3 = new q9(i3);
                    q9VarArr[i3] = q9Var3;
                    q9Var = q9Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q9Var;
    }

    public final void a(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        n9 d = d(starGift.id);
        m9 m9Var = d.b;
        if (m9Var == null) {
            m9 m9Var2 = new m9(this.currentAccount, starGift, starGiftAuctionState, tL_StarGiftAuctionUserState);
            d.b = m9Var2;
            m9Var2.h = d.c;
        } else {
            m9Var.d = starGift;
            m9Var.a(starGiftAuctionState);
            m9 m9Var3 = d.b;
            m9Var3.e = tL_StarGiftAuctionUserState;
            m9Var3.h();
        }
        o();
        g(starGift.id);
    }

    public final m9 b(long j10) {
        n9 n9Var = (n9) this.b.get(j10);
        if (n9Var != null) {
            return n9Var.b;
        }
        return null;
    }

    public final n9 d(long j10) {
        LongSparseArray longSparseArray = this.b;
        n9 n9Var = (n9) longSparseArray.get(j10);
        if (n9Var != null) {
            return n9Var;
        }
        n9 n9Var2 = new n9(j10);
        longSparseArray.put(j10, n9Var2);
        return n9Var2;
    }

    public final void e(long j10, u10 u10Var) {
        m9 m9Var;
        n9 n9Var = (n9) this.b.get(j10);
        if (n9Var == null || (m9Var = n9Var.b) == null) {
            u10Var.a(null);
            return;
        }
        ArrayList arrayList = n9Var.g;
        if (arrayList != null && m9Var.e.acquired_count == arrayList.size()) {
            u10Var.a(n9Var.g);
            return;
        }
        TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
        tL_getStarGiftAuctionAcquiredGifts.gift_id = j10;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new c3.b(1), new h9(this, u10Var, n9Var));
    }

    public final void f(long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        a(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        n9 n9Var = (n9) this.b.get(j10);
        if (n9Var == null || !n9Var.e) {
            return;
        }
        a4 a4Var = new a4(this, n9Var, j10, 11);
        n9Var.d = a4Var;
        g0.i3(a4Var, tL_StarGiftAuctionState.timeout * 1000);
    }

    public final void g(long j10) {
        Iterator it;
        m9 b10 = b(j10);
        androidx.activity.n nVar = this.a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) nVar.d)) {
            try {
                ue.b bVar = (ue.b) ((HashMap) nVar.d).get(valueOf);
                it = bVar != null ? bVar.iterator() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b10 == null || it == null) {
            return;
        }
        while (it.hasNext()) {
            ((p9) it.next()).c(b10);
        }
    }

    public final void h(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        m9 m9Var;
        n9 n9Var = (n9) this.b.get(tL_updateStarGiftAuctionState.gift_id);
        if (n9Var == null || (m9Var = n9Var.b) == null || !m9Var.a(tL_updateStarGiftAuctionState.state)) {
            return;
        }
        o();
        g(n9Var.a);
    }

    public final void i(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        m9 m9Var;
        n9 n9Var = (n9) this.b.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (n9Var == null || (m9Var = n9Var.b) == null) {
            return;
        }
        m9Var.e = tL_updateStarGiftAuctionUserState.user_state;
        m9Var.h();
        o();
        g(n9Var.a);
    }

    public final void j(long j10, u10 u10Var) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j10;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new c3.b(1), new l9(u10Var, 0));
    }

    public final void k(long j10, ai.d0 d0Var, long j11, ai.r rVar) {
        n9 n9Var = (n9) this.b.get(j10);
        if (n9Var == null || n9Var.f) {
            rVar.a(Boolean.FALSE, null);
            return;
        }
        if (!ci.e9.y(this.currentAccount, false).e) {
            ci.e9.y(this.currentAccount, false).r(new f9(this, rVar, j10, d0Var, j11));
            return;
        }
        m9 m9Var = n9Var.b;
        boolean z10 = m9Var != null && m9Var.e.bid_amount > 0;
        n9Var.f = true;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
        tL_inputInvoiceStarGiftAuctionBid.gift_id = j10;
        tL_inputInvoiceStarGiftAuctionBid.bid_amount = j11;
        tL_inputInvoiceStarGiftAuctionBid.update_bid = z10;
        if (d0Var != null) {
            long j12 = d0Var.a;
            if (j12 == 0) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
            } else {
                tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().j1(j12);
            }
            tL_inputInvoiceStarGiftAuctionBid.message = d0Var.c;
            tL_inputInvoiceStarGiftAuctionBid.hide_name = d0Var.b;
        } else if (!z10) {
            tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
            tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
        getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new c3.b(1), new g9(this, rVar, n9Var, tL_payments_getPaymentForm, 0));
    }

    public final m9 l(long j10, p9 p9Var) {
        androidx.activity.n nVar = this.a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) nVar.d)) {
            try {
                ue.b bVar = (ue.b) ((HashMap) nVar.d).get(valueOf);
                if (bVar == null) {
                    bVar = (ue.b) nVar.c;
                    if (bVar != null) {
                        nVar.c = bVar.h;
                        bVar.h = null;
                    } else {
                        bVar = new ue.b(false, nVar.b);
                    }
                    ((HashMap) nVar.d).put(valueOf, bVar);
                }
                bVar.add(p9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m(j10);
        return b(j10);
    }

    public final void m(long j10) {
        n9 d = d(j10);
        d.e = true;
        a4 a4Var = d.d;
        if (a4Var != null) {
            g0.r(a4Var);
            d.d = null;
        }
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = d.a;
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        m9 m9Var = d.b;
        int i3 = 0;
        if (m9Var != null) {
            if (m9Var.f()) {
                i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = m9Var.f;
                if (tL_starGiftAuctionState != null) {
                    i3 = tL_starGiftAuctionState.version;
                }
            }
        }
        tL_getStarGiftAuctionState.version = i3;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new c3.b(1), new j9(this, j10));
    }

    public final void n(long j10, p9 p9Var) {
        androidx.activity.n nVar = this.a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) nVar.d)) {
            try {
                ue.b bVar = (ue.b) ((HashMap) nVar.d).get(valueOf);
                if (bVar != null) {
                    bVar.remove(p9Var);
                    if (bVar.isEmpty()) {
                        ((HashMap) nVar.d).remove(valueOf);
                        bVar.h = (ue.b) nVar.c;
                        nVar.c = bVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        n9 n9Var = (n9) this.b.get(j10);
        if (n9Var == null) {
            return;
        }
        n9Var.e = this.a.b(Long.valueOf(j10));
        a4 a4Var = n9Var.d;
        if (a4Var != null) {
            g0.r(a4Var);
            n9Var.d = null;
        }
    }

    public final void o() {
        SharedPreferences sharedPreferences = getMessagesController().e7;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastGiftAuctionTimeUpdate", System.currentTimeMillis()).apply();
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        LongSparseArray longSparseArray = this.b;
        int size = longSparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            n9 n9Var = (n9) longSparseArray.valueAt(i3);
            m9 m9Var = n9Var.b;
            if (m9Var != null && !m9Var.f()) {
                m9 m9Var2 = n9Var.b;
                if (m9Var2.e.bid_amount > 0) {
                    arrayList.add(m9Var2);
                }
            }
        }
        List.-EL.sort(arrayList, Comparator$-CC.comparingInt(new cg.d(11)));
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((o9) it.next()).g(arrayList);
        }
        hs.f(this.currentAccount).k(hs.Q3, new Object[0]);
    }
}
