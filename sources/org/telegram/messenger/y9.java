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
import org.telegram.ui.z70;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class y9 extends f1 {
    public static volatile y9[] h = new y9[4];
    public final androidx.activity.o a;
    public final LongSparseArray b;
    public final ArrayList c;
    public boolean d;
    public final LongSparseArray e;
    public final je.b f;

    public y9(int i10) {
        super(i10);
        this.a = new androidx.activity.o(2);
        this.b = new LongSparseArray();
        this.c = new ArrayList();
        this.e = new LongSparseArray();
        this.f = new je.b(false, true);
    }

    public static y9 c(int i10) {
        y9 y9Var;
        y9 y9Var2 = h[i10];
        if (y9Var2 != null) {
            return y9Var2;
        }
        synchronized (y9.class) {
            try {
                y9Var = h[i10];
                if (y9Var == null) {
                    y9[] y9VarArr = h;
                    y9 y9Var3 = new y9(i10);
                    y9VarArr[i10] = y9Var3;
                    y9Var = y9Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y9Var;
    }

    public final void a(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        v9 d = d(starGift.id);
        u9 u9Var = d.b;
        if (u9Var == null) {
            u9 u9Var2 = new u9(this.currentAccount, starGift, starGiftAuctionState, tL_StarGiftAuctionUserState);
            d.b = u9Var2;
            u9Var2.h = d.c;
        } else {
            u9Var.d = starGift;
            u9Var.a(starGiftAuctionState);
            u9 u9Var3 = d.b;
            u9Var3.e = tL_StarGiftAuctionUserState;
            u9Var3.h();
        }
        o();
        g(starGift.id);
    }

    public final u9 b(long j10) {
        v9 v9Var = (v9) this.b.get(j10);
        if (v9Var != null) {
            return v9Var.b;
        }
        return null;
    }

    public final v9 d(long j10) {
        LongSparseArray longSparseArray = this.b;
        v9 v9Var = (v9) longSparseArray.get(j10);
        if (v9Var != null) {
            return v9Var;
        }
        v9 v9Var2 = new v9(j10);
        longSparseArray.put(j10, v9Var2);
        return v9Var2;
    }

    public final void e(long j10, r20 r20Var) {
        u9 u9Var;
        v9 v9Var = (v9) this.b.get(j10);
        if (v9Var == null || (u9Var = v9Var.b) == null) {
            r20Var.a(null);
            return;
        }
        ArrayList arrayList = v9Var.g;
        if (arrayList != null && u9Var.e.acquired_count == arrayList.size()) {
            r20Var.a(v9Var.g);
            return;
        }
        TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
        tL_getStarGiftAuctionAcquiredGifts.gift_id = j10;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new a3.b(1), new p9(this, r20Var, v9Var));
    }

    public final void f(long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        a(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        v9 v9Var = (v9) this.b.get(j10);
        if (v9Var == null || !v9Var.e) {
            return;
        }
        d4 d4Var = new d4(this, v9Var, j10, 11);
        v9Var.d = d4Var;
        i0.h3(d4Var, tL_StarGiftAuctionState.timeout * 1000);
    }

    public final void g(long j10) {
        Iterator it;
        u9 b10 = b(j10);
        androidx.activity.o oVar = this.a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) oVar.d)) {
            try {
                je.b bVar = (je.b) ((HashMap) oVar.d).get(valueOf);
                it = bVar != null ? bVar.iterator() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (b10 == null || it == null) {
            return;
        }
        while (it.hasNext()) {
            ((x9) it.next()).c(b10);
        }
    }

    public final void h(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        u9 u9Var;
        v9 v9Var = (v9) this.b.get(tL_updateStarGiftAuctionState.gift_id);
        if (v9Var == null || (u9Var = v9Var.b) == null || !u9Var.a(tL_updateStarGiftAuctionState.state)) {
            return;
        }
        o();
        g(v9Var.a);
    }

    public final void i(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        u9 u9Var;
        v9 v9Var = (v9) this.b.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (v9Var == null || (u9Var = v9Var.b) == null) {
            return;
        }
        u9Var.e = tL_updateStarGiftAuctionUserState.user_state;
        u9Var.h();
        o();
        g(v9Var.a);
    }

    public final void j(long j10, r20 r20Var) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j10;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new a3.b(1), new t9(r20Var, 0));
    }

    public final void k(long j10, ph.l lVar, long j11, z70 z70Var) {
        v9 v9Var = (v9) this.b.get(j10);
        if (v9Var == null || v9Var.f) {
            z70Var.a(Boolean.FALSE, null);
            return;
        }
        if (!rh.e6.y(this.currentAccount, false).e) {
            rh.e6.y(this.currentAccount, false).r(new n9(this, z70Var, j10, lVar, j11));
            return;
        }
        u9 u9Var = v9Var.b;
        boolean z10 = u9Var != null && u9Var.e.bid_amount > 0;
        v9Var.f = true;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
        tL_inputInvoiceStarGiftAuctionBid.gift_id = j10;
        tL_inputInvoiceStarGiftAuctionBid.bid_amount = j11;
        tL_inputInvoiceStarGiftAuctionBid.update_bid = z10;
        if (lVar != null) {
            long j12 = lVar.a;
            if (j12 == 0) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
            } else {
                tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().i1(j12);
            }
            tL_inputInvoiceStarGiftAuctionBid.message = lVar.c;
            tL_inputInvoiceStarGiftAuctionBid.hide_name = lVar.b;
        } else if (!z10) {
            tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
            tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
        getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new a3.b(1), new o9(this, z70Var, v9Var, tL_payments_getPaymentForm, 0));
    }

    public final u9 l(long j10, x9 x9Var) {
        androidx.activity.o oVar = this.a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) oVar.d)) {
            try {
                je.b bVar = (je.b) ((HashMap) oVar.d).get(valueOf);
                if (bVar == null) {
                    bVar = (je.b) oVar.c;
                    if (bVar != null) {
                        oVar.c = bVar.h;
                        bVar.h = null;
                    } else {
                        bVar = new je.b(false, oVar.b);
                    }
                    ((HashMap) oVar.d).put(valueOf, bVar);
                }
                bVar.add(x9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m(j10);
        return b(j10);
    }

    public final void m(long j10) {
        v9 d = d(j10);
        d.e = true;
        d4 d4Var = d.d;
        if (d4Var != null) {
            i0.r(d4Var);
            d.d = null;
        }
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = d.a;
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        u9 u9Var = d.b;
        int i10 = 0;
        if (u9Var != null) {
            if (u9Var.f()) {
                i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = u9Var.f;
                if (tL_starGiftAuctionState != null) {
                    i10 = tL_starGiftAuctionState.version;
                }
            }
        }
        tL_getStarGiftAuctionState.version = i10;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new a3.b(1), new r9(this, j10));
    }

    public final void n(long j10, x9 x9Var) {
        androidx.activity.o oVar = this.a;
        Long valueOf = Long.valueOf(j10);
        synchronized (((HashMap) oVar.d)) {
            try {
                je.b bVar = (je.b) ((HashMap) oVar.d).get(valueOf);
                if (bVar != null) {
                    bVar.remove(x9Var);
                    if (bVar.isEmpty()) {
                        ((HashMap) oVar.d).remove(valueOf);
                        bVar.h = (je.b) oVar.c;
                        oVar.c = bVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        v9 v9Var = (v9) this.b.get(j10);
        if (v9Var == null) {
            return;
        }
        v9Var.e = this.a.b(Long.valueOf(j10));
        d4 d4Var = v9Var.d;
        if (d4Var != null) {
            i0.r(d4Var);
            v9Var.d = null;
        }
    }

    public final void o() {
        SharedPreferences sharedPreferences = getMessagesController().f7;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastGiftAuctionTimeUpdate", System.currentTimeMillis()).apply();
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        LongSparseArray longSparseArray = this.b;
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            v9 v9Var = (v9) longSparseArray.valueAt(i10);
            u9 u9Var = v9Var.b;
            if (u9Var != null && !u9Var.f()) {
                u9 u9Var2 = v9Var.b;
                if (u9Var2.e.bid_amount > 0) {
                    arrayList.add(u9Var2);
                }
            }
        }
        List.-EL.sort(arrayList, Comparator$-CC.comparingInt(new bi.t6(2)));
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((w9) it.next()).g(arrayList);
        }
        at.f(this.currentAccount).k(at.Q3, new Object[0]);
    }
}
