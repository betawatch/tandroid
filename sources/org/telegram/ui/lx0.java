package org.telegram.ui;

import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class lx0 {
    public final TLRPC.TL_premiumSubscriptionOption a;
    public int b;
    public long c;
    public long d;
    public long e;
    public c5.n f;
    public c5.m g;
    public int h;

    public lx0(TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption) {
        this.a = tL_premiumSubscriptionOption;
    }

    public final void a() {
        c5.n nVar = this.f;
        if (nVar != null && this.g == null) {
            ArrayList arrayList = nVar.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                c5.m mVar = (c5.m) obj;
                String str = ((c5.l) ((ArrayList) mVar.b.b).get(0)).d;
                int i11 = this.a.months;
                if (i11 != 12) {
                    Locale locale = Locale.ROOT;
                    if (str.equals("P" + i11 + "M")) {
                        this.g = mVar;
                        return;
                    }
                } else if (str.equals("P1Y")) {
                    this.g = mVar;
                    return;
                }
            }
        }
    }

    public final String b() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.a;
        if (useInvoiceBilling || tL_premiumSubscriptionOption.store_product == null) {
            return tL_premiumSubscriptionOption.currency;
        }
        if (this.f == null) {
            return "";
        }
        a();
        c5.m mVar = this.g;
        return mVar == null ? "" : ((c5.l) ((ArrayList) mVar.b.b).get(0)).c;
    }

    public final int c() {
        if (this.b == 0) {
            if (h() == 0) {
                return 0;
            }
            if (this.e != 0) {
                int i10 = (int) ((1.0d - (i() / this.e)) * 100.0d);
                this.b = i10;
                if (i10 == 0) {
                    this.b = -1;
                }
            }
        }
        return this.b;
    }

    public final String d() {
        return (BuildVars.useInvoiceBilling() || this.a.store_product == null) ? BillingController.getInstance().formatCurrency(g(), b()) : this.f == null ? "" : BillingController.getInstance().formatCurrency(g(), b(), 6);
    }

    public final String e() {
        return (BuildVars.useInvoiceBilling() || this.a.store_product == null) ? BillingController.getInstance().formatCurrency(h(), b()) : this.f == null ? "" : BillingController.getInstance().formatCurrency(h(), b(), 6);
    }

    public final String f() {
        return (BuildVars.useInvoiceBilling() || this.a.store_product == null) ? BillingController.getInstance().formatCurrency(i(), b()) : this.f == null ? "" : BillingController.getInstance().formatCurrency(i(), b(), 6);
    }

    public final long g() {
        boolean useInvoiceBilling = BuildVars.useInvoiceBilling();
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = this.a;
        if (useInvoiceBilling || tL_premiumSubscriptionOption.store_product == null) {
            return tL_premiumSubscriptionOption.amount;
        }
        if (this.f == null) {
            return 0L;
        }
        a();
        c5.m mVar = this.g;
        if (mVar == null) {
            return 0L;
        }
        return ((c5.l) ((ArrayList) mVar.b.b).get(0)).b;
    }

    public final long h() {
        if (this.c == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.c = g10 / this.a.months;
            }
        }
        return this.c;
    }

    public final long i() {
        if (this.d == 0) {
            long g10 = g();
            if (g10 != 0) {
                this.d = (long) ((g10 / this.a.months) * 12.0d);
            }
        }
        return this.d;
    }
}
