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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class w9 extends c1 {
    public static volatile w9[] h = new w9[4];
    public final androidx.activity.n a;
    public final LongSparseArray b;
    public final ArrayList c;
    public boolean d;
    public final LongSparseArray e;
    public final xe.b f;

    public w9(int i7) {
        super(i7);
        this.a = new androidx.activity.n(10);
        this.b = new LongSparseArray();
        this.c = new ArrayList();
        this.e = new LongSparseArray();
        this.f = new xe.b(false, true);
    }

    public static w9 c(int i7) {
        w9 w9Var;
        w9 w9Var2 = h[i7];
        if (w9Var2 != null) {
            return w9Var2;
        }
        synchronized (w9.class) {
            try {
                w9Var = h[i7];
                if (w9Var == null) {
                    w9[] w9VarArr = h;
                    w9 w9Var3 = new w9(i7);
                    w9VarArr[i7] = w9Var3;
                    w9Var = w9Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w9Var;
    }

    public final void a(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        t9 d = d(starGift.id);
        s9 s9Var = d.b;
        if (s9Var == null) {
            s9 s9Var2 = new s9(this.currentAccount, starGift, starGiftAuctionState, tL_StarGiftAuctionUserState);
            d.b = s9Var2;
            s9Var2.h = d.c;
        } else {
            s9Var.d = starGift;
            s9Var.a(starGiftAuctionState);
            s9 s9Var3 = d.b;
            s9Var3.e = tL_StarGiftAuctionUserState;
            s9Var3.h();
        }
        o();
        g(starGift.id);
    }

    public final s9 b(long j3) {
        t9 t9Var = (t9) this.b.get(j3);
        if (t9Var != null) {
            return t9Var.b;
        }
        return null;
    }

    public final t9 d(long j3) {
        LongSparseArray longSparseArray = this.b;
        t9 t9Var = (t9) longSparseArray.get(j3);
        if (t9Var != null) {
            return t9Var;
        }
        t9 t9Var2 = new t9(j3);
        longSparseArray.put(j3, t9Var2);
        return t9Var2;
    }

    public final void e(long j3, c20 c20Var) {
        s9 s9Var;
        t9 t9Var = (t9) this.b.get(j3);
        if (t9Var == null || (s9Var = t9Var.b) == null) {
            c20Var.a(null);
            return;
        }
        ArrayList arrayList = t9Var.g;
        if (arrayList != null && s9Var.e.acquired_count == arrayList.size()) {
            c20Var.a(t9Var.g);
            return;
        }
        TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
        tL_getStarGiftAuctionAcquiredGifts.gift_id = j3;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new d3.b(1), new n9(this, c20Var, t9Var));
    }

    public final void f(long j3, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        a(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        t9 t9Var = (t9) this.b.get(j3);
        if (t9Var == null || !t9Var.e) {
            return;
        }
        a4 a4Var = new a4(this, t9Var, j3, 11);
        t9Var.d = a4Var;
        g0.i3(a4Var, tL_StarGiftAuctionState.timeout * 1000);
    }

    public final void g(long j3) {
        Iterator it;
        s9 b10 = b(j3);
        androidx.activity.n nVar = this.a;
        Long valueOf = Long.valueOf(j3);
        synchronized (((HashMap) nVar.d)) {
            try {
                xe.b bVar = (xe.b) ((HashMap) nVar.d).get(valueOf);
                it = bVar != null ? bVar.iterator() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b10 == null || it == null) {
            return;
        }
        while (it.hasNext()) {
            ((v9) it.next()).c(b10);
        }
    }

    public final void h(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        s9 s9Var;
        t9 t9Var = (t9) this.b.get(tL_updateStarGiftAuctionState.gift_id);
        if (t9Var == null || (s9Var = t9Var.b) == null || !s9Var.a(tL_updateStarGiftAuctionState.state)) {
            return;
        }
        o();
        g(t9Var.a);
    }

    public final void i(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        s9 s9Var;
        t9 t9Var = (t9) this.b.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (t9Var == null || (s9Var = t9Var.b) == null) {
            return;
        }
        s9Var.e = tL_updateStarGiftAuctionUserState.user_state;
        s9Var.h();
        o();
        g(t9Var.a);
    }

    public final void j(long j3, c20 c20Var) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j3;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new d3.b(1), new r9(c20Var, 0));
    }

    public final void k(long j3, zh.k kVar, long j10, ii.g0 g0Var) {
        t9 t9Var = (t9) this.b.get(j3);
        if (t9Var == null || t9Var.f) {
            g0Var.a(Boolean.FALSE, null);
            return;
        }
        if (!bi.ea.y(this.currentAccount, false).e) {
            bi.ea.y(this.currentAccount, false).r(new l9(this, g0Var, j3, kVar, j10));
            return;
        }
        s9 s9Var = t9Var.b;
        boolean z9 = s9Var != null && s9Var.e.bid_amount > 0;
        t9Var.f = true;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
        tL_inputInvoiceStarGiftAuctionBid.gift_id = j3;
        tL_inputInvoiceStarGiftAuctionBid.bid_amount = j10;
        tL_inputInvoiceStarGiftAuctionBid.update_bid = z9;
        if (kVar != null) {
            long j11 = kVar.a;
            if (j11 == 0) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
            } else {
                tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().j1(j11);
            }
            tL_inputInvoiceStarGiftAuctionBid.message = kVar.c;
            tL_inputInvoiceStarGiftAuctionBid.hide_name = kVar.b;
        } else if (!z9) {
            tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
            tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
        getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new d3.b(1), new m9(this, g0Var, t9Var, tL_payments_getPaymentForm, 0));
    }

    public final s9 l(long j3, v9 v9Var) {
        androidx.activity.n nVar = this.a;
        Long valueOf = Long.valueOf(j3);
        synchronized (((HashMap) nVar.d)) {
            try {
                xe.b bVar = (xe.b) ((HashMap) nVar.d).get(valueOf);
                if (bVar == null) {
                    bVar = (xe.b) nVar.c;
                    if (bVar != null) {
                        nVar.c = bVar.h;
                        bVar.h = null;
                    } else {
                        bVar = new xe.b(false, nVar.b);
                    }
                    ((HashMap) nVar.d).put(valueOf, bVar);
                }
                bVar.add(v9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m(j3);
        return b(j3);
    }

    public final void m(long j3) {
        t9 d = d(j3);
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
        s9 s9Var = d.b;
        int i7 = 0;
        if (s9Var != null) {
            if (s9Var.f()) {
                i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = s9Var.f;
                if (tL_starGiftAuctionState != null) {
                    i7 = tL_starGiftAuctionState.version;
                }
            }
        }
        tL_getStarGiftAuctionState.version = i7;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new d3.b(1), new p9(this, j3));
    }

    public final void n(long j3, v9 v9Var) {
        androidx.activity.n nVar = this.a;
        Long valueOf = Long.valueOf(j3);
        synchronized (((HashMap) nVar.d)) {
            try {
                xe.b bVar = (xe.b) ((HashMap) nVar.d).get(valueOf);
                if (bVar != null) {
                    bVar.remove(v9Var);
                    if (bVar.isEmpty()) {
                        ((HashMap) nVar.d).remove(valueOf);
                        bVar.h = (xe.b) nVar.c;
                        nVar.c = bVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        t9 t9Var = (t9) this.b.get(j3);
        if (t9Var == null) {
            return;
        }
        t9Var.e = this.a.b(Long.valueOf(j3));
        a4 a4Var = t9Var.d;
        if (a4Var != null) {
            g0.r(a4Var);
            t9Var.d = null;
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
        for (int i7 = 0; i7 < size; i7++) {
            t9 t9Var = (t9) longSparseArray.valueAt(i7);
            s9 s9Var = t9Var.b;
            if (s9Var != null && !s9Var.f()) {
                s9 s9Var2 = t9Var.b;
                if (s9Var2.e.bid_amount > 0) {
                    arrayList.add(s9Var2);
                }
            }
        }
        List.-EL.sort(arrayList, Comparator$-CC.comparingInt(new bg.d(11)));
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((u9) it.next()).g(arrayList);
        }
        qs.f(this.currentAccount).k(qs.Q3, new Object[0]);
    }
}
